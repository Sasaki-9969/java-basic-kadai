package kadai.kadai_015;

public class Car_Chapter15 {

	//フィールド（内部データ）初期値
		private int gear  = 1;
		private int speed = 10;
		
		
		// 【メソッド】ギアの値により速度を変える
		public void gearChange( int afterGear ) {
			 gear = afterGear;
			 
		
		//速度の設定
		switch (gear) {
	    case 1 -> speed = 10;
	    case 2 -> speed = 20;
	    case 3 -> speed = 30;
	    case 4 -> speed = 40;
	    case 5 -> speed = 50;
	    default -> speed = 10; // 不正なギアは時速10km
		}
		
		}
		
		 // 【メソッド】ギアチェンジ後の速度を表示する
		 public void run () {
			 System.out.println("ギア1から3に切り替えました");
			 System.out.println("速度は時速" + speed + "㎞です");

		 }
		 

	}







