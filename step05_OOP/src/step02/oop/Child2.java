/* 과제 내용
 * 1. 오늘 학습한 상속, 다형성 review
 * 2. 이해한 범위내에서 메소드 하나 추가 개발 
 */
package step02.oop;

class Parent2 extends Object {
	String name;
	String color;
	int size;

	Parent2() {
		super();
		System.out.println("부모");
	}

	void printAll() {
		System.out.println(name.toString());
		System.out.println(size);
		System.out.println(color);
	}
	
	void changeColor() {
		
	}

}

public class Child2 extends Parent2 {
	String type;

	public Child2() {
		super();
		System.out.println("자식");
	}

	// 재정의 overriding/override (상속을 받았으나 내용수정을 하는 것)
	void printAll() {
		super.printAll();
		System.out.println(type);
	}

	void changeColor() {
		super.changeColor();
		System.out.println("색깔을 파란색으로 변경한다");
	}

	static Object returnString() {// Object o = "string"; 객체 타입간의 자동 형변환
		return "string";
	}

	public static void main(String[] args) {
		String data = (String) returnString();

		Child2 c = new Child2();
		c.name = "cloth";
		c.size = 105;
		c.color = "black";
		c.type = "shirt";
		c.printAll();
		c.changeColor();

	}
}
