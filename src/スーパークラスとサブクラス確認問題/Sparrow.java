package スーパークラスとサブクラス確認問題;
public class Sparrow extends Bird {//すずめ
	
	Sparrow(String cry) {
		super(cry);
	}
	
	/*
	 * 飛ぶ継承メソッド
	 */
	@Override
	public void jump() {
		System.out.println("群れになって飛びます");
	}
}