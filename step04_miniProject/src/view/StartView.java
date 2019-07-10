package view;

import controller.PlayerController;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("=====선수관리부=====");
		System.out.println();
		System.out.println("--등록 선수 검색--");
		PlayerController.request(1);
		System.out.println();
		System.out.println("---선수 등록---");
		PlayerController.request(3);
		System.out.println();
		System.out.println("---선수 포지션 수정---");
		PlayerController.request(5);
		System.out.println();
		System.out.println("--수정 후 재 접속--");
		PlayerController.request(1);
		System.out.println();
		System.out.println("--선수 삭제 후 재 접속--");
		PlayerController.request(4);
		PlayerController.request(1);
		System.out.println();
		System.out.println("--선택 검색--");
		PlayerController.request(2);
		
	}

}