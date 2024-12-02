package スーパークラスとサブクラス確認問題;
public class Penguin extends Bird {
	
	Penguin(String cry) {
		super(cry);
	}
	
	/**
	 * 飛ぶ継承メソッド
	 */
	@Override
	public void jump() {
		System.out.println("飛べません");
	}
}
