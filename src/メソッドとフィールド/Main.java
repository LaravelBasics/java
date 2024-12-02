package メソッドとフィールド;

/**製作者
 * メソッドとフィールド確認問題
 */
public class Main {
	// int型の変数aを10で初期化
	public static int a = 10;
	
	public static void main(String[] args) {
		//戻り値がある場合、変数hello にaaa(こんにちは)を代入
		String hello = aaa(1); 
		System.out.println(nibai(123));
		oddEvne(getRandom());
		System.out.println(a);
		oddEvne(a);
	}
	
	/**
	 * aaaメソッド
	 * こんにちはを返す
	 * @param 未使用の引数b
	 * @return aaaメソッドでこんにちはを返す
	 */
	public static String aaa(int b) {
		return "こんにちは";
	}
	
	/**
	 * nibaiメソッド
	 * int型の値を入れると2倍されたint型の値が戻ってくる
	 * @param num 整数値
	 * @return 123の2倍の数
	 */
	public static int nibai(int num) {
		return num * 2;
	}
	
	/**
	 * oddEvenメソッド
	 * @param 整数値 num を判定 偶数なら偶数、奇数なら奇数を表示
	 */
	public static void oddEvne(int num) {
	  if (num % 2 == 0) {
	    System.out.println("偶数です");
	  } else {
	   System.out.println("奇数です");
	  }
	}
	
	/**
	 * getRandomメソッド
	 * @return 0から5未満の乱数を返す
	 */
	public static int getRandom() {
		return ((int)Math.ceil(Math.random() * 4));
	}
}