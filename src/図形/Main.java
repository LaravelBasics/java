package 図形;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		入力された数字の大きさの正方形を表示する
//		入力された数字が２以下の場合は”小さすぎます”１０以上の場合は”大きすぎます”と表示して、
//		正方形は表示しない
//		四角形は、周囲は■で表示し、中は□で表示する
//		四角形全体の面積と、□の部分の面積を表示する
//		入力：４
//		■■■■
//		■□□■
//		■□□■
//		■■■■
//		全体の面積：１６
//		内部面積：４
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("入力：" + n);
	    if (min(n)) {
			System.out.print("小さすぎます");
		} else if (max(n)) {
			System.out.print("大きすぎます");
		} else {
			int count = 0;
			int insideCount = 0;
			for (int y = 1; y <= n; y++) {//y軸縦
				for (int x = 1; x <= n; x++) {//x軸横
					count++;
					if (quadrangularOuter(y, x, n)) {//四角形の外側クアドラングラー？アウター
						System.out.print("■");
					} else {//内側insideインサイダー
						System.out.print("□");
						insideCount++;
					}
				}
				System.out.println();//入力した数ループ後改行
			}
			showArea(count, insideCount);//面積
		}
	}
	
	/**
	 * 入力値nが２以下の時
	 */
	public static boolean min(int n) {
		return n <= 2;
	}
	
	/**
	 * 入力値nが１０以上の時
	 */
	public static boolean max(int n) {
		return n >= 10;
	}
	
	/**
	 * 四角形の外側を■にする
	 */
	public static boolean quadrangularOuter(int y, int x, int n) {
		return y == 1 || y == n || x == 1 || x == n;
	}
	
	/**
	 * 全体と内部面積を表示
	 */
	public static void showArea(int c, int ic) {
		System.out.println("全体の面積" + c);
		System.out.println("内部面積" + ic);
	}
}