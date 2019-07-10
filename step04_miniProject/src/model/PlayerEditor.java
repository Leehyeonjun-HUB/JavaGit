package model;
/*
 * player editor
 * 선수이름, 등번호, 포지션, 
 */

import model.domain.Player;
import view.EndView;

public class PlayerEditor {

	private static Player[] allData = new Player[7];
	private static int index;

	static {
		allData[0] = new Player("손흥민", "MF", 7);
		allData[1] = new Player("이재성", "MF", 10);
		allData[2] = new Player("김민재", "DF", 4);
		allData[3] = new Player("김승규", "GK", 1);
		allData[4] = new Player("황의조", "FW", 16);
		allData[5] = new Player("조현우", "GK", 21);
		index = 6;
	}

	// 모든 사람들 검색
	public static Player[] getAll() {
		return allData;
	}

	// 가입

	public static boolean insert(Player v) {
		if (index < 7) {
			allData[index++] = v;
			return true;
		} else {
			return false;
		}
	}

	// 삭제
	public static boolean delete(String name) {
		Player v = null;
		for (int i = 0; i < allData.length; i++) {
			v = allData[i];
			if (v != null && v.getName().equals(name)) {
				allData[i] = null;
				return true;
			}
		}
		return false;
	}

	// 수정
	public static Player update(String name) {
		Player v = null;
		for (int i = 0; i < allData.length; i++) {
			v = allData[i];
			if (v != null && v.getName().equals(name)) {
				v.setPosition("MF");
				return v;
			}
		}
		return null;
	}

	// 원하는 카테고리를 포함하는 정보만 검색
	public static Player[] getPosition(String position) {
		Player v = null;
		for (int i = 0; i < allData.length; i++) {
			v = allData[i];
			if (v != null && v.getPosition().equals(position)) {
				EndView.printselect(v);
			}
		}
		return null;
	}

}
