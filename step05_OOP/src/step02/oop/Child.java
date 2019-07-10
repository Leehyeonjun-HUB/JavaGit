//코드로 보는 자바의 상속 관계
/* 필수 암기 사항
 * 1. 객체 생성 - instance
 * 	: heap이라는 메모리에 사용 가능하게 멤버 변수들 생성
 * 2. Parent 생성자 실행 완료
 * 	: Parent 객체 생성, name와  age변수를 사용 가능하게 생성 
 * 3. Child는 Parent 상속
 * 
 */

package step02.oop;

class Parent extends Object{
	String name;
	int age;
	
	Parent(){
		super() ;
		System.out.println("부모");
	}
	void printAll() {
		System.out.println(name.toString());
		System.out.println(age);
	}
}
public class Child extends Parent{
	String job;
	public Child() {
		super();
		System.out.println("자식");
	}
	
	//재정의 overriding/override     (상속을 받았으나 내용수정을 하는 것)
	void printAll() { 
		super.printAll();
		System.out.println(job);
	}
	
	static Object returnString() {//Object o = "string"; 객체 타입간의 자동 형변환
		return "string";
	}
	
	public static void main(String[] args) {
		String data = (String)returnString();
		
		Child c = new Child();
		c.name = "이현준";
		c.age = 25;
		c.job = "막강 파워 it man";
		c.printAll();
		
		//상위 타입이 하위 타입 수용 - 다형성
		Parent p = new Child();
		p.name = "자식맨";
		p.age = 10;
		//p.job = "it";
		Child c2 = (Child)p;//객체 타입간의 형변환(명시적인 형변환)
		c2.job = "it";
				//new 없이도 객체 생성 : ""/{값1, 값2,..}
		
		
		Object p22 = new Child();
		Parent p2 = (Parent)p22;
		p2.name = "자식맨";
		p2.age = 10;
		//p.job = "it";
		Child c22 = (Child)p;
		c22.job = "it";
		
		
	}
}


