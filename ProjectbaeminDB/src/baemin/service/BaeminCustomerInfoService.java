package baemin.service;

import java.util.ArrayList;

import baemin.exception.Log4j;
import baemin.exception.NotExistException;
import baemin.model.BaeminVirtualDB;
import baemin.model.dto.BaeminCustomerInfo;
import baemin.model.dto.LastInfo;
import baemin.model.dto.NewInfo;
import baemin.model.dto.OrderInfo;
import net.sf.json.JSONArray;

public class BaeminCustomerInfoService {

	private static BaeminCustomerInfoService instance = new BaeminCustomerInfoService();
	private BaeminVirtualDB baeminVirtualData = BaeminVirtualDB.getInstance();
	Log4j FailM = new Log4j();

	private BaeminCustomerInfoService() {
	}

	public static BaeminCustomerInfoService getInstance() {
		return instance;
	}

	// 모든 고객list 반환
	public ArrayList<BaeminCustomerInfo> getAllList() {
		return baeminVirtualData.getCustomertList();

	}

	// 고객 검색
	public BaeminCustomerInfo getCustomerInfo2(String customerid) throws NotExistException {
		BaeminCustomerInfo info = getCustomerInfo(customerid);
		if (info == null) {
			FailM.getInstance().error("error try : 에러");
			throw new NotExistException("검색 요청하신 ID는 존재하지 않습니다.\n");

		}
		return info;
	}

	public BaeminCustomerInfo getCustomerInfo(String customerid) {
		BaeminCustomerInfo info = null;
		ArrayList<BaeminCustomerInfo> v = baeminVirtualData.getCustomertList();
		int count = v.size();
		for (int i = 0; i < count; i++) {
			if (v.get(i).getId().equals(customerid)) {
				info = v.get(i);
			}
		}
		return info;
	}

	// 고객 추가
	public void CustomerInsert(BaeminCustomerInfo info) {
		baeminVirtualData.insertCustomer(info);
	}

	// 고객 정보 수정 - 프로젝트 명으로 재능 기부자 수정
	public void customerUpdate(String customerid, OrderInfo orderinfo) throws NotExistException {
		BaeminCustomerInfo info = getCustomerInfo(customerid);
		if (info == null) {
			FailM.getInstance().error("error try : 에러");
			throw new NotExistException("xxxxxxx 수정하고자 하는 고객정보가 미 존재합니다. xxxxxxx\n");
		}
		if (orderinfo instanceof NewInfo) {
			info.setNewinfo((NewInfo) orderinfo);
		} else if (orderinfo instanceof LastInfo) {
			info.setLastinfo((LastInfo) orderinfo);
		} else {
			FailM.getInstance().error("error try : 에러");
			throw new NotExistException("xxxxxxx 수정하고자 하는 정보가 올바르지 않습니다. xxxxxxx\n");
		}
	}

	// 고객정보 삭제
	public void customerDelete(String customerid) throws NotExistException {
		BaeminCustomerInfo info = getCustomerInfo(customerid);
		if (info == null) {
			FailM.getInstance().error("error try : 에러");
			throw new NotExistException("xxxxxxx 삭제하고자 하는 고객정보가 미 존재합니다. xxxxxxx\n");
		}
		baeminVirtualData.getCustomertList().remove(info);
	}

	// 고객등급 추가
	public void insertCustomerGrade(ArrayList<BaeminCustomerInfo> customer) {
		ArrayList<BaeminCustomerInfo> v = baeminVirtualData.getCustomertList();
		int count = v.size();
		for (int i = 0; i < count; i++) {
			int number = v.get(i).getCustomerinfo().getAmount();
			if (number <= 5) {
				v.get(i).setGrade("Silver");
			} else if (number > 5 && number <= 10) {
				v.get(i).setGrade("Gold");
			} else if (number > 10 && number <= 15) {
				v.get(i).setGrade("VIP");
			} else if (number > 15) {
				v.get(i).setGrade("VVIP");
			}

		}
	}

	// 고객등급 검색
	public BaeminCustomerInfo searchGrade(String grade) throws NotExistException {
		ArrayList<BaeminCustomerInfo> v = baeminVirtualData.getCustomertList();
		BaeminCustomerInfo info = null;
		int count = v.size();
		for (int i = 0; i < count; i++) {
			if (v.get(i).getGrade().equals(grade)) {
				info = v.get(i);
			}
		}
		if (info == null) {
			FailM.getInstance().error("error try : 에러");
			throw new NotExistException("검색 요청하신 ID는 존재하지 않습니다.\n");
		}
		return info;
	}

	// 특정 등급 회원 모두 검색
	public ArrayList<BaeminCustomerInfo> searchAllGrade(String grade) throws NotExistException {
		ArrayList<BaeminCustomerInfo> v = baeminVirtualData.getCustomertList();
		ArrayList<BaeminCustomerInfo> v1 = baeminVirtualData.getGradeList();
		BaeminCustomerInfo info = null;
		int count = v.size();
		for (int i = 0; i < count; i++) {
			if (v.get(i).getGrade().equals(grade)) {
				info = v.get(i);
				baeminVirtualData.getGradeList().add(info);
			}
		}
		if (info == null) {
			FailM.getInstance().error("error try : 에러");
			throw new NotExistException("검색 요청하신 ID는 존재하지 않습니다.\n");
		}
		return v1;
	}

	// 모두 JSON 변환
	public JSONArray jsonAllCast() {
		return JSONArray.fromObject(baeminVirtualData.getCustomertList());
	}

	// 개별 JSON 변환
	public JSONArray jsonCast(String customerid) throws NotExistException {
		BaeminCustomerInfo info = getCustomerInfo(customerid);
		if (info == null) {
			FailM.getInstance().error("error try : 에러");
			throw new NotExistException("xxxxxxx 변환하고자 하는 고객정보가 미 존재합니다. xxxxxxx\n");
		}

		return JSONArray.fromObject(info);
	}

}
