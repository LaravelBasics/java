package 中級後半_課題プログラム;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyArray myarray = new MyArray(10);  // 動作テスト1
		Random rand = new Random();  // 動作テスト2
		for (int i = 0; i < 10; i++) {
			int r = rand.nextInt(101);//0-100までのランダムな数
			myarray.set(i,r);
		}
		
		// 動作テスト3
		System.out.println(myarray.size());
		System.out.println(myarray.toList());
		System.out.println(myarray.sum());
		System.out.println(myarray.max());
		System.out.println(myarray.min());
		
		// 動作テスト4
		myarray.sort();
		System.out.println(myarray.toList());
		
		// 動作テスト5
//		boolean aaa = myarray.set(15, 10);//インデックス15番目の要素に１０を入れる
//		System.out.println(aaa);//boolean 失敗したらfalse
		
		//動作テスト5
		boolean isval = myarray.set(15, 10);
//		if (isval) {
//			System.out.println("代入します");
//		} else {
//		System.out.println("代入できませんでした");
//		}
		if (isval == false) {
		System.out.println("代入できませんでした");
		} else {
			System.out.println("代入します");
		}
		
		
		//動作テスト６
		System.out.println(myarray.get(20));//0が表示される
	}
}
		//例
//		int[] src = {12, 24, 18, 35, 21};
//		System.out.println(Arrays.toString(src));  // [12, 24, 18, 35, 21]
//
//		Arrays.sort(src);
//		System.out.println(Arrays.toString(src));  // [12, 18, 21, 24, 35]