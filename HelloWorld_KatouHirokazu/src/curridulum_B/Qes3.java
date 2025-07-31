package curridulum_B;

import java.util.Random; //Randomクラスを使うために必要
import java.util.Scanner; // Scannerクラスを使うために必要

public class Qes3 {
	/**********************************************************************************
	*【概要】繰り返し処理を理解する
	*【詳細】for型、while型、switch型の反復処理を理解する
	**********************************************************************************/

	public static void main(String[] args) {
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		} //for文を使って1から10までの数字を1つずつ表示

		for (int b = 2; b <= 20; b = b + 2) {
			System.out.println(b);
		} //for文を使って2から20までの偶数を1つずつ表示

		for (int c = 10; c >= 1 ; c--) {
			System.out.println("カウント:" + c);
		} //for文を使って10から1までカウントダウンして表示

		int sum = 0;
		for (int d = 1; d <= 100; d++) {
			sum += d++;
		}
		System.out.println(sum);
		// for文を使って1から100までの合計を表示

		String astarisks = "";
		for (int f = 1; f <= 5; f++) {
			astarisks += "*";
			System.out.println(astarisks);
		} //for文を使って三角形を出力

		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		} //while 文を使って 1 から 10 まで を 1 つずつ表示

		int count1 = 2;
		while (count1 <= 20) {
			System.out.println(count1);
			count1 += 2;
		} //while 文を使って 2 から 20 までの偶数 を 1 つずつ表示

		int count2 = 10;
		while (count2 >= 1) {
			System.out.println("カウント:" + count2);
			count2 -= 1;
		} //while 文を使って 10 から 1 まで のカウントダウンを表示

		int sum1 = 0;
		int count3 = 1;
		while (count3 <= 100) {
			sum1 += count3++;
		}
			System.out.println(sum1);
		 //while 文を使って 1 から 100 までの合計 を表示

		Scanner scanner = new Scanner(System.in); // キーボードから入力を受け取る準備
		int num = 1; //numの初期化
		while (num != 0) { //入力が0になるまで何度でも入力を受け付ける
			System.out.print("好きな数値を入力してください："); //ユーザーから 数値を入力 してもらう
			num = scanner.nextInt(); // 数字を受け取る
		}
		System.out.println("終了しました"); //0が入力されたら「終了しました」と表示

		for (int g = 1; g <= 9; g++) { //掛ける側の数字を変数gとする
			for (int h = 1; h <= 9; h++) { //掛けられる側の数字を変数hとする
				System.out.printf("%02d * %02d = %02d ", g, h, g * h);
				//最大2桁の数字が表示され、1桁しかない場合は頭に0が出るようにする
				if (h < 9) {
					System.out.println("| |"); //掛けられる側の数字が9より小さければ仕切り（｜ ｜）を入れる
				} else {
					System.out.println(); //掛けられる側の数字が9になったら改行
		
				
				}
			}
		}
		

		
		Random rand = new Random(); //ランダム生成器の作成
		System.out.println("台数を知りたい商品の商品名を「、」で区切って入力してください:");
		String input = scanner.next(); //ユーザーが入力した文字列を受け取る

		String[] items = input.split("、"); //ユーザーが入力した文字列を「、」で分割し、配列に代入

		int tvnum = rand.nextInt(12); //0~11のランダムな整数
		int displaynum = 11 - tvnum; //テレビとディスプレイは同じ商品扱いとして合計値が常に11になるようにする

		for (String item : items) { //itemにitemsの要素を代入
			switch (item) { //入力された物に対しての残り台数をを行う
			case "テレビ":
			case "ディスプレイ":
				System.out.println(item + "の残りの台数は" + (item.equals("テレビ") ? tvnum : displaynum) + "台です");
				break; 
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				int num1 = rand.nextInt(12);
				//残り台数は0～11までのランダムな値が出るようにする
				System.out.println(item + "の残り台数は" + num1 + "台です");
				break;
			default:
				System.out.println("『" + item + "』は指定の商品ではありません");
				//その他の値が入力された場合の処理を行う
			}

	
		}
		scanner.close();	

	}
}

