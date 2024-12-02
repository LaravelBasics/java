package スーパークラスとサブクラス確認問題;

public class Sky {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sparrow sparrow = new Sparrow("チュン");
		sparrow.cry(1);
		sparrow.jump();
		
		Chicken chicken = new Chicken("コケコッコー");
		chicken.cry(2);
		chicken.jump();
		
		int n = chicken.getEgg();//ランダムな数を変数(n)に代入
		//Chickenクラスの卵を産むメソッドを実行
		System.out.println(n + "個生まれた");

		Chicken[] chickens = new Chicken[n];
		for (int i = 0; i < chickens.length; i++) {
			chickens[i] = new Chicken("コケコッコー");
		}
		int sum = 0;//合計
		for (Chicken c : chickens) {
			sum += c.getEgg();
		}
		System.out.println("卵の合計" + sum);
		
		Penguin penguin = new Penguin("鳥の鳴き声");
		Bird[] birds = {sparrow, chicken, penguin};//
		for (Bird b : birds) {
			b.jump();
		}
	}
//	    List<Chicken> list = new ArrayList<>();//listの答え
//		for (int i = 0; i < n ; i++) {
////			//ランダムな(n)の数、Chickenのインスタンス名(s)を生成
//			Chicken s = new Chicken("コケコッコー");
////			//配列listから、ArrayListの内のaddメソッドを呼び(s)を入れる
//			list.add(s);
//		}
		
//		int sum = 0; //合計
//		//ランダムに生成した、インスタンス(s)の配列listを変数cに代入
//		for (Chicken c : list) {
//			//新たに生成した、Chickenクラスの卵を産むメソッドをそれぞれ実行し、合計を表示
//			sum += c.layAnEgg();
//		}
//		System.out.println("卵の合計" + sum);
//	}
}
