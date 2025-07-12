package kadai.kadai_018;

import kadai.kadai_018.Kato_Chapter18;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	
	public KatoIchiro_Chapter18() {
		super("加藤", "東京都中野区〇×"); //親のコンストラクタを呼び出す
	}
	
		//名を表すフィールドの値をセットする
		public void setGivenName() {
			this.givenName = "一郎";
		}

		//各自の紹介
		@Override
		public void eachIntroduce() {
			System.out.println("好きな食べ物はリンゴです");
		}
	}

