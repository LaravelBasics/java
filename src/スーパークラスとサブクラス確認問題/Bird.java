package スーパークラスとサブクラス確認問題;
 abstract public class Bird { 
	protected String cry;//鳴き声
	
	Bird(String cry) {//コンストラクタ
		this.cry = cry;
	}
	
	/**
	 * 鳴き声を引数の回数、表示するメソッド
	 * @param birdChirping鳥の鳴き声
	 */
	public void cry(int birdChirping) {
		System.out.println(birdChirping);
	}
	
	/**
	 * 飛ぶ抽象メソッド
	 */
	abstract public void jump();//飛ぶ
 }
