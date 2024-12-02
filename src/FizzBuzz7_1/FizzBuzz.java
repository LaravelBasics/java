package FizzBuzz7_1;

public class FizzBuzz {
    public static void main(String[] args) {
      // TODO 自動生成されたメソッド・スタブ
//    	for (int i = 1; i <= 100; i++) {
//    		if (i % 3 == 0 && i % 5 ==0) {
//    			System.out.println("FizzBuzz");
//    		} else if (i % 3 == 0) {
//    			System.out.println("Fizz");
//    		} else if (i % 5 == 0) {
//    			System.out.println("Buzz");
//    		} else {
//    			System.out.println(i);
//    		}
//    	 }
    	for (int i = 1; i <= 100; i++) {
    		if ( fifteen(i)) {
    			System.out.println("FizzBuzz");
    		} else if (three(i)) {
    			System.out.println("Fizz");
    		} else if (five(i)) {
    			System.out.println("Buzz");
    		} else {
    			System.out.println(i);
    		}
    	}
    }
    
    	public static boolean  fifteen(int i) {
    		return i % 3 == 0 && i % 5 == 0;
    	}
    	
    	public static boolean three(int i) {
    		return i % 3 == 0;
    	}
    	
    	public static boolean five(int i) {
    		return i % 5 == 0;
    	}
}