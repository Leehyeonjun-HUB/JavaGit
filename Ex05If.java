/* 구조
 * 1. Ex04의 주석 참조
 * 2. 로직 별 개별 메소드, 단 이 클래스에는 멤버 변수는 존재하지 않음
 *  - 멤버 변수가 없다는 것은 객체 생성 의미가 없음
 *  - 따라서 모든 메소드는 static으로 객체 생성없이도 호출 가능한 문법으로 개발
 * 3. 구현 & 호출
 *  - static 반환타입 메소드 ([...]){[..]}
 *  - 호출
 *     1. 동일한 클래스의 메소드
 *         메소드명([..]);
 *         클래스명.메소드명([..]);
 *     
 *     2. 외부 클래스의 메소드
 *         클래스명.메소드명([..]);
 * 4. 조건식 문법 학습
 *  - test 데이터(변수) 구성
 *  1. 타입을 활용
 *     1. 기본타입
 *     2. 참조타입(객체타입, object타입, reference타입)
 *         - String 타입
 *         - java.lang.String
 *         - java.lang만 유일하게 import 없이도 사용 가능
 *         - 값 비교시 String 클래스내에 equals() 메소드 존재
 *            public boolean equals(String data){
 *                이 메소드 보유하고 있는 String 객체의 내용값과 parameter값 비교
 *                동일하면 true
 *                다른 경우 false
 *            }
 *  2. 비교  조건
 *      동등비교? 대소비교? ..
 */


package step01;

public class Ex05If {
	//parameter로 유입되는 데이터로 메소드 내부에 선언된 로컬 변수값과 비교해서 boolean 반환
	static boolean idCheck(String id) {
		String admin = "admin";
		if(admin.equals(id)) {
			return true;
		}else {
			return false;
		}
	}		
	//비교 조건값 admin/admin2
	static boolean idCheck2(String id) {
		String admin = "admin";
		if(admin.equals(id)) {
			return true;
		}else if("admin2".equals(id))  {
			return true;
		}else {
			return false;
		}
	}	
	
	
	public static void main(String[] args) {
		System.out.println(idCheck("m"));//false
		System.out.println(idCheck2("admin"));//true
		
		/*//step1
		String data = "encore";
		String data2 = "encore";
		boolean r = data.equals(data2);
		System.out.println(r); */
		
		//step02
		String data = "encore";
		String data2 = "encore";
		System.out.println(data.equals(data2));
		
		//step03
		System.out.println("encore".equals("encore"));
	}

}



