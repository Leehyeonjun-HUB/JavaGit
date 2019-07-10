package step01.api;

public class APITest {

	//문자열의 첫번째 음절의 데이터만 반환 - String
	//두개의 숫자를 제공하면서 최대값 반환 - Math
	//문자열의 길이를 반환 - String
	/* String
	 * 길이를 반환 : 반환 -
	 *  public int length(){
	 *  	이 메소드를 보유한 해당 객체의 문자열 길이를 반환
	 *  }
	 */
	public static void main(String[] args) {
		//encore의 index는 0~5
		String data = "encore";
		System.out.println(data.charAt(0));
		System.out.println(data.charAt(1));
		
		//Math 객체 중요? max() 메소드 기능이 중요?
		System.out.println(Math.max(10, 20));
		System.out.println(data.length());
		
		String v = "삼";
	//	System.out.println(Integer.parseInt(v));
		
		
		/* "3" : String
		 *  -> int로 변환
		 *  발생되는 경우의 수
		 *  	1. 정상
		 *  		- 값 변환
		 *  	2. 비정상
		 *  		- 변환 불가능한 데이터를 받아서 변환 불가 
		 *  Integer
		 *  public static int parseInt(String v){
		 *  	v->int-> 반환
		 *  }
		 *  - static 메소드? non-static메소드?
		 *  
		 *  Byte
		 *  public static byte parseByte(String v){
		 *  	v->byte-> 반환
		 *  }
		 *  Float
		 *  public static float parseFloat(String v){
		 *  	v->float-> 반환
		 *  }
		 *  Double
		 *  public static double parseDouble(String v){
		 *  	v->double-> 반환
		 *  }
		 */
		
	}

}

/*
- 이 메소드는 반환타입과 parameter가 고정인 경우에 static으로 하면 ? 
public char charAt(int index){
	parameter 로 유입된 index에 위치한 한 음절만 해당 객체에 착출해서 반환
}
1. public static char charAt(int index){
	parameter 로 유입된 index에 위치한 한 음절만 해당 객체에 착출해서 반환
}
syso(String.charAt(9));


2. public char charAt(int index){
	parameter 로 유입된 index에 위치한 한 음절만 해당 객체엣 착출해서 반환
}
String s = "adae";
syso(s.charAt(2));

 */
