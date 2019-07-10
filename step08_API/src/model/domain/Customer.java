package model.domain;

import lombok.Data;

@Data
public class Customer {
	private String id;
	private String pw;
	private String grade;
	
	public Customer(String id, String pw, String grade) {
		super();
		this.id = id;
		this.pw = pw;
		this.grade = grade;
	}
}

/* ¹®ÀÚ¿­ - id/pw/grade
 * grade - vvip/vip/silver
 */
