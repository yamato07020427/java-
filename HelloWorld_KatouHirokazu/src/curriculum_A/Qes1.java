package curriculum_A;

public class Qes1 {
/**********************************************************************************
*【概要】変数処理
*【詳細】変数を処理する
**********************************************************************************/
	
	public static void main(String[] args) {
		/*-------------------------------------------------------------------------
		 * 【概要】変数の出力
		-------------------------------------------------------------------------*/
		byte byteNum; //変数byteNumの初期値を設定
		short shortNum; //変数shortNumの初期値を設定
		int intNum; //変数intNumの初期値を設定
		long longNum; //変数longNumの初期値を設定
		float floatNum; //変数floatNumの初期値を設定
		double doubleNum; //変数doubleNumの初期値を設定
		char letter; //変数letterの初期値を設定
		String letters; //変数lettersの初期値を設定
		boolean isBoolean; //変数isBooleanの初期値を設定
		
		byteNum = 10; //変数byteNumに10を代入
		shortNum = 100; //変数shortNumに100を代入
		intNum = 1000; //変数intNumに1000を代入
		longNum = 10000; //変数longNumに10000を代入
		floatNum = 9.5f; //変数floatNumに9.5fを代入
		doubleNum = 10.5; //変数doubleNumに10.5を代入
		letter = 'a'; //変数letterに"a"を代入
		letters = "ハロー"; //変数lettersに"ハロー"を代入
		isBoolean = true; //変数isBooleanにtrueを代入
		
		System.out.println(longNum + intNum + shortNum + byteNum); //11110を出力
		System.out.println(byteNum * 2); //20を出力
		System.out.println(letter + "" + letters + "" + isBoolean); //aハロー trueを出力
		System.out.println(longNum + intNum + shortNum + doubleNum + byteNum + floatNum); //数字を全て足して出力
		System.out.println(longNum * intNum * shortNum * Math.floor(doubleNum) * byteNum * Math.floor(floatNum)); //小数点以外の数字を全てかけて出力
		System.out.println(doubleNum / shortNum); //10.5割る100をして出力
		System.out.println(byteNum - shortNum); //10引く100をして出力
		
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "！");
		/*name という String型の変数 を宣言し
		 * その変数に "山田太郎" という値を代入。
		 コンソールに こんにちは、山田太郎さん！ と表示。*/
		
		int age = 25;
		System.out.println("年齢:" + age + "歳");
		/*age という int型の変数 を宣言し
		 * その変数に 25 を代入。
		 コンソールに  年齢: 25歳 と表示。*/
		
		int num1 = 10; //num1 という int型の変数 を宣言し、10 を代入
		int num2 = 5; //num2 という int型の変数 を宣言し、5 を代入
		int sum = num1 + num2;
		System.out.println(sum); 
		//num1 と num2 を足した結果を sum という変数に代入し、コンソールに表示。
		
		int score = 80; //score という int型の変数 を宣言し、80 を代入
		score = score + 20; //score に 20 を加えて、更新する
		System.out.println("最終スコア:" + score);
		//最終スコア: 100をコンソールに表示。
		
		double price = 99.99; //price という double型の変数 を宣言し、99.99 を代入
		System.out.println("整数価格：" + (int)price);
		//priceをint型 に変換し、整数価格: 99 とコンソールに表示。
		
		String numStr = "123"; //String 型の変数 numStr に "123" を代入
		System.out.println("変換後の値:" + (Integer.parseInt(numStr) +10));
		//numStrをint 型に変換し、変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示。
		
		int num = 50; //int 型の変数 num に 50 を代入
		System.out.println("得点" + String.valueOf(num) + "点");
		//numをString型に変換し、"得点: 50点" の形でコンソールに表示
		
		int a = 10; //int 型の変数 a に 10 を代入
		int b = 20; //int 型の変数 b に 20 を代入
		boolean result = (a < b);
		// 【条件式】aがbより小さいかどうかをboolean変数resultに代入
		System.out.println(result);
		
		int x = 15; //int 型の変数 x に 15 を代入
		String max = (x >= 10) ? "OK":"NG";
		System.out.println(max);
		//x が 10 以上なら "OK"、そうでなければ "NG" を表示
		
		String text = "私はJavaが好きです。Javaは楽しい！";
		System.out.println(text.replace("Java","Python")); 
		//String text = "私はJavaが好きです。Javaは楽しい！";という文章の中にある 「Java」 を 「Python」 に置き換えて表示
		
		float ans = 7 / 6;
		System.out.println(ans);

		


	



		
		

		
		


		
		
 
	}

}
