package model.domain;

public class Player {
    private String name;
    private String position;
    private int backno;
	
	public Player() {}

	public Player(String name, String position, int backno) {
	
		this.name = name;
		this.position = position;
		this.backno = backno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public int getBackno() {
		return backno;
	}


	public void setBackno(int backno) {
		if(backno > 0) {
			this.backno = backno;
		}else {
		    System.out.println("존재하지 않는 등번호입니다");
	    }
	}

	public String toString() {
		return name + " " + position + " " + backno;
	}
	
	
}

