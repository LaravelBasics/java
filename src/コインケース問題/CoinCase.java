package コインケース問題;

public class CoinCase {
	private int count500yen = 0;
	private int count100yen = 0;
	private int count50yen = 0;
	private int count10yen = 0;
	private int count5yen = 0;
	private int count1yen = 0;
//	private int count = 0;
	private int total = 0;
	
	/**
	 * 硬貨を追加する
	 * @param value
	 * @param count
	 */
	public void addCoins(int value, int count) {//硬貨の種類valueと枚数count
		if (500 == value) {
			this.count500yen += count;
		}
		if (100 == value) {
			this.count100yen += count;
		}
		if (50 == value) {
			this.count50yen += count;
		}
		if (10 == value) {
			this.count10yen += count;
		}
		if (5 == value) {
			this.count5yen += count;
		}
		if (1 == value) {
			this.count1yen += count;
		}
//		this.count += count;
		this.total += value * count;
	}
	
	/**
	 * 指定した硬貨が、何枚あるかを取得する。
	 */
	public int getCount(int value) {
		if (500 == value) {
			return this.count500yen;
		}
		if (100 == value) {
			return this.count100yen;
		}
		if (50 == value) {
			return this.count50yen;
		}
		if (10 == value) {
			return this.count10yen;
		}
		if (5 == value) {
			return this.count5yen;
		} else {                              //(1 == value)
			return this.count1yen;
		}
	}
	
	/**
	 * 硬貨の総額を取得する。
	 */
	public int getAmount() {
		return this.total;
	}
}
