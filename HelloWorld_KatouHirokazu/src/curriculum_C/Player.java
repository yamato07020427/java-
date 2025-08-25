package curriculum_C;

import java.util.Scanner;

//プレイヤー（人間）側に数字を打ち込んでもらい、入力を受け付ける処理
public class Player {
	private Scanner scanner = new Scanner(System.in);
	private String[] hands = { "グー", "チョキ", "パー" };

	public int getHand() {
		System.out.println("グー:0、チョキ:1、パー:2 を入力してください。");
		int hand = scanner.nextInt();

		while (hand < 0 || hand > 2) {
			System.out.println("正しい値を入力してください（グー:0、チョキ:1、パー:2 ）");
			hand = scanner.nextInt();
		}
		return hand;

	}

	//手の数字から文字列を返す
	public String handToString(int hand) {
		return hands[hand];
	}

}
