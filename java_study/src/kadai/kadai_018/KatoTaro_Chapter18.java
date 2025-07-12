package kadai.kadai_018;

import kadai.kadai_018.Kato_Chapter18;

public class KatoTaro_Chapter18 extends Kato_Chapter18{	
	
	public KatoTaro_Chapter18() {
		super("加藤", "東京都中野区〇×");
	}
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "太郎";
	}

	//各自の紹介
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
