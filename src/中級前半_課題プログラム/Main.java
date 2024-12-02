package 中級前半_課題プログラム;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Keisanki k = new Keisanki();
		System.out.println(k.tasu(2, 3));//5
//		System.out.println(k.tasu(2, 3));//5
//		System.out.println(k.tasu(3, 1));//4
		System.out.println(k.kakeru(4, 5));//20
		System.out.println(k.getCount());            // 
		System.out.println(k.getCurrentValue()); // 現在の計算結果
		System.out.println(k.getOldValue());       // １つ前の計算結果
//		System.out.println(k.hiku(3, 2));//1
//		System.out.println(k.waru(5, 2));//2.5を切り捨て、2
	}

}
