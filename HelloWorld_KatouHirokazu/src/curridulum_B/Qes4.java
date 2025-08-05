package curridulum_B;

import java.util.Arrays;
import java.util.Scanner;

public class Qes4 {

	/**********************************************************************************
	*【概要】配列を理解し、反復処理を復習する
	*【詳細】多次元配列を理解と反復処理を使い、多次元配列の処理を行う
	**********************************************************************************/

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 }; //int型の配列作成、1~5を格納
		System.out.println(Arrays.toString(numbers));
		//全要素を順番に表示

		int[] numbers1 = { 10, 20, 30, 40, 50 }; //int型の配列{10,20,30,40,50}を用意
		for (int a = 4; a >= 0; a--) {
			System.out.println(numbers1[a]); //配列の要素を逆順に表示
		}

		int[] numbers2 = { 3, 5, 7, 9, 11 }; //int型の配列{3,5,7,9,11}を用意
		int sum = 0; //変数sumを初期化
		for (int b = 0; b < numbers2.length; b++) {
			sum += numbers2[b]; //sumを使い、配列の全要素の合計値を計算
		}
		System.out.println(sum);

		int[] numbers3 = { 12, 7, 9, 21, 5, 18 }; //int型の配列{12,7,9,21,5,18}を用意
		int max = numbers3[0]; //int型の変数Max（最大値）に最初の配列を代入
		int min = numbers3[0]; ////int型の変数Min（最小値）に最初の配列を代入
		for (int c = 1; c < numbers3.length; c++) {
			if (max < numbers3[c]) {
				max = numbers3[c];
			} //Maxの値がMaxよりも大きいなら値を入れ替え
			if (min > numbers3[c]) {
				min = numbers3[c];
			} //Minの値がMinよりも小さいなら値を入れ替え
		}
		System.out.println("最大値は" + max + "です。");
		System.out.println("最小値は" + min + "です。");

		int[] numbers4 = { 1, 2, 3, 4, 5 }; //int型の配列{1,2,3,4,5}を用意
		for (int d = 0; d < numbers4.length; d++) {
			numbers4[d] = numbers4[d] * 2; //要素を2倍に
		}
		for (int num : numbers4) {
			System.out.println(num);
		}

		int[] numbers5 = { 4, 7, 10, 15, 20 }; //int型の配列{4,7,10,15,20}を用意
		Scanner scanner = new Scanner(System.in); //ユーザーの入力を受け取る準備
		System.out.println("調べたい数字を入力してください:");
		int input = scanner.nextInt(); //数字を受け取る
		boolean found = false; //配列に含まれているかどうかをチェックするための変数foundを初期化
		for (int num1 : numbers5) {
			if (num1 == input) {
				found = true; //一致する値を見つけたらtrueに変える
				break; //見つけたらループを抜ける
			}
		}
		if (found) {
			System.out.println(input + "は配列に含まれています");
		} else {
			System.out.println(input + "は配列に含まれていません");
		}
		scanner.close();

		int[][] array = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		}; //二次元配列{1,2}{3,4}{5,6}を用意
		for (int e = 0; e < array.length; e++) { //行をループ
			for (int f = 0; f < array[e].length; f++) { //列をループ
				System.out.println(array[e][f] + " "); //各要素を表示
			}
			System.out.println(); //改行
		}

		int[][] array1 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		}; //二次元配列{10, 20, 30}, {40, 50, 60}, {70, 80, 90}を用意
		int sum1 = 0; //変数sum1を初期化
		for (int g = 0; g < array1.length; g++) { //行をループ
			for (int h = 0; h < array1[g].length; h++) { //列をループ
				sum1 += array1[g][h]; //配列の全ての要素を足していく処理
			}
		}
		System.out.println(sum1); //合計値の出力

		int[][] array2 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};//二次元配列{12, 15, 8}, {6, 19, 25}, {30, 2, 10}を用意する

		int max1 = array2[0][0]; //int型の変数Max1（最大値）に最初の配列を代入
		int min1 = array2[0][0]; //int型の変数Min1（最小値）に最初の配列を代入
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				if (max1 < array2[i][j]) {
					max1 = array2[i][j];
				} //Max1の値がMax1よりも大きいなら値を入れ替え
				if (min1 > array2[i][j]) {
					min1 = array2[i][j];
				} //Min1の値がMin1よりも小さいなら値を入れ替え
			}
		}
		System.out.println("最大値は" + max1 + "です。");
		System.out.println("最小値は" + min1 + "です。");

		int[][][] array3 = {
				{
						{ 1, 2 },
						{ 3, 4 }
				},
				{
						{ 5, 6 },
						{ 7, 8 }
				}
		}; //3次元配列{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}を用意する
		for (int k = 0; k < array3.length; k++) { //1次元目のループ
			for (int l = 0; l < array3[k].length; l++) { //二次元目のループ
				for (int m = 0; m < array3[k][l].length; m++) { //三次元目のループ
					System.out.println(array3[k][l][m] + " "); //各要素を表示
				}
				System.out.println(); //改行
			}

		}

	}
}

