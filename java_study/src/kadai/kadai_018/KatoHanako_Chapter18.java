package kadai.kadai_018;

import kadai.kadai_018.Kato_Chapter18;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	public KatoHanako_Chapter18() {
		super("加藤", "東京都中野区〇×");

	}

	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	//各自の紹介
	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
		}	

}
