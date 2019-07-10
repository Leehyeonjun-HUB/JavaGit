/* ���� ����
 * 1. ���� �н��� ���, ������ review
 * 2. ������ ���������� �޼ҵ� �ϳ� �߰� ���� 
 */
package step02.oop;

class Parent2 extends Object {
	String name;
	String color;
	int size;

	Parent2() {
		super();
		System.out.println("�θ�");
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
		System.out.println("�ڽ�");
	}

	// ������ overriding/override (����� �޾����� ��������� �ϴ� ��)
	void printAll() {
		super.printAll();
		System.out.println(type);
	}

	void changeColor() {
		super.changeColor();
		System.out.println("������ �Ķ������� �����Ѵ�");
	}

	static Object returnString() {// Object o = "string"; ��ü Ÿ�԰��� �ڵ� ����ȯ
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
