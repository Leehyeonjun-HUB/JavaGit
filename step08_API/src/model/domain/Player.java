package model.domain;

import lombok.Data;

@Data
public class Player {
	private String team;
	private String name;
	private String position;
	
	public Player(String team, String name, String position) {
		super();
		this.team = team;
		this.name = name;
		this.position = position;
	}
}

/* ¹®ÀÚ¿­ - team/name/position
 * position - FW/MF/DF/GK
 */
