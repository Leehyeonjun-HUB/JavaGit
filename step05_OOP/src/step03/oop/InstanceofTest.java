/* 학습내용
 * 1. 연산식
 * 	- 객체 타입 비교 연산식
 *  - 제약조건
 *  	: 상속 관계의 다형성 형식에 적용
 *  	: 연관이 없는 관계는 타입 비교 의미 없음
 * 2. 상속이 성립되면 다형성 객체 생성
 * 
 */

package step03.oop;

class A{}
class B extends A{}
class C extends A{}

public class InstanceofTest {

	//? B타입인 경우와 C 타입인 경우에 처리 로직이 일부 다르게 구현된 메소드인 경우
	public void m(A data) {//m(new A()); m(new B()); m(new C());
		//...
		if(data instanceof A) {
			//A로직에 한해서 처리 
		}else if(data instanceof B) {
			//B만의 로직으로 처리
		}else if(data instanceof C) {
			//C만의 로직으로 처리
		}else {
			//다른 타입인 경우에 처리 
		}
		//모든 타입 공통로직
	}
	
	public void m2(C data) {//m(new A()); m(new B()); m(new C());
		//...
		if(data instanceof A) {
			//A로직에 한해서 처리 
		}else if(data instanceof B) {
			//B만의 로직으로 처리
		}else if(data instanceof C) {
			//C만의 로직으로 처리
		}else {
			//다른 타입인 경우에 처리 
		}
		//모든 타입 공통로직
	}	
			
			
			
	
	
	public static void main(String[] args) {
		A a1 = new B();                      
		A a2 = new C();
		
		System.out.println(a2 instanceof A);//true
		System.out.println(a2 instanceof B);//f
		System.out.println(a2 instanceof C);//t
		
		System.out.println(a1 instanceof A);//true
		System.out.println(a1 instanceof B);//t
		System.out.println(a1 instanceof C);//false
		
		System.out.println("================");
		B b = new B();
		System.out.println(b instanceof A);//t
		System.out.println(b instanceof B);//t
		//System.out.println(b instanceof C);//오류
	}
	
}

