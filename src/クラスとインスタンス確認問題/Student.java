package クラスとインスタンス確認問題;

public class Student {
	public String name; //名前
	private int id; //出席番号
	private int math;//数学
	private int nationalIanguage;//国語
	private int english;//英語
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * 数学、英語、国語の点数メソッド
	 */
	public void setTestScore(int math, int nationalIanguage, int english) {
		this.math = math;
		this.nationalIanguage = nationalIanguage;
		this.english = english;
	}
	
	/**
	 * 出席番号メソッド
	 */
	public void attendanceNumber() {
			System.out.println("出席番号 : " + this.id + "名前 : " + this.name);
	}
	/**
	 * テストの点数メソッド
	 */
	public void testScore() {//Score 点数
		System.out.println(this.name);
		System.out.print("数学 : " + this.math + "点 ");
		System.out.print("国語 : " + this.nationalIanguage + "点 ");
		System.out.println("英語 : " + this.english + "点 ");
	}
	
	public void showAll() {
		System.out.print("出席番号" + this.id);
		System.out.print(this.name);
		System.out.print("数学 : " + this.math + "点 ");
		System.out.print("国語 : " + this.nationalIanguage + "点 ");
		System.out.println("英語 : " + this.english + "点 ");
	}
	
	/**
	 * 三教科の平均点を取得するメソッド１
	 */
	public int average() {// average 平均
		return (this.math + this.nationalIanguage + this.english) /3;//averageの略avg
	}
	
//	public void setId(int a) {
//		this.id = a;
//	}
	
	public int getId() {
		return this.id;
	}
	/**
	 * 三教科の平均点を取得するメソッド２
	 */
//	public int average() {// average 平均
//		return avg(this.math, this.nationalIanguage, this.english);//averageの略avg
//	}
//	
//	/**
//	 * 平均点を返すメソッド
//	 */
//	public int avg(int a, int b, int c) {//
//		return (a + b + c) / 3;
//    }	
}