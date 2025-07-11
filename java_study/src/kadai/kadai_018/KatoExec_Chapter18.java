package kadai.kadai_018;

import kadai.kadai_018.KatoHanako_Chapter18;
import kadai.kadai_018.KatoIchiro_Chapter18;
import kadai.kadai_018.KatoTaro_Chapter18;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//太郎のオブジェクト
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.familyName = "加藤";
		taro.address = "東京都中野区〇×";
		taro.setGivenName();
		taro.execIntroduce();
		
		
		//改行
		System.out.println();
		
		
		//一郎のオブジェクト
		KatoIchiro_Chapter18 ichiro =new KatoIchiro_Chapter18();
		ichiro.familyName = "加藤";
		ichiro.address = "東京都中野区〇×";
		ichiro.setGivenName();
		ichiro.execIntroduce();
		
		
		//改行
				System.out.println();
				
		
		//花子のオブジェクト
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.familyName = "加藤";
		hanako.address = "東京都中野区〇×";
		hanako.setGivenName();
		hanako.execIntroduce();
		
		}
	
	    
	}