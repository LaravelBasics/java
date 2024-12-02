package 中級前半自作プログラム;
import java.util.Scanner;
//貯金箱のプログラムを作ります
//貯金箱の状態を表示して何をするか入力してもらいます
//通常の状態は「１お金を入れる」「２中身を覗く」「３開ける」が選択できます
//「お金」を入れるを選択すると「何円玉を入れますか？」と表示され、
//選択した硬貨を１枚入れることができます
//「中身を覗く」を選択すると、貯金箱に入っているそれぞれの硬貨の枚数が表示されます
//「開ける」を選択すると「中から〇〇円出てきた」と「合計金額が表示され、貯金箱の中身は空になります
public class Main {
	
	private static String[] box = {"[1]お金を入れる  ", "[2]中身を覗く  ", "[3]開ける"};//配列のフィールド
	private static int [] numbers = {500, 100, 50, 10, 5, 1};
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PiggyBank pig = new PiggyBank();
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			shwoExplanation();
			int num = scanner.nextInt();//入力待ち
			if (1 == num) {
				putMoneyIn(pig);
			}
			if ( 2 == num) {
				peekInside(pig);
			}
			if (3 == num) {
				openPiggyBank(pig);
				break;
			}
		}
	}
//			switch (num) {
//			case 1:
//				putMoneyIn(pig);
//				continue;
//			case 2:
//				peekInside(pig);
//				continue;
//			default:
//				openPiggyBank(pig);
//				break;
//			}
//			break;
//		}
//	}
	
	/**
	 * ゲームの説明
	 */
	public static void shwoExplanation() {//explanation、説明
		System.out.println("貯金箱があります。");
//		String result = "";
		for (String s : box) {
			System.out.print(s);
//			result += s;
		}
		newLine();
//		return result;
	}
	
	/**
	 * 改行
	 */
	public static void newLine() {
		System.out.println();
	}
	
	/**
	 * お金を入れる
	 */
	public static void putMoneyIn(PiggyBank p) {
//		System.out.println(box[0]);//〇〇を入れると表示
		System.out.println("お金を入れる。");
		System.out.println("---------------------------");
		System.out.println("何円玉を入れますか？");
		for (int i = 1; i <= 6; i++) {
			System.out.print("[" + i + "]" + numbers[i - 1] + "円玉  ");//配列を表示
		}
		newLine();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();//2回目の入力待ち
		System.out.println("[" + num + "]" + numbers[num - 1] + "円玉を入れました。");//入れたのを表示
		p.addCoins(numbers[num - 1],1);//お金を入れる
		newLine();
	}
	
	/**
	 * 中身を覗く
	 */
	public static void peekInside(PiggyBank p) {//equal、等しい
		System.out.println("中を覗いた。");
		for (int i = 1; i <= 6; i++) {
			System.out.print("[" + i + "]" + numbers[i - 1] + "円玉"
					+ "は" + p.getCount(numbers[i - 1]) + "枚  ");//配列を表示
		}
		newLine();
		newLine();
	}
	
	/**
	 * 貯金箱を開ける
	 */
	public static void openPiggyBank(PiggyBank p) {
		System.out.println("貯金箱を開けた。");
		System.out.println("中から" + p.open() + "円出てきた。");
		System.out.println("---------------------------");
		System.out.println("貯金箱の中身が空になりました。ゲームを終了します。");
	}
}