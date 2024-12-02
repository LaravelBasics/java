package コインケース問題;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CoinCase coin = new CoinCase();
		int count = 0;
		int[] coins = {500, 100, 50, 10, 5, 1};
		for (int i = 1; i <= 10; i++) {
			int rand = randomNum();//ランダムな数0~5
			count++;
			showCoinAddition(count, (rand + 1), coins[rand]);//Addition、追加
			coin.addCoins(coins[rand], (rand + 1));
		}
		showCoins(coins,coin);
		showTotal(coin);
	}
	
	/**
	 * 0~5までのランダムな数を取得
	 */
	public static int randomNum() {
		Random rand = new Random();
		return rand.nextInt(6);
	}
	
	/**
	 * 追加された硬貨の種類と枚数を表示
	 */
	public static void showCoinAddition(int c, int r, int cr) {
		System.out.println(c  + "回目");
		System.out.println("0~5までのランダムな数：" + "数は：" + r);//確認用
		System.out.println("硬貨の種類：" + cr +  "円玉：" + r + "枚追加");
		System.out.println("------------------------------------------");
	}
	
	/**
	 * 総額を表示
	 */
	public static void showTotal(CoinCase coin) {
		System.out.println("総額" + coin.getAmount() + "円");
	}
	
	/**
	 * 追加されたコインの種類と枚数を表示
	 */
	public static void showCoins(int[] cs, CoinCase c) {
		for(int i = 1; i <= 6; i++) {
		System.out.println("コインの種類："+ (cs[i - 1]) + "円玉：" + c.getCount(cs[i - 1]) + "枚");
		}
	}
}
