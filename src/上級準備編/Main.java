package 上級準備編;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
		//Files クラスを使ったファイル操作
		//Files.createFile()メソッドでファイルを作成できる
		//引数のPathクラスでパスを指定
		//一度実行でtest.txtファイルが作成されるが、二度実行するとFileAlreadyExistsExceptionが発生
		//ファイルが既に存在するという例外
		//		try {
		//			Files.createFile(Paths.get("test.txt"));
		//		} catch (IOException e) {
		//			e.printStackTrace();
		//		}
		//Files.exists()メソッドを利用すると、そのファイルが存在するかどうかがわかります
		//ファイルが存在しない場合に作成するなどの処理が書ける
		//		if (Files.exists(Paths.get("test.txt"))) {
		//			System.out.println("ファイルが存在します");
		//		} else {
		//			System.out.println("ファイルが存在しません");
		//		}
		//	}
		//}
		//Files.delete()メソッドでファイルの削除ができる
		//削除するファイルが存在しない場合NoSuchFileExceotionが発生
		//		try {
		//			Files.delete(Paths.get("test.txt"));
		//		} catch (IOException e) {
		//			e.printStackTrace();
		//		}
		//	}
		//}
		//		//ファイルの書き込み
		//		Path path = Paths.get("file01.txt");
		//		try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
		//			writer.write("あいうeo");
		//			writer.newLine();
		//			writer.write("abcえお");
		//			writer.newLine();
		//			writer.write(956 + "");
		//			writer.newLine();
		//		} catch (IOException e) {
		//			System.out.println(e);
		//		}
		//	}
		//close メソッド
		//		BufferedReader br = null;
		//		try {
		//			File file = new File("src/上級準備編/file01.txt");
		//			br = new BufferedReader(new FileReader(file));
		//			String s;
		//			while((s = br.readLine()) != null) {
		//				System.out.println(s);
		//				System.out.println("-------------7777777---------");
		//			}
		//		} catch (FileNotFoundException e) {
		//			System.out.println(e);
		//			System.out.println("******************");
		//		} catch (IOException e) {
		//			System.out.println(e);
		//		} finally {
		//			if (br != null) {
		//				try {
		//					br.close();
		//				} catch (IOException e) {
		//					System.out.println(e);
		//					System.out.println("---------*****8888*");
		//				}
		//			}
		//		}
		//ファイル入出力
		Path path = Paths.get("src/上級準備編/file01.txt");
		//		System.out.println(path.toAbsolutePath());//住所
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String s;
			while ((s = reader.readLine()) != null) {
				System.out.println("---------66666--------");
			}
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました");
		}
		try {
			Files.delete(Paths.get("test.txt"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("失敗");
		}
	}
}
// TODO 自動生成されたメソッド・スタブ
//同じ方の変数をまとめて初期化する
//		int a = 10, b = 10, c = 10, d = 10, e = 10, i = 0;

//		a += 3; //a = a + 3;
//		b -= 3;
//		c *= 3;
//		d /= 3;
//		e %= 3;
//		System.out.println(a + ", " + b + ", " + c + " ," + d + ", " + e );

//		int[] array = new int[5];
//		for (int i = 5; i > 0; i --) {//for文逆回し
//			System.out.println(i);
//		}
//		
//		for (int i = array.length - 1; i >= 0; i--) {//逆回し
//			array[i] = i;
//			System.out.println(array[i]);
//		}
//		System.out.println(++i + 5);
//宣言だけでも連続で可能
//		boolean a, b, c, d;
//		
//		a = !(1 == 1);
//		d = true;
//		c = !getTrue();
//		System.out.println(a);//falseになる
//		System.out.println(1 < 2 ? "こんにちは" : "こんばんは");//trueの場合こんにちは。1>2ならこんばんは
//		Sub s = new Sub();
//		s.add(2).add(3).add(5).add(7).show();//17
//		System.out.println(s.add(2) + "  add");//インスタンスの住所のみが表示されている
//		System.out.println(s.aaa(3) + "aaa");
//		System.out.println(getTrue());

//		String a = "こんにちは";
//		System.out.println(a.equals("こんばんは"));
//		System.out.println("文字の長さは" + a.length());
//
//		System.out.println("*****************");
//		System.out.println((int) 'あ');
//		System.out.println((char)11111);
//		System.out.println((char)12354);
//		System.out.println("--------------------");
//		
//		String sss = "あいうえお";
//		char[] c = sss.toCharArray();
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}
//		int a = Integer.parseInt("12");
//		double b = Double.parseDouble("3.4");
//		
//		System.out.println(a * 2);
//		System.out.println(b * 2);
//		
//		try {
//			long c = Long.parseLong("56");
//		} catch (NumberFormatException e) {
//			System.out.println("変換できません");
//		}
//		String str1 = "あいうえお";
//		String[] strArray1 = str1.split("う");
//		showArray(strArray1);
//		String[] strArray2 = "かきくけこ".split("");
//		showArray(strArray2);
//		System.out.println(strArray2[0]);
//		showArray("あ,い,う,え,お".split(","));

//		StringBuilder sb = new StringBuilder();
//		sb.append("あいうえお");
//		sb.append(12345);
//		String str = sb.toString();
//		System.out.println(str);
//		
//		System.out.println(new StringBuilder()
//				.append("かきくけこ").append(67890));
//		int loop = 100000;
//		String str02 = "";
//		System.out.println("通常の文字列結合");
//		for (int i = 0; i < loop; i++) {
//			str02 += i;
//		}
//		System.out.println("------------------終了しました");
//		
//		str02 = "";
//		System.out.println("StringBuilder");
//		StringBuilder sb02 = new StringBuilder();
//		for (int i = 0; i < loop; i++) {
//			sb02.append(i);
//		}
//		System.out.println("------------------終了しました");
//		System.out.println("**************");
//		String[] strs1 = getArray();
//		System.out.println(strs1[0]);
//		System.out.println(getArray()[1]);
//		System.out.println(getArray()[2].equals("う"));
//		
//		String[] aaa = getArray();
//		System.out.println(aaa[2].equals("う"));
//		int a = 1;
//		int b = a;
//		a = 2;
//		System.out.println("a = " + a + ", b = " + b);
//		
//		Sub m = new Sub(1);
//		Sub n = m;
//		m.value = 2;
//		System.out.println("m = " + m.value + ", n = " + n.value);
//		
//		int[] x = {1};
//		int[] y = x;
//		x[0] = 2;
//		System.out.println("x = " + x[0] + ", y = " + y[0]);
//		System.out.println("--------------");
//	}
//	public static void showArray(String[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
//	public static String[] getArray() { 
//				String[] a = new String[] {"あ","い","う"};
//				return a;
//	}
//}

//	private static boolean getTrue() {
//		return true;
//	}