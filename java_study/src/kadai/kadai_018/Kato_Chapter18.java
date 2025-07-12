package kadai.kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName; //姓のフィールド
	public String givenName; //名のフィールド
	public String address; //住所のフィールド
	
	public Kato_Chapter18(String familyNmae, String address) {
		this.familyName = familyNmae;
		this.address = address;
		
	}
		
	 // 共通の紹介
		public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");	
		System.out.println("住所は" + address + "です");
	}
	
	// 各自の紹介(子クラスで定義）
	abstract public void eachIntroduce();
	
	// 共通の紹介＋各自の紹介をまとめて実行
	public void execIntroduce() {
		commonIntroduce(); //共通の紹介
		eachIntroduce(); //各自の紹介
	}
	
}
