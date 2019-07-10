/* crud의 모든 요청을 받고 요청 처리 위임 및 결과값을 EndView에게 출력 위임하는 로직
 * 하나의 메소드에서 if 분기문으로 로직 구분
 * StartView.java에서 Controller에서 요청시
 * 분기문에 사용될 비교 데이터로 요청
 * 1-모든 검색, 2-개인 검색, 3-추가(저장), 4-삭제, 5-수정(name값 기준으로 position 변경)
 * 
 */

package controller;

import model.PlayerEditor;
import model.domain.Player;
import view.EndView;
import view.Log4J;

public class PlayerController {
	static Log4J log = Log4J.getInstance();

	public static void request(int reqNumber) {

		if (reqNumber == 1) {
			System.out.println(log.info());
			System.out.println();
			EndView.printAll(PlayerEditor.getAll());

		} else if (reqNumber == 2) {
			PlayerEditor.getPosition("MF");

		} else if (reqNumber == 3) {
			boolean r = PlayerEditor.insert(new Player("이현준", "FW", 25));
			if (r) {
				EndView.printAll(PlayerEditor.getAll());
				EndView.printSuccess("선수 등록이 되었습니다");
			} else {
				EndView.printFail("등록 실패");
			}
			
		} else if (reqNumber == 4) {
			PlayerEditor.delete("이현준");

		} else if (reqNumber == 5) {
			EndView.printupdate(PlayerEditor.update("조현우"));

		} else {
			EndView.printFail("요청하신 정보는 서비스 할 수 없습니다.");
		
		}
	}
}