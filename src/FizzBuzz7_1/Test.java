package FizzBuzz7_1;

public class Test {

	public static void main(String[] args) {
		int i = 28;
		if (i % 3 == 0 && i % 7 == 0) {
			System.out.println("３と７の倍数");
		} else if (i % 3 == 0) {
			System.out.println("３の倍数かつ７の倍数でない");
		} else if (i % 7 == 0) {
			System.out.println("7の倍数かつ３の倍数でない");
		} else {
			System.out.println("それ以外");
		}
	}

}
