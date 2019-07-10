package step02.oop;

class Parent3 extends Object{
	String name;
	int age;
	
	Parent3(){
		super();
	}
	
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Child3 extends Parent3{
	String job;
	
	public Child3() {
		super();
	}
	
	void printAll() {//virtual method invocation
		super.printAll();
		System.out.println(job);
	}	
	//다형성 적용된 메소드
	static Object m() {
		return "string"; 
	}
	static Object m2() {
		return "string,int,double,boolean"; 
	}
	
	public static void main(String[] args) {
		Parent3 p = new Child3();
		p.printAll();
		//String v = (String)m();
		//System.out.println(v.charAt(5));     //g라는 글자 출력
		System.out.println(((String)m()).charAt(5));
		
		//?m2() 반환값을, 를 기준으로(구분자) 하나의 배열에 4개의 데이터가 저장되는 구조로 변환
		/* 작업단계
		 * 메소드의 반환값 받음 -> String 변환 -> String[] 배열로 변환
		 */
		
		String[] all = ((String)m2()).split(",");
		for(String v : all) {
			System.out.println(v);
		
		} 
		//?m2() 반환값을, 를 기준으로(구분자) 하나의 배열에 4개의 데이터가 저장되는 구조로 변환
		/* 작업단계
		 * 메소드의 반환값 받음 -> String 변환 -> String[] 배열로 변환
		 * charAt()/length()/split()
		 * ? split()로 구분된 문자열들을 char [] 생성해서 저장
		 * 첫번째 index에 저장된 string이라는 문자열을 char 배열 생성해서 배열에 저장하기
		 */
		System.out.println("**String[]의 첫번째 데이터로 char[]로 변환하기");
		String data = all[0];//string
		int size = data.length();
		System.out.println("문자열의 length : " + size);//6
		
		char [] cArray = new char[size];//6  0~5까지의 index 배열
		for(int i=0; i < cArray.length; i++) {
			cArray[i] = data.charAt(i);
		}
		System.out.println("**char[]의 데이터 출력해 보기**");
		for(char v : cArray) {
			System.out.println(v + "\t");
		}
		
		
	}
}



