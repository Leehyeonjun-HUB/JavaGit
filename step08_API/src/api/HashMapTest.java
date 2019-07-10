package api;

import java.util.HashMap;

import java.util.ArrayList;
import model.domain.Customer;

public class HashMapTest {
	public static ArrayList<String> get1() {
		ArrayList<String> al2 = new ArrayList<>();//String만 저장 가능한 ArrayList
		al2.add("a");
		return al2;
	}
	public static ArrayList get2() {
		ArrayList<String> al2 = new ArrayList<>();//String만 저장 가능한 ArrayList
		al2.add("a");
		return al2;
	}
	
	public static void main(String[] args) {
		ArrayList v11 = get2();
		String v21 = (String)v11.get(0);
		//String v211 = v11.get(0);  오류
		
		ArrayList<String> v31 = get2();
		String v41 = v31.get(0);
		
		ArrayList v1 = get1();
		String v2 = (String)v1.get(0);
		
		ArrayList<String> v3 = get1();
		String v4 = v3.get(0);
		
		
		//key는 String타입, value도 String
		HashMap<String, String> m = new HashMap<>();
		//저장
		m.put("a", "data1");
		m.put("b", "data2");
		m.put("a", "data3");
		System.out.println(m);
		
		System.out.println(m.get("a")); //data3
		m.remove("b"); //data2 삭제
		System.out.println(m.get("b"));//null
		
		//key는 String타입, value는 Customer
		//key는 Customer의 id로 합시다
		HashMap<String, Customer> m2 = new HashMap<>();
		m2.put("k1", new Customer("tester", "11", "vvip"));
		System.out.println(m2.get("k1").getGrade());
		
		ArrayList<String> al2 = new ArrayList<>();//String만 저장 가능한 ArrayList
		al2.add("a");
		al2.add("b");
		al2.add("c");
		al2.add("d");
		
		HashMap<String, ArrayList> m3 = new HashMap<>();
		m3.put("al2", al2);
		System.out.println(m3.get("al2").get(2));//c
		
		HashMap<String, HashMap> m4 = new HashMap<>();
		m4.put("m3", m3);
		System.out.println( ( (ArrayList) m4.get("m3").get("al2") ).get(2));
	}
}
/* 
 * 1. key value 매핑 구조로 데이터 관리하는 자료구조 학습
 * 2. java.util.Map interface를 구현하는 모든 클래스들은 key와 value 구조
 */


