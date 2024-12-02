package 青森鹿児島問題;

import java.util.Random;

public class AomoriKagosima {
	public static void main(String[] args) {
		int[][] world = generateRandomWorld(10000, 10000); // 10x10のランダムな世界を生成

//		System.out.println("World:");
//		printWorld(world);

		int aomoriCount = countPattern(world, new int[][] { { 1, 0, 1 }, { 1, 1, 1 } });
		int kagoshimaCount = countPattern(world, new int[][] { { 1, 1, 1 }, { 1, 0, 1 } });
//		int mieCount = countPattern(world, new int[][] { { 1, 0 }, { 1, 1 }, { 1, 0 } });

		System.out.println("青森: " + aomoriCount);
		System.out.println("鹿児島: " + kagoshimaCount);
//		System.out.println("三重: " + mieCount);

//		int maxTotalCount = Math.max(Math.max(aomoriCount, kagoshimaCount), mieCount);
//		System.out.println("Maximum Total Count: " + maxTotalCount);
	}

	// 任意のサイズのランダムな世界を生成
	private static int[][] generateRandomWorld(int rows, int cols) {
		int[][] world = new int[rows][cols];
		Random random = new Random();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				world[i][j] = random.nextInt(2);
			}
		}

		return world;
	}

	// 世界を表示
	private static void printWorld(int[][] world) {
		for (int[] row : world) {
			for (int cell : row) {
				System.out.print(cell);
			}
			System.out.println();
		}
	}

	// 2次元配列内で指定されたパターンの出現回数を数える
	private static int countPattern(int[][] world, int[][] pattern) {
		int patternRows = pattern.length;
		int patternCols = pattern[0].length;
		int count = 0;

		for (int i = 0; i <= world.length - patternRows; i++) {
			for (int j = 0; j <= world[0].length - patternCols; j++) {
				if (isPatternMatch(world, i, j, pattern)) {
					count++;
				}
			}
		}

		return count;
	}

	// 2次元配列内で指定された位置から指定されたパターンが一致するかを判定
	private static boolean isPatternMatch(int[][] world, int startRow, int startCol, int[][] pattern) {
		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < pattern[0].length; j++) {
				if (world[startRow + i][startCol + j] != pattern[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
