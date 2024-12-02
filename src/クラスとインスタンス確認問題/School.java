package クラスとインスタンス確認問題;

import java.util.ArrayList;
import java.util.List;

public class School {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//出席番号：１名前：おいかわ
		Student student1 = new Student(1, "及川");
		//出席番号：２名前：おだ
		Student student2 = new Student(2, "小田");
		//出席番号：３名前：きたがわ
		Student student3 = new Student(3, "北川");
//		student1.attendanceNumber();
//		student2.attendanceNumber();
//		student3.attendanceNumber();
//	Student[] student = new Student[100];
//	for (int i = 0; i < 100; i++) {
//		student[i] = new Student(i + 101, "生徒");
//		student[i].setTestScore(0,0,0);
//	}
////		for (int x =0; x < 100; x++) {
////	    student[x].showAll();
////     }
////		
//		Student[] oda01 = new Student[100];//インスタンス１０0回生成、答え
//		for (int i = 0; i < oda01.length; i++) {
//			oda01[i] = new Student(i + 101, "生徒");
//			oda01[i].setTestScore(0, 0, 0);
//		}
////		oda01[1].showAll();
//		
//		Student[] oda03 = new Student[100];//拡張forでは、インスタンス１００回生成は無理
//		int number = 101;
//		for (Student s : oda03) {
//			s = new Student(number++, "生徒");
//			s.setTestScore(0, 0, 0);
//		}
		//配列のインスタンスをoda02に代入
		List<Student> oda02 = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
//			//Studentのインスタンス名s生成
			Student s = new Student(i + 100, "生徒");
//			//インスタンスsのsetTestScore()を呼んで(0, 0, 0)をセット
			s.setTestScore(0, 0, 0);
//			//配列oda02から、ArrayListの内のaddメソッドを呼びsを入れる
			oda02.add(s);
			s.showAll();
		}
	}
}
//			System.out.println("出席番号" +  s.getId());

////		for (int x = 1; x <= 100; x++) {
//			s.setId(x);
//			System.out.println("出席番号" + 100 + s.getId());
//	}
		//ArrayList内にあるget()メソッド
		//System.out.println("size = " +  oda02.size());
//		for(int i=0; i<100;i++) {
//		oda02.get(i).showAll();
//		}
//		for(Student  s : oda02) {
//			s.showAll();
//		}
		//三人の点数をセット
//		student1.setTestScore(95, 5, 67);
//		student2.setTestScore(20, 100, 87);
//		student3.setTestScore(70, 88, 65);
////		//三人の点数呼び出し
//		student1.testScore();
//		student2.testScore();
//		student3.testScore();
////		//三人分の平均点
//		System.out.println((student1.average() + 
//									  student2.average() +
//									  student3.average()) / 3);
//		int total = avg(student1.average() ,
//						student2.average() ,
//						student3.average())
//	public static void show(Student[] s) {
//		for (Student tmp : s) {
//			System.out.println(tmp);