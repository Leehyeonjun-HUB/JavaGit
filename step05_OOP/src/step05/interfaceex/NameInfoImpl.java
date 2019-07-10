package step05.interfaceex;

public class NameInfoImpl implements NameInfo{   
	
	public String getName() {
		return "이현준";
	}

	public static void main(String[] args) {
		// 다형성
		NameInfo n = new NameInfoImpl();
		System.out.println(n.getName());
	}

}
