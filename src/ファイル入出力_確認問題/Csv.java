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
import java.util.Scanner;

public class Csv {
	public static String fileName = "items.txt";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = readerFileList();//ファイルを読み込んでListに代入
		List<String> preList = preListFile(list);//ファイルを整形してListに代入
		
		if (Files.exists(Paths.get(fileName))) {
			showFile();
			int you = scanner.nextInt();
			if (you == 1) {//上書きするか数字を入力
				System.out.println("1が入力されました。ファイルを上書きします");
				writeFile(preList);//ファイルに書き込み
				System.out.println("ファイルが上書きされました");
			} else if (you == 2) {
				System.out.println("2が入力されました、中止します");
			} else if (you == 3) {
				System.out.println("３が入力されました。ファイルを削除します");
				fileDelete();//ファイル削除
				System.out.println("ファイルが削除されました");
			} else {
				showError();
			}
		} else {
			System.out.println("ファイルが存在しません");
			System.out.println("ファイルを作成する場合は１、" + "そうでない場合は２を入力してください");
			int you = scanner.nextInt();
			if (you == 1) {
				System.out.println("１が入力されました。ファイルを作成します");
				writeFile(preList);//ファイルに書き込み
				System.out.println("ファイルが作成されました");
			} else if (you == 2) {
				System.out.println("2が入力されました。ファイルの作成を中止します");
			} else {
				showError();
			}
		}
	}

	/**
	 * ファイルを読み込みlistに格納して返す
	 */
	public static List<String> readerFileList() {
		List<String> list = new ArrayList<>();
		Path path = Paths.get("src/weapons.csv");
		String s;
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			while ((s = br.readLine()) != null) {//ファイルを読み込む
				list.add(s);
			}
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました。" + e);
		}
		return list;
	}

	/**
	 * ファイルを整形して返す
	 */
	public static List<String> preListFile(List<String> list) {
		List<String> preList = new ArrayList<>();//preList 整形済み
		for (int i = 0; i < list.size(); i++) {
//			count++;
			String[] str = list.get(i).split(",");//splitはStringで使う
			if (str.length == 3) {//配列の要素数が３の時書き込み
				if (i >= 3) {//３行目から
					String tmp = "【" + str[0] + "】 " + "値段:" + str[1] + " 攻撃力:" + str[2];
					preList.add(tmp);//テンポラリーの略。temporary
					//					System.out.println(tmp);
					//					System.out.print("【" + str[0] + "】 ");
					//					System.out.print("値段:" + str[1]);
					//					System.out.print(" 攻撃力:" + str[2]);
					//					System.out.println();//改行
				}
			}
		}
		return preList;
	}

	/**
	 * ファイルの書き込み
	 */
	public static void writeFile(List<String> list) {
		//		List<String> aaa = new ArrayList<>();
		Path path = Paths.get(fileName);
		try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
			for (String s : list) {
				writer.write(s);
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("書き込みに失敗しました。" + e);
		}
	}
	
	/**
	 * ファイル削除
	 */
	public static void fileDelete() {
		try {
			Files.delete(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ファイルの作成のみ
	 */
	public static void createFile() {
		try {
			Files.createFile(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ファイルを操作する時の説明を表示
	 */
	public static void showFile() {
		System.out.println("ファイルが存在します");
		System.out.println("ファイルを上書きする場合は１、");
		System.out.println("中止する場合は２、" );
		System.out.println("ファイルを削除する場合は３を入力してください");
	}
	
	/**
	 * 入力エラーを表示
	 */
	public static void showError() {
		System.out.println("入力エラー。最初からやり直してください。");
	}
}

//		for (String s : list) {//拡張for文ver
//			count++;
//			String[] str = s.split(",");
//			if (str.length == 3) {//要素数３の時書き込み
//				//				for (int i = 0; i < str.length; i++) {
//				if (count >= 3) {//３行目から
//					System.out.print("【" + str[0] + "】 ");
//					System.out.print("値段:" + str[1]);
//					System.out.print(" 攻撃力:" + str[2]);
//					System.out.println();//改行
//				}
//			}
//		}