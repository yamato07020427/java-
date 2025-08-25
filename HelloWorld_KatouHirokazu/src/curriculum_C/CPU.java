package curriculum_C;

import java.util.Random;

//CPU（コンピューター）がランダムで手を出してくる処理
public class CPU {

	private Random rand = new Random();
	private String[] hands = { "グー", "チョキ", "パー" };

	public int getHand() {
		return rand.nextInt(3);
	}

	public String handToString(int hand) {
		return hands[hand];
	}

}
