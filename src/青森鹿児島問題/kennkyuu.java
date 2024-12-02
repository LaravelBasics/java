package 青森鹿児島問題;//研究問題１

import java.util.Random;

public class kennkyuu {

	public static void main(String[] args) {

		long start_point = System.currentTimeMillis();

		// TODO 自動生成されたメソッド・スタブ
		int size = 10000;
		int aomoriCount = 0;
		int kagosimaCount = 0;
		int mieCount = 0;
		int[][] array = new int[size][size];
		//		create2(array);//世界生成
		////		show(array);
		//		System.out.println("青森" + getAomoriCount(array));
		//		System.out.println("鹿児島" + getkagosimaCount(array));
		Random rand = new Random();
		for (int y = 0; y < array.length; y++) {
			for (int x = 0; x < array[y].length; x++) {
				array[y][x] = rand.nextInt(2);
			}
		}
		for (int y = 0; y < array.length - 1; y++) {//7.8.9まで
			for (int x = 0; x < array[y].length - 2; x++) {
				if (array[y][x] == 1 &&
						array[y][x + 1] == 0 &&
						array[y][x + 2] == 1 &&
						array[y + 1][x] == 1 &&
						array[y + 1][x + 1] == 1 &&
						array[y + 1][x + 2] == 1) {
					aomoriCount++;
				}
				if (array[y][x] == 1 &&
						array[y][x + 1] == 1 &&
						array[y][x + 2] == 1 &&
						array[y + 1][x] == 1 &&
						array[y + 1][x + 1] == 0 &&
						array[y + 1][x + 2] == 1) {
					kagosimaCount++;
				}
			}
		}

	//		for (int y = 0; y < array.length - 1; y++) {//7.8.9まで
	//			for (int x = 0; x < array[y].length - 2; x++) {
	//				
	//				}
	//			}
	//		}

	System.out.println("青森の数"+ aomoriCount);
	System.out.println("鹿児島"+ kagosimaCount);

	long end_point = System.currentTimeMillis();
	long time = end_point - start_point;System.out.println("処理に要した時間"+time/1000+"秒");
	}

	/**
	 * 改行
	 */
	public static void newLine() {
		System.out.println();
	}

	/** 世界生成 */
	public static int[][] create(int[][] array) {
		int[][] arrays = new int[array.length][array[0].length];
		Random rand = new Random();
		for (int y = 0; y < arrays.length; y++) {
			for (int x = 0; x < arrays[y].length; x++) {
				arrays[y][x] = rand.nextInt(2);
			}
		}
		return arrays;
	}

	/** 世界生成2 */
	public static void create2(int[][] array) {
		Random rand = new Random();
		for (int y = 0; y < array.length; y++) {
			for (int x = 0; x < array[y].length; x++) {
				array[y][x] = rand.nextInt(2);
			}
		}
	}

	//	/**
	//	 * 世界を表示
	//	 * @param array
	//	 * @param y
	//	 * @param x
	//	 */
	/** 全体表示 */
	public static void show(int[][] array) {
		for (int[] is : array) {//配列を１個ずつ取り出す
			for (int i : is) {//配列の中身を１個ずつ取り出す
				System.out.print(i);//表示、全体に同じ事をする時、拡張for文
			}
			newLine();
		}
	}

	public static int getMieCount(int[][] array) {
		int count = 0;
		for (int y = 0; y < array.length - 2; y++) {//7.8.9まで
			for (int x = 0; x < array[y].length - 1; x++) {
				if (isMie(array, y, x)) {
					count++;
				}
			}
		}
		return count;
	}

	private static boolean isMie(int[][] array, int y, int x) {
		return array[y][x] == 1 &&
				array[y + 1][x] == 1 &&
				array[y + 2][x] == 1 &&
				array[y][x + 1] == 0 &&
				array[y + 1][x + 1] == 1 &&
				array[y + 2][x + 1] == 0;
	}

	/**
	 * 鹿児島の数を表示
	 */
	public static int getkagosimaCount(int[][] array) {
		int kagosimaCount = 0;
		for (int y = 0; y < array.length - 1; y++) {//7.8.9まで
			for (int x = 0; x < array[y].length - 2; x++) {
				if (array[y][x] == 1 &&
						array[y][x + 1] == 1 &&
						array[y][x + 2] == 1 &&
						array[y + 1][x] == 1 &&
						array[y + 1][x + 1] == 0 &&
						array[y + 1][x + 2] == 1) {
					kagosimaCount++;
				}
			}
		}
		return kagosimaCount;
	}

	/**
	 * 青森の数を表示
	 */
	public static int getAomoriCount(int[][] array) {
		int aomoriCount = 0;
		for (int y = 0; y < array.length - 1; y++) {//7.8.9まで
			for (int x = 0; x < array[y].length - 2; x++) {
				if (array[y][x] == 1 &&
						array[y][x + 1] == 0 &&
						array[y][x + 2] == 1 &&
						array[y + 1][x] == 1 &&
						array[y + 1][x + 1] == 1 &&
						array[y + 1][x + 2] == 1) {
					aomoriCount++;
				}
			}
		}
		return aomoriCount;
	}
}