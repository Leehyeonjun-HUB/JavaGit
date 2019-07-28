package baemin.view;

import baemin.controller.BaeminController;
import baemin.model.BaeminVirtualDB;
import baemin.model.dto.BaeminCustomerInfo;
import baemin.model.dto.CustomerInfo;
import baemin.model.dto.LastInfo;
import baemin.model.dto.NewInfo;

public class StartView {

	public static void main(String[] args) {

		BaeminVirtualDB db = BaeminVirtualDB.getInstance();
		BaeminController controller = BaeminController.getInstance();

		// 새로운 주문내용
		NewInfo customer1 = new NewInfo("01074125896", "코바코 천안점", "돈까스", "천안", "신속배달");
		// 지난 최근 주문 내용
		LastInfo customer11 = new LastInfo("01074125896", "메밀꽃 필 무렵에", "막국수", "천안", "배민카드결제");
		// 새로운 고객 정보
		CustomerInfo customer111 = new CustomerInfo("볶음왕", "홍길동", "충청도 천안시", 27);
		// 새로운 고객 정보 리스트
		BaeminCustomerInfo newCustomer = new BaeminCustomerInfo("encore5", customer1, customer11, customer111, null);

		System.out.println("***** 0. 고객 등급 설정 기준*****");
		System.out.println("--- 0~5 Silver ---");
		System.out.println("--- 6~10 Gold ---");
		System.out.println("--- 11~15 VIP ---");
		System.out.println("--- 16이상 VVIP ---");
		System.out.println();

		// 모든 고객정보 검색
		System.out.println("***** 1. 고객정보 생성 후 모든 고객정보 검색(등급미포함) *****");
		controller.customerAllList();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("***** 1 - 1. 고객정보 생성 후 모든 고객정보 검색 *****");
		controller.gradeInsert(db.getCustomertList());
		controller.customerAllList();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// 새로운 고객정보 저장
		System.out.println("***** 2. 새로운 고객정보 저장 후  모든 고객정보 검색 *****");
		controller.insertCustomer(newCustomer);
		controller.gradeInsert(db.getCustomertList());
		controller.customerAllList();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// 존재하는 고객정보 검색
		System.out.println("***** 3. 존재하는 고객정보 검색 *****");
		controller.viewCustomer("encore3");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("***** 4. 미존재하는 고객정보 검색 - 예외처리 확인용 *****");
		controller.viewCustomer("슈바이처 ---");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// 존재하는 고객정보 업데이트 test
		System.out.println("***** 5. 존재하는 고객정보 수정 후 수정한 고객정보 검색 *****");
		controller.updateCustomer("encore1", new NewInfo("01036985214", "BBQ 계양구점", "양념치킨", "인천", "빠른배송"));
		controller.viewCustomer("encore1");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// 미 존재하는 고객정보 업데이트 test : 예외 발생
		System.out.println("***** 6. 미존재하는 고객정보 수정 - 예외처리 확인용 *****");
		controller.updateCustomer("마더테레사--", new NewInfo("01036985214", "또래오래 봉천점", "양념치킨", "인천", "빠른배송"));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// 모든 고객정보 검색 또는 삭제한 고객정보 검색
		System.out.println("***** 7. 정보 삭제 후 해당 고객정보 검색 *****");
		controller.deleteCustomer("encore5");
		controller.viewCustomer("encore5");
		System.out.println();

		System.out.println("***** 8. JSON 변환 후 고객정보 검색 *****");
		controller.allCastJson();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("***** 9. 개별 JSON 변환 후 고객정보 검색 *****");
		controller.CastJson("encore2");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("***** 10. 잘못된 정보 JSON 변환 *****");
		System.out.println();
		controller.CastJson("ensdkf");

		System.out.println("***** 11. 특정 등급 고객 출력 *****");
		System.out.println();
		System.out.println();
		controller.gradePrint("Silver");
		System.out.println();
		System.out.println();

		System.out.println("***** 12. 특정 등급 고객 모두 출력 *****");
		System.out.println();
		System.out.println();
		controller.allGradePrint("Gold");
	}

}
