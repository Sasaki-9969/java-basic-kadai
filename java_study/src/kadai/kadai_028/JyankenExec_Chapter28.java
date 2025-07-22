package kadai.kadai_028;

import java.util.HashMap;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("r", "グー");
		hashMap.put("s", "チョキ");
		hashMap.put("p", "パー");
		
		
		//自分の手を決める
		String myChoice = jyanken.getMyChoice();
		
		//相手の手を決める
		String playerChoice = jyanken.getRandom();
		
		//じゃんけんをする
		jyanken.playGame(hashMap.get(myChoice), hashMap.get(playerChoice));

	}

}
