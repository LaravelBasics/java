package 中級後半_課題プログラム;

import java.util.Arrays;

public class MyArray {
	
	private int [] array;                                   // array、空の配列、 //配列の長さarray length
	
	MyArray(int arrayLength) {                       //配列の数３の場合
		this.array = new int[arrayLength];        //配列｛０，１，２}
	}
	
	/**
	 * 第一引数をインデックスとし、フィールドの配列のインデックスの要素に、
	 * 第二引数を代入する。引数がインデックスの範囲外なら代入しない。
	 * 代入に成功すればtrue、失敗すればfalseを返す。
	 * ただしif文とswitch文は使用不可
	 * @param index、インデックス
	 * @param val、値（あたい）
	 * @return
	 */
	public boolean set(int index, int val) {
			try {
//				System.out.println("aaa代入します");
				this.array[index] = val;
				return true;
			} catch (ArrayIndexOutOfBoundsException e) {
//			} catch (IndexOutOfBoundsException e) {
				return false;
			}
	}
//	public boolean set(int index, int val) {//例  indexが３、valが５、xが３
//		if (index < 0 || array.length <= index) {
////		if (index >= array.length || index < 0) {//例  3 >= 3 または  3 < 0の時、
//			return false;                                 //代入失敗
//		}
//		this.array[index] = val;                          //this.x[インデックス3番に] = 5を代入;
//		return true;                                       //代入成功
//	}
	
	/**
	 * 引数をインデックスとし、フィールドの配列のインデックスの要素を返す。
	 * 引数がインデックスの範囲外なら０を返す。
	 * ただしif文とswitch文は使用不可。
	 */
	public int get(int index) {
		try {
//			System.out.println("getメソッド代入します");
			return array[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
	}
//	public int get(int index) {//  if文
//		if (index < 0 || array.length <= index) {//見やすく変更
////		if (index >= array.length || index < 0) {
//			return 0;
//		}
//		return array[index];
//	}
	
	/**
	 * 配列の長さを返す
	 */
	public int size() {
		return this.array.length;//配列の変数名x.length配列の長さ。{0,1,2}なら、配列の長さ３
	}
	
	/**
	 * 配列の要素すべての合計を返す
	 */
	public int sum() {
		int sum = 0;//合計値を入れる変数sum
		for (int s : this.array) {
			sum += s;
//		for (int i = 0; i <= array.length; i++) {//配列の長さまで繰り返し
//			sum += array[i];//インデックス０から順番に、sumに加算
		}
		return sum;
	}
	
	/**
	 * 配列の要素の一番大きな値を返す
	 */
	public int max() {
		//最初にインデックス0(this.array[0])を入れて比較、一番大きな値を、変数arrayMaxに代入
		int arrayMax = this.array[0] ;
		for (int val : this.array) {
			if (arrayMax < val) {//array[0]とarray[1~]を比較
				arrayMax = val;//大きい時に代入
//		for (int i = 1; i <= array.length; i++) {//i(0) <= 配列の長さ(x.length)まで繰り返し
//			if (arrayMax < this.array[i]) {//もしarrayMax < 配列の長さの時
//				arrayMax = this.array[i];//this.x[i(0)]から順番に代入して、最大値更新
			}
		}
		return arrayMax;
	}
	
	/**
	 * 配列の要素の一番小さな値を返す
	 */
	public int min() {
		int arrayMin = this.array[0];//一番小さな値を、変数arrayMinに代入
		for (int val : this.array) {
			if (arrayMin > val) {//array[0]とarray[1~]を比較
				arrayMin = val;//小さい時に代入
//		for (int i = 1; i <= array.length; i++) {//i(0) <= 配列の長さ(x.length)まで繰り返し
//			if(arrayMin < this.array[i]) {//もしarrayMin < 配列の長さの時
//				arrayMin = this.array[i];//this.x[i(0)]から順番に代入して、最小値更新
			}
		}
		return arrayMin;
	}
	
	/**
	 * 配列の要素を小さい順に並べ替える
	 */
	public void sort() {                           //リターンで返すと２回目以降の変更がない
		Arrays.sort(this.array);                 //メソッドで呼ぶと変更されたまま
	}
	
	/**
	 * 配列の全ての要素を、「,」で区切って返す
	 */
	public String toList() {
		String val = "";
		for (int i = 0; i < this.array.length; i++) {
			if (i < this.array.length - 1) {
				val += this.array[i] + ",";
			} else {
				val += this.array[i] + "";
			}
		}
		return val;
	}
}
//		int i =0;
//		for (int num : this.array) {
//			if (i < this.array.length - 1 ) {
//				val += num + ",";
//			} else  {
//				val += num + "";//10個目はカンマを付けない
//			}
//			i++;
//		}
//		return val;//for文の外
//	String型のみint型は不可
//	String[] strArray = {"a","b","c"}; 
//	// 配列の文字を区切り文字 "-" で結合する
//	String s1 = String.join("-", strArray);
//	System.out.println(s1); // a-b-c