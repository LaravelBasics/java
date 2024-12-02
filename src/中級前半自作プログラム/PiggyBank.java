package 中級前半自作プログラム;

public class PiggyBank {
	private int count500yen = 0;
	private int count100yen = 0;
	private int count50yen = 0;
	private int count10yen = 0;
	private int count5yen = 0;
	private int count1yen = 0;
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
		}
		if (1 == value) {
			return this.count1yen;
		}
		return 0;
	}
	
	/**
	 * 硬貨の総額を取得する。
	 */
	public int getAmount() {
		return this.total;
	}
	
	/**
	 * フィールドの初期化
	 */
	public void init() {//init、初期化
		count500yen = 0;
		count100yen = 0;
		count50yen = 0;
		count10yen = 0;
		count5yen = 0;
		count1yen = 0;
		total = 0;
	}
	
	/**
	 * 全額を渡して、中身を空にする
	 * @return
	 */
	public int open() {
		int x = getAmount();//総額をｘに代入
		init();                      //フィールドを初期化
		return x;                  //フィールドを初期化した状態で返す
	}
}