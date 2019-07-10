package api;

import java.util.ArrayList;

import model.domain.Customer;

public class ArrayListTest {

	public static void main(String[] args) {
		//String : 문자열 -> Customer : id/pw/grade
		ArrayList al = new ArrayList();
		al.add("string");//index 0번째 자동저장
		al.add(new Customer("tester", "77", "vvip"));//index 1
		al.add("a");
		al.add("b");
		al.add("c");
		String s = (String)al.get(0);   
		System.out.println(s);
		
		
		System.out.println(al.size());//저장된 실제 데이터 개수 확인 가능환 메소드
		System.out.println(al.get(0));//string
		al.remove(0);
		System.out.println(al.get(0));//Customer(id=tester, pw=77, grade=vvip)
		
		System.out.println("---------------------");
		//제네릭 반영해서 ArrayList 저장 데이터 타입 제한
		ArrayList<String> al2 = new ArrayList<>();//String만 저장 가능한 ArrayList
		al2.add("an");
		al2.add("b");
		al2.add("c");
		al2.add("d");
	//	al2.add(new Customer()); 오류
		String v = al2.get(0);
			
		
		//wrapper class[autoboxing, unboxing]
		//기본값을 포장해서 객체화 하는 구조이기 때문에 wrapper
		/* 기본 8가지의 도우미 클래스 : java.lang package에 내장된 클래스들
		 * int : Integer
		 * byte : Byte */
		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(3);//al3.add(new Integer(3)); 
		al3.add(new Integer(10));
		
		/* = ( (Integer)al3.get(1) ).intValue(); */
		int i3 = al3.get(1);
		System.out.println(i3);
	}
}
/* 질문
 * 1. ArrayList 객체 생성 - 메모리 생성
 * 2. public boolean add(Object o){} 
 * 	- 저장 메소드
 *  - index 0부터 순차적으로 저장, 데이터의 구분 또한 배열처럼 index
 * 3. public Object get(int index){}   
 * 	 - 반환 메소드
 * 4. public boolean remove(Object o){}
 *    public Object remove(int index){}
 * 	- 삭제
 * 
 */
