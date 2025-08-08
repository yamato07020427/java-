package curridulum_B;

public class Qes5 {

	/**********************************************************************************
	*【概要】メソッドとクラスについて
	*【詳細】メソッドと別クラスのインポートを学ぶ
	**********************************************************************************/

	public static void helloWorld() {
		System.out.println("Hello, World!");
	} // //引数なし、戻り値なしで"Hello, World!"を表示するメソッドhelloWorldを作成

	public static int doubleValue(int num) {
		return num * 2;
	} //引数が整数、戻り値は引数の2倍、戻り値を基に"10を2倍すると20です。"と表示するメソッドdoubleValueを作成

	public static boolean isEven(int num) {
		return num % 2 == 0;
	} //引数が整数、戻り値は偶数ならtrue、奇数ならfalse。"10 は偶数です。7 は奇数です。"と表示するメソッドisEvenを作成

	public static void main(String[] args) {
		helloWorld();

		int a = doubleValue(10);
		System.out.println("10を2倍すると" + a + "です。");

		int num1 = 10;
		int num2 = 7;
		if (isEven(num1)) {
			System.out.println(num1 + "は偶数です。");
		} else {
			System.out.println(num1 + "は奇数です。");
		}
		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です。");
		} else {
			System.out.println(num2 + "は奇数です。");
		}

	}

}





