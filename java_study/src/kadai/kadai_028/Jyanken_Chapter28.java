package kadai.kadai_028;

import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice () {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		System.out.println(input);
		return input;

	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom () {
		String[] rspArray = {"r", "s", "p"};
		
		int index = (int)(Math.floor(Math.random() * 3));
		
		return rspArray[index];
		
	}
	
	//じゃんけんを行う
	public void playGame (String myChoice, String playerChoice) {
		
		System.out.println("自分の手は" + myChoice + ",対戦相手の手は" + playerChoice);
		
		if(myChoice.equals(playerChoice)) {
			System.out.println("あいこです");
		}else if(myChoice.equals("グー") && playerChoice.equals("チョキ") ){
			System.out.println("自分の勝ちです");
		} else if (myChoice.equals("グー") && playerChoice.equals("パー")){
			System.out.println("自分の負けです");
		} else if (myChoice.equals("チョキ") && playerChoice.equals("パー")){
			System.out.println("自分の勝ちです");
		} else if (myChoice.equals("チョキ") && playerChoice.equals("グー")) {
			System.out.println("自分の負けです");
		} else if(myChoice.equals("パー") && playerChoice.equals("グー")) {
			System.out.println("自分の勝ちです");
		} else if (myChoice.equals("パー") && playerChoice.equals("チョキ")) {
			System.out.println("自分の負けです");		
		}	
	}

}