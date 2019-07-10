package studytest;

import java.util.ArrayList;
import java.util.HashMap;

import model.domain.Player;
import net.sf.json.JSONArray;

public class StudyTest {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(new Player("토트넘", "손흥민", "FW"));
		a.add(new Player("대구FC", "조현우", "GK"));
		a.add(new Player("감바오사카", "황의조", "FW"));
		
		HashMap<String, ArrayList> m = new HashMap<>();
		m.put("손흥민", a);
		m.put("조현우", a);
		m.put("황의조", a);
		System.out.println(m.get("손흥민").get(0));//c
		
		JSONArray jsonArray = JSONArray.fromObject(m);  
		System.out.println( jsonArray );  
	}		
}	