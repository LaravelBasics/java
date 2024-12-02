package ファイル入出力_確認問題;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sub {

	private static String[][] array = new String[10][3];

	public static void main(String[] args) {
//		//ファイル入出力
//				if (Files.exists(Paths.get("items.txt"))) {
//					System.out.println("ファイルが存在します");
//				} else {
//					System.out.println("ファイルが存在しません");
//				}
//					Path path = Paths.get("src/weapons.csv");
//					Path path1 = Paths.get("items.txt");
//					try (BufferedWriter writer = Files.newBufferedWriter(path1, StandardCharsets.UTF_8)) {
//						try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
//							String s;
//							int count = 0;
//							List<String> list = new ArrayList<>();
//							while ((s = br.readLine()) != null) {
//								String[] str = s.split(",");//中身を配列にする
//								for (int i = 0; i < str.length; i++) {
//									list.add(i, str[i]);//1行目を配列[i]に格納
//								}
//								if (count >= 3) {//３行目から
//									if (str.length == 3) {//配列の長さ３の時書き込み
//										writer.write(("【" + list.get(0) + "】 "));
//										writer.write("値段:" + list.get(1));
//										writer.write(" 攻撃力:" + list.get(2));
////										if (count <= list.size()) {
//										if (count <= 4) {
//											writer.newLine();
//										}
//									}
//								}
//								count++;
//							}
//							
//						} catch (IOException e) {
//							System.out.println("読み込みに失敗しました");
//						}
//					} catch (IOException e) {
//						System.out.println(e);
//					}
		// TODO 自動生成されたメソッド・スタブ
		//ファイルが存在するか確認する
		if (Files.exists(Paths.get("src/weapons.csv"))) {
			//			System.out.println("ファイルが存在します");
		} else {
			System.out.println("ファイルが存在しません");
		}
		//ファイルの読み込み
		Path pt = Paths.get("src/weapons.csv");
		try (BufferedReader br = Files.newBufferedReader(pt, StandardCharsets.UTF_8)) {
			String s;
			int count = 0;
			while ((s = br.readLine()) != null) {
				array[count] = s.split(",");
				count++;
			}
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました");
		}
		
		

		for (int y = 0; y < array.length; y++) {
			for (int x = 0; x <= array.length; x++) {
				StringBuilder sb = new StringBuilder();
				if (y == 3 && x == 3) {
					sb.append("【").append(array[3][0]).append("】");
					System.out.println(sb.append(array[1][1]).append(":")
							.append(array[3][1]).append(" ").append(array[1][2]).append(":").append(array[3][2]));
				}
				if (y == 4 && x == 4) {
					sb.append("【").append(array[4][0]).append("】");
					System.out.println(sb.append(array[1][1]).append(":")
							.append(array[4][1]).append(" ").append(array[1][2]).append(":").append(array[4][2]));
				}
				if (y == 5 && x == 5) {
					sb.append("【").append(array[5][0]).append("】");
					System.out.println(sb.append(array[1][1]).append(":")
							.append(array[5][1]).append(" ").append(array[1][2]).append(":").append(array[5][2]));
				}
			}
		}
	}

	/**
	 * 配列の中身を表示
	 * @return 
	 */
	public static void showArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}