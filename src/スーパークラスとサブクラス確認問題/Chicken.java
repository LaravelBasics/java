package スーパークラスとサブクラス確認問題;
import java.util.Random;
public class Chicken extends Bird {
	
	Chicken(String cry) {
		super(cry);
	}
	
	/**
	 * ランダムな数を返すメソッド
	 * @return１～５
	 */
	public int getEgg() {//Lay an egg卵を産む
		Random rand = new Random();
		return rand.nextInt(5);
	}
	
	/**
	 * 飛ぶ継承メソッド
	 */
	@Override
	public void jump() {
		System.out.println("飛べません");
	}
}
