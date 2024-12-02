package FizzBuzz7_2;

public class FizzBuzz7_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 100; i++) {
			if (i % 2 !=0) {
				System.out.println("〇");
			} else if (i % 5 == 0) {
			}
			//奇数の前に〇
			//偶数の前に□
			//５の倍数は数字を表示せず記号の後ろに☆
			if (i % 2 != 0) {
				if (i % 5 == 0) {
					System.out.println("〇" + "☆");
				} else {
					System.out.println("〇" + i);
				}
			} else if (i % 5 == 0) {
				System.out.println("□" + "☆");
			} else if (i % 2 == 0) {
				System.out.println("□" + i);
			}
	   }//for終わり
    }//Main終わり
}//クラス終わり
//			if(i%2 !=0) {
//				if (i%5 ==0) {
//					System.out.println("〇" + "☆");
//				}else {
//					System.out.println("〇" + i);
//				}
//			} else {
//				System.out.println("□" + i);
//			}
