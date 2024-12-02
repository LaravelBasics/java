package 青森鹿児島問題;//研究問題２

import java.util.Random;

public class Sub {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int size = 100;

		int[][] array = new int[size][size];

		int aomoriCount = 0;
		int kagosimaCount = 0;
		int mieCount = 0;
		int sum = 0;

		
		int count = 0;//ランダムな世界を生成した回数をカウント
		int[][] maxSize = new int[size][size];//最大値を保存
		for (int maxValue = 0; maxValue < 1000; maxValue++) {
			boolean flg = false;//ループを抜ける
			for (int i = 0; i < 1000; i++) {//最大値を求める
				create2(array);//世界生成
				aomoriCount = getAomoriCount(array);//青森数える
				kagosimaCount = getkagosimaCount(array);
				mieCount = getMieCount(array);
				count++;
				if (sum < (aomoriCount + kagosimaCount + mieCount)) {//最大値を保存
					sum = (aomoriCount + kagosimaCount + mieCount);
					maxSize = new int[size][size];
					for (int y = 0; y < maxSize.length; y++) {
						for (int x = 0; x < maxSize.length; x++) {
							maxSize[y][x] = array[y][x];
						}
					}
				}
				if (sum >= maxValue) {// sizeが５の場合、(4 >= 5)の時ループを抜ける
					flg = true;//最大値を保存してループを抜ける
					break;
				}
			}
			if (flg == false) {//for文終了
				//				maxAomori = getAomoriCount(maxSize);
				show(maxSize);//最大値を表示
				System.out.println(count);//世界を生成した回数
				System.out.println("合計の最大数" + sum);
				break;
			}
		}
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
//int[][] array = {
//{1,1,1,1,1}, 
//{1,0,1,0,1}, 
//{1,1,1,1,1}, 
//{1,0,1,0,1}, 
//{1,1,1,1,1}, 
//};
//int[][] array = {
//{1,0,1,1,1,1,1,1,1,1}, 
//{1,1,1,1,1,1,1,1,1,1}, 
//{1,0,1,1,1,1,1,1,1,1}, 
//{1,1,1,1,1,1,1,1,1,1}, 
//{1,1,1,1,1,1,1,1,1,1}, 
//{1,1,1,1,1,1,1,1,1,1}, 
//{1,1,1,1,1,1,1,1,1,1}, 
//{1,0,1,1,1,1,1,1,1,0}, 
//{1,1,1,1,1,1,1,1,1,1}, 
//{1,0,1,1,1,1,1,1,1,0},
//};