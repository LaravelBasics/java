package 初級後半自作プログラム;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] hand= {"[グー]", "[チョキ]", "[パー]"};
		for (;;) {
			System.out.println();//改行
			gameDescription();//ゲームの説明
			int cpu = cpuNum();
			int you = inputNum() -1;//入力された数-1
			if (you > 2 || you < 0) {
				continue;
			}
			showHand(hand[you], hand[cpu]);//youが1~3の状態[you-1]で0~2になる
//			System.out.println("----------------------------");
			if (draw(you, cpu)) {
				System.out.println("あいこ。");
				continue;
			}
			if (isWin(you, cpu)) {
				showWin();
				break;
			} else {
				showLose();
			}
		}
	}
		
	/**
	 * ゲームの説明を表示
	 */
	public static void gameDescription() {//ディスクリプション
		System.out.println("出す手を入力してください。");
		System.out.println("[1]グー" + "  " + "[2]チョキ" + "  " + "[3]パー");
	}
	
	/**
	 * 0から２のランダムな数を返す
	 */
	public static int cpuNum() {
		Random r = new Random();
		 return (int)r.nextDouble(3);
	}
	
	/**
	 * 入力された数を返す
	 */
	public static int inputNum() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	/**
	 * 勝ち
	 */
	public static boolean isWin(int y, int c) {
		return y == 0 && c == 1 || y == 1 && c == 2 || y == 2 && c ==0;
	}
	
	/**
	 * あいこの時は、ゲームを続ける
	 */
	public static boolean draw(int y, int c) {
		return y == c;
	}
	
	/**
	 * 勝ちを表示
	 */
	public static void showWin() {
		System.out.println();
		System.out.println("あなたの勝ちです。");
	}
	
	/**
	 * 負けを表示
	 */
	public static void showLose() {
		System.out.println("あなたの負けです。");
	}
	
	/**
	 * じゃんけん両者の手を表示
	 * @param y
	 * @param c
	 */
	public static void showHand(String y, String c) {
		System.out.println("あなたは" + y + "を出しました。");
		System.out.println("コンピューターは" + c + "を出しました。");
	}
}