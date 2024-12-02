package 中級前半_課題プログラム;

public class Keisanki {
	private int count = 0;
	private int currentValue = 0;
	private int oldValue = 0;
	
	/**
	 * ２つの因数の値を足し算して結果を返す
	 */
	public int tasu(int a, int b) {
		return calculate(a, b, "tasu");
	}
	
	/**
	 * ２つの引数の値を引き算して結果を返す
	 */
	public int hiku(int a, int b) {
		return calculate(a, b, "hiku");
	}
	
	/**
	 * ２つの引数の値を掛け算して結果を返す
	 */
	public int kakeru(int a, int b) {
		return calculate(a, b, "kakeru");
	}
	
	/**
	 * ２つの引数の値を割り算して結果を返す。（切り捨てにして整数値）
	 */
	public int waru(int a, int b) {
		return calculate(a, b, "waru");
	}
	
	/**
	 * 四則演算、足す引く掛ける割るを返す
	 * @param int a
	 * @param int b
	 * @param String c
	 * @return現在の計算結果を返す
	 */                                                         //          (カリキュレイト)
	public int calculate(int a, int b, String c) {//演算するcalculationのc
		count++;                                   // 計算回数
		this.oldValue = this.currentValue;// 最新の計算結果を１つ前の計算結果に代入
		if (c == "tasu") {                       //仮引数cに"tasu"が代入
			this.currentValue = a + b;      // 最新の計算結果に代入
		} else if (c == "hiku") {
			this.currentValue = a - b;       // 最新の計算結果に代入
		} else if (c == "kakeru") {
			this.currentValue = a * b;       // 最新の計算結果に代入
		} else {// (c == "waru")
			this.currentValue = a / b;       // 最新の計算結果に代入
		}
		return this.currentValue;            // 最新の計算結果を返す
	}
//	/**
//	 * 足す仮作成
//	 */
//	public int tasuA(int a, int b) {
//		count++;
//		this.oldValue = this.currentValue;
//		return this.currentValue = a + b;
//	}
	
	/**
	 * 計算回数を返す
	 */
	public int getCount() {
		return this.count;
	}
	
	/**
	 * 現在の計算結果を返す
	 */
	public int getCurrentValue() {
		return this.currentValue;
	}
	
	/**
	 * 一つ前の計算結果を返す
	 */
	public int getOldValue() {
		return this.oldValue;
	}
}
