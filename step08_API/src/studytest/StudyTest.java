package studytest;

import java.util.ArrayList;
import java.util.HashMap;

import model.domain.Player;
import net.sf.json.JSONArray;

public class StudyTest {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(new Player("��Ʈ��", "�����", "FW"));
		a.add(new Player("�뱸FC", "������", "GK"));
		a.add(new Player("���ٿ���ī", "Ȳ����", "FW"));
		
		HashMap<String, ArrayList> m = new HashMap<>();
		m.put("�����", a);
		m.put("������", a);
		m.put("Ȳ����", a);
		System.out.println(m.get("�����").get(0));//c
		
		JSONArray jsonArray = JSONArray.fromObject(m);  
		System.out.println( jsonArray );  
	}		
}	