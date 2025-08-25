package curriculum_C;

public class Qes6 {

	public static void main(String[] args) {
		Player player = new Player();
		CPU cpu = new CPU();

		//勝つまで繰り返すループ
		while (true) {
			int p = player.getHand();
			int c = cpu.getHand();

			//手の名前を表示
			System.out.println("あなたの手:" + player.handToString(p));
			System.out.println("CPUの手:" + cpu.handToString(c));

			//勝敗の判定を行う
			if (p == c) {
				System.out.println("あいこです。もう一度！");
			} else if ((p == 0 && c == 1) || (p == 1 && c == 2) || (p == 2 && c == 0)) {
				System.out.println("あなたの勝ちです！");
				break; //ループ終了
			} else {
				System.out.println("CPUの勝ちです。もう一度！");
			}

			System.out.println(); //改行

		}

	}

}