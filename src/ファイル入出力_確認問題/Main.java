package ファイル入出力_確認問題;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

	//	private static String[][] array = new String[10][10];
	//	private static String[][] array;

	public static void main(String[] args) {
		//ファイル入出力
		if (Files.exists(Paths.get("items.txt"))) {
			System.out.println("ファイルが存在します");
			
		} else {
			System.out.println("ファイルが存在しません");
			
		}
		Path path = Paths.get("src/weapons.csv");
			Path path1 = Paths.get("items.txt");
//			int count =0;
//			int maxCount =0;
			
//			try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {			
//				String s;
//				while ((s = br.readLine()) != null) {
//					count++;
//					String[] str = s.split(",");//中身を配列にする
//					if (count >= 3) {//３行目から
//						if (str.length == 3) {//配列の長さ３の時書き込み
//							maxCount++;
//						}
//					}
//			}
//			} catch (IOException e) {
//				System.out.println("読み込みに失敗しました" + e);
//			}
//			System.out.println("maxcount=" + maxCount);
			
			try (BufferedWriter writer = Files.newBufferedWriter(path1, StandardCharsets.UTF_8)) {
				try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
					String s;
					int count = 0; //int count01 = 0;
//					int count02 = 0;
					List<String> list = new ArrayList<>();
					while ((s = br.readLine()) != null) {
						String[] str = s.split(",");//中身を配列にする
						for (int i = 0; i < str.length; i++) {
							list.add(str[i]);//1行目を配列[i]に格納
						}
						/*改行削除if (count01 >= 3)*/if (count >= 3) {//３行目から
							if (str.length == 3) {//配列の長さ３の時書き込み
								writer.write(("【" + list.get(0) + "】 "));
								writer.write("値段:" + list.get(1));
								writer.write(" 攻撃力:" + list.get(2));
//								if (count1 != list.size()) {
//								count02++;
//								if (count02 != maxCount ) {
//									System.out.println("count1="+count02);		
									writer.newLine();
								}
							}
						list.clear();//中身を消す
						count++; //count01++;
					}
					
				} catch (IOException e) {
					System.out.println("読み込みに失敗しました" + e);
				}
			} catch (IOException e) {
				System.out.println("書き込みに失敗しました"+e);
			}
	}
}
	


//		Path path2 = Paths.get("items.txt");
//		//		System.out.println(path.toAbsolutePath());//住所
//		try (BufferedReader reader = Files.newBufferedReader(path2, StandardCharsets.UTF_8)) {
//			String s;
//			while ((s = reader.readLine()) != null) {
//				System.out.println(s);
//			}
//		} catch (IOException e) {
//			System.out.println("読み込みに失敗しました1");
//		}

//		if (Files.exists(Paths.get("items.txt"))) {
//			System.out.println("ファイルが存在します2");
//		} else {
//			System.out.println("ファイルが存在しません2");
//		}