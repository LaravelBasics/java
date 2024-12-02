package 初級後半_課題プログラム;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
		int n = inputNum();
		System.out.println("入力：" + n);
		int count = 0;
		for (int i = 1; i <= 50; i++) {//1から５０の数字
			if(five(i, n)) {//入力された数の倍数は表示しない　　(i)がｎの倍数(5)でない時
				evenOdd(i);
				count++;//　　　　　　　　　　　　　　　　　　　　カウントに１を足す
			} else {//　　　　　　　　　　　　　　　　　　　　　(i)が５の倍数の時スキップ
				continue;
			 }
			if (count >= 40) {//表示が40以上で終了　　　　　　　カウントが４０以上の時終了
				break;
			}
			if (count % 10 == 0) {//10件毎に改行　　　　　　　　カウントが１０の倍数の時
			newLine();//new line 改行
			}
		}
	}
	
		/**
		 * 偶数奇数を表示
		 * @param iを受け取る
		 */
		public static void  evenOdd (int i) {
			if (i % 2 == 0) {//偶数なら[]、奇数なら<>を表示　　偶数なら[]
				System.out.print("[" + i + "]");
				} else {//　　　　　　　　　　　　　　　　　　　　　偶数以外なら<>
				System.out.print("<" + i + ">");
				}
		}
		
		/**
		 * 10件毎に改行
		 * @param count
		 */
		public static void newLine() {
			System.out.println();
		}
		
		/**
		 * 入力された数の倍数は表示しない
		 * @param for文 (i)
		 * @param コンソールに入力された数字 (n)
		 * @return (i)が(n)の倍数でない時
		 */
		public static boolean five(int i, int n) {
			return i % n != 0;
		}
		
		/**
		 * 数値入力
		 * @return 入力された数字
		 */
		public static int inputNum() {
			Scanner s = new Scanner(System.in);
			return s.nextInt();
		}
}
//		int count = 0;
//		for (int i = 0; i <= 50; i++) {
//			if (i % n == 0) {
//				continue;
//			}
//			if (count >= 40) {
//				break;
//			}
//			if (i % 2 == 0) {
//				System.out.print("[" + i + "]");
//			} else {
//				System.out.print("<" + i + ">");
//			}
//				count++;
//			if (count % 10 == 0) {
//				System.out.println();
//			}
//		}
//	}
//}
//		for (int i = 1; i <= 50; i++) {//1から５０の数字
//				if(count != 10) {//10件毎に改行　　　　　　　　　　　カウントが１０でない時
//					if(i % n != 0) {//入力された数の倍数は表示しない　　(i)がｎの倍数(5)でない時
//						if (i % 2 == 0) {//偶数なら[]、奇数なら<>を表示　　偶数なら[]
//						System.out.print("[" + i + "]");
//						} else {//　　　　　　　　　　　　　　　　　　　　　偶数以外なら<>
//						System.out.print("<" + i + ">");
//						}
//						count++;//　　　　　　　　　　　　　　　　　　　　カウントに１を足す
//					} else {//　　　　　　　　　　　　　　　　　　　　　(i)が５の倍数の時スキップ
//						continue;
//					}
//				} else {//　　　　　　　　　　　　　　　　　　　　　　カウントが１０以上の時、改行
//					System.out.println();
//					count = 0;//　　　　　　　　　　　　　　　　　　　カウント１０でリセット
//				}
//		}//for分終了
//	}//メインメソッド終了
//}//クラス終了
//	海邊さんの答え	
//		int count = 0;
//		for (int i = 1; i <= 50; i++) {//1から50の数字
//			if (i % n == 0) {//もし(i)が５倍数なら
//				continue;	    //スキップ
//			}
//			if (i % 2 == 0) {//もし(i)が偶数なら[i]
//				System.out.print("[" + i + "]");
//			} else {             //そうでなければ<i>
//				System.out.print("<" + i + ">");
//			}
//			count++;//カウントに１を足す
//			if (count >= 10) {//もしカウントが１０以上なら
//			System.out.println();//１０行毎に改行
//			count = 0;//カウントリセット
//			} else if (count >= 40) {//そうでなければカウントが４０以上で強制終了
//				break;
//			}
//		}
//	}
//}
