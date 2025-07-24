package curridulum_B;

public class Qes2 {
/**********************************************************************************
*【概要】条件分岐を理解する
*【詳細】if型条件分岐、
**********************************************************************************/

	public static void main(String[] args) {
		int score = 75; //int型の変数scoreに75を代入
		if(score >= 60) {System.out.println("合格です！");}
		//scoreが60以上なら"合格です！"と表示

		int age = 25; //int 型の変数 age に 25 を代入
		String result = (age >= 20 && age <= 30)? "適正年齢です" : "対象外です";
		System.out.println(result);
		//age が 20 以上 30 以下なら "適正年齢です" と表示。それ以外の場合は "対象外です" と表示

		int age1 = 18; //int型の変数age1に18を代入
		if(age1 >=20) {System.out.println("成人です");} //age が 20 以上なら "成人です" と表示
		else if(age1 >= 13 && age1 <= 19 ) {System.out.println("ティーンエイジャーです");}
		//age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
		else if(age1 <= 12) {System.out.println("子供です");}
		//age が 12 以下なら "子供です" と表示

		int x = 30;
		int y = 15;
		int z = 50; //int 型の変数 x, y, z に 30, 15, 50 を代入
		if (x > y && x > z) {System.out.println(x);}
		else if (y > x && y > z) {System.out.println(y);}
		else if (z > x && z > y) {System.out.println(z);}
		//一番大きい数値を判定して表示

		int num = 0; //int型の変数numを用意
		if(num > 0) {System.out.println("正の数です");} //num の値が 0 より大きければ "正の数です" と表示
		else if(num == 0) {System.out.println("0です");} //num の値が 0 なら "0 です" と表示
		else {System.out.println("負の数です");} //num の値が 0 より小さければ "負の数です" と表示

		int value = 0; //int 型の変数 value を用意
		if(value % 2 == 0) {System.out.println("偶数です");} //value が 偶数 なら "偶数です" と表示
		else {System.out.println("奇数です");} //value が 奇数 なら "奇数です" と表示

		int score1 = 0; 
		if(score1 >= 0 && score1 <= 100)
			if(score1 >= 90) {System.out.println("優");}
			else if(score1 >= 70) {System.out.println("良");}
			else if(score1 >= 50) {System.out.println("可");}
			else if(score1 < 50) {System.out.println("不可");}


		String input = null;
		if(input == null || input.isEmpty()){System.out.println("入力が無効です");}
		//入力が nullまたは空文字のときに「入力が無効です」と表示する処理の作成

		int day =1; //int型の変数dayを用意し、1を代入（dayの値に応じて曜日を表示）
		switch(day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
			//月曜日→1、火曜日→2、水曜日→3、木曜日→4、金曜日→5、土曜日→6、日曜日→7
		default:
			System.out.println("無効な入力です"); //1～7以外の値なら"無効な入力です"と表示
		}

		int month = 1; //int型の変数monthを用意し、1を代入
		switch(month){ //monthの値に応じて季節を表示
		case 12: case 1: case 2:
			System.out.println("冬");
			break;
			//12,1,2→冬
		case 3: case 4: case 5:
			System.out.println("春");
			break;
			//3,4,5→春
		case 6: case 7: case 8:
			System.out.println("夏");
			break;
			//6,7,8→夏
		case 9: case 10: case 11:
			System.out.println("秋");
			break;
			//9,10,11→秋
		default:
			System.out.println("無効な月です"); //それ以外の値なら"無効な入力です"と表示
		}
	}
}



