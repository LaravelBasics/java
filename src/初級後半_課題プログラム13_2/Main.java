package 初級後半_課題プログラム13_2;
import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		title();
		Scanner scanner = new Scanner(System.in);
//		int pc = rand.nextInt(100)+1;//コンピューターがランダムで選んだ数
		int pc = randomNumber();
		System.out.println("PC答え" + pc);
		int count = 0;
		for (;;) {//無限ループ
			int you = scanner.nextInt();//Scannerを使い入力（正解するまで何度も入力）
			count++;//入力した回数をカウント
			if (notNumber(you, pc)) {
				bigOrSmall(you, pc);
			} else {//正解すると最後に『解答した回数』を表示して終了する
				break;
			}
		}
		count(count);
	}
	
	/**
	 * 解答を間違えた場合、正解の数より『大きい』か『小さい』かを表示
	 */
	public static void bigOrSmall(int you, int pc) {
		if (you >= pc) {
			System.out.println("『大きい』");
		} else {
			System.out.println("『小さい』");
		}
	}
	
	/**
	 * 入力した回数をカウントして表示
	 */
	public static void count(int c) {
		System.out.println("正解。解答した回数" +c);
	}
	
	/**
	 * 		タイトルと解説を表示
	 */
	public static void title() {
		System.out.println("数当てゲーム");
		//解説を表示
		System.out.println("ランダムの数の範囲は１から１００まで");
		System.out.println("標準入力で解答する。(正解するまで何度でも入力)");
		System.out.println("解答を間違えた場合、正解の数より『大きい』か『小さい』かを表示");
		System.out.println("正解すると最後に『解答した回数』を表示して終了する");
	}
	
	/**
	 * 入力した(you)がランダムな数(pc)と等しくないとき
	 */
	public static boolean notNumber(int y, int p) {
		return y != p;
	}
	
	/**
	 * １～１００のランダムな数を返す
	 * @return
	 */
	public static int randomNumber() {
		Random rand = new Random();
		return rand.nextInt(100)+1;
	}
}