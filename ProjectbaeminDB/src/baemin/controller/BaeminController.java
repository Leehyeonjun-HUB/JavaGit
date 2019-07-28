package baemin.controller;

import java.util.ArrayList;

import baemin.exception.NotExistException;
import baemin.model.dto.BaeminCustomerInfo;
import baemin.model.dto.OrderInfo;
import baemin.service.BaeminCustomerInfoService;
import baemin.view.EndView;
import baemin.view.FailView;

public class BaeminController {

	private static BaeminController instance = new BaeminController();
	private BaeminCustomerInfoService service = BaeminCustomerInfoService.getInstance();

	private BaeminController() {
	}

	public static BaeminController getInstance() {
		return instance;
	}

	// 모든 고객list 출력 명령
	public void customerAllList() {
		EndView.printAll(service.getAllList());
	}

	// 특정 고객 검색
	public void viewCustomer(String customerid) {
		try {
			EndView.customerView(service.getCustomerInfo2(customerid));
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}

	}

	// 새로운 고객 저장
	public void insertCustomer(BaeminCustomerInfo newCustomer) {
		service.CustomerInsert(newCustomer);
	}

	// 존재하는 고객 수정
	public void updateCustomer(String customerid, OrderInfo info) {
		try {
			service.customerUpdate(customerid, info);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

	// 모든 고객 삭제
	public void deleteCustomer(String customerid) {
		try {
			service.customerDelete(customerid);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

	// 모든 JSON 출력 명령
	public void allCastJson() {
		EndView.jsonAllView(service.jsonAllCast());
	}

	// 개별 JSON 출력 명령
	public void CastJson(String customerid) {
		try {
			EndView.jsonView(service.jsonCast(customerid));
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

	// 고객 등급 추가 명령
	public void gradeInsert(ArrayList<BaeminCustomerInfo> customer) {
		service.insertCustomerGrade(customer);
	}

	// 고객 등급 출력 명령

	public void gradePrint(String grade) {
		try {
			EndView.gradeView(service.searchGrade(grade));
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

	// 고객 등급 모두 출력 명령
	public void allGradePrint(String grade) {
		try {
			EndView.allGradeView(service.searchAllGrade(grade));
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

}
