package baemin.view;

import java.util.ArrayList;

import baemin.exception.NotExistException;
import baemin.model.dto.BaeminCustomerInfo;
import net.sf.json.JSONArray;

public class EndView {

	// 모든 고객list출력
	public static void printAll(ArrayList<BaeminCustomerInfo> customerlist) {
		for (BaeminCustomerInfo v : customerlist) {
			if (v == null) {
				new NotExistException();
			}
			System.out.println(v);
		}
	}

	// 특정 프로젝트 출력
	public static void customerView(BaeminCustomerInfo info) {
		System.out.println(info);
	}

	// 예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}

	// 특정 등급 고객 출력
	public static void gradeView(BaeminCustomerInfo info) {
		System.out.println(info);
	}

	// 특정 등급 고객 모두 출력
	public static void allGradeView(ArrayList<BaeminCustomerInfo> customerlist) {
		for (BaeminCustomerInfo v : customerlist) {
			if (v == null) {
				new NotExistException();
			}
			System.out.println(v);
		}
	}

	// 모든 JSON 출력
	public static void jsonAllView(JSONArray jsonproject) {
		System.out.println(jsonproject);
	}

	// 개별 JSON 출력
	public static void jsonView(JSONArray jsonproject) {
		System.out.println(jsonproject);
	}

}
