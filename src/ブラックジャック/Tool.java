package ブラックジャック;

import java.util.Scanner;

public class Tool {
	public Tool() {
	}
	
	/**
	 * 数字のみ、キーボード入力待ち
	 * @return 数字
	 */
	public static int inputNum() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	/**
	 * キーボード入力待ち
	 * @return 文字列
	 */
	public static String inputStr() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	/**
	 * 改行
	 */
	public static void newLine() {
		System.out.println();
	}
}
