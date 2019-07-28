package baemin.model;

import java.util.ArrayList;

import baemin.model.dto.BaeminCustomerInfo;
import baemin.model.dto.CustomerInfo;
import baemin.model.dto.LastInfo;
import baemin.model.dto.NewInfo;

public class BaeminVirtualDB {

	private static BaeminVirtualDB instance = new BaeminVirtualDB();
	private ArrayList<BaeminCustomerInfo> customerList = new ArrayList<BaeminCustomerInfo>();
	private ArrayList<BaeminCustomerInfo> gradeList = new ArrayList<BaeminCustomerInfo>();

	public BaeminVirtualDB() {
		customerList.add(new BaeminCustomerInfo("encore1",
				new NewInfo("01012345678", "BBQ 계양구점", "양념치킨", "인천", "빠른배송"),
				new LastInfo("01012345678", "또래오래 봉천점", "후라이드치킨", "서울", "카드결제"),
				new CustomerInfo("짜장왕", "이현준", "서울특별시 관악구", 3), null));

		customerList.add(new BaeminCustomerInfo("encore2", 
				new NewInfo("01056781234", "오향족발 부천점", "족발", "부천", "안전배송"),
				new LastInfo("01056781234", "원할머니보쌈 부천점", "보쌈", "서울", "계좌이체"),
				new CustomerInfo("짬뽕왕", "김종성", "경기도 부천시", 8), null));

		customerList.add(new BaeminCustomerInfo("encore3", 
				new NewInfo("01078945612", "코바코 부산점", "돈까스", "부산", "김치추가"),
				new LastInfo("01078945612", "어사출또 부산점", "회", "부산", "휴대폰결제"),
				new CustomerInfo("탕수육왕", "임꺽정", "부산광역시 중구", 7), null));

		customerList.add(new BaeminCustomerInfo("encore4",
				new NewInfo("01078495162", "화통삼", "삼겹살", "강릉", "단무지추가"),
				new LastInfo("01078495162", "착한초밥", "초밥", "강릉", "휴대폰결제"), 
				new CustomerInfo("울면왕", "김삿갓", "강원도 강릉시", 12),null));
	}

	public static BaeminVirtualDB getInstance() {
		return instance;
	}

	public ArrayList<BaeminCustomerInfo> getCustomertList() {
		return customerList;
	}

	public void insertCustomer(BaeminCustomerInfo newcustomer) {
		customerList.add(newcustomer);
	}

	public ArrayList<BaeminCustomerInfo> getGradeList() {
		return gradeList;
	}

	public void insertGradeList(BaeminCustomerInfo newcustomer) {
		gradeList.add(newcustomer);
	}

}
