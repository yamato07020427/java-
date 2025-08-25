package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Qes7 {

	//Daemonステータスを読み込むメソッド
	public static int[] loadDaemon(String filename) {
		int[] status = new int[3]; //HP,AT,SP
		try (BufferedReader br = new BufferedReader(new FileReader("daemon_status.txt"))) {
			br.readLine(); //1行目は名前なので読み飛ばす
			status[0] = Integer.parseInt(br.readLine()); //HP
			status[1] = Integer.parseInt(br.readLine()); //AT
			status[2] = Integer.parseInt(br.readLine()); //SP
		} catch (IOException | NumberFormatException e) {
			System.out.println("Daemonの読み込み失敗。デフォルト値を設定");
			status[0] = 85;
			status[1] = 12;
			status[2] = 6;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		//Player作成
		System.out.println("プレイヤーの名前を入力してください:");
		String playerName = sc.nextLine();
		int playerHP = 50 + rand.nextInt(51); //50~100
		int playerAT = 5 + rand.nextInt(6); //5~10
		int playerSP = 3 + rand.nextInt(6); //3~8

		Character player = new Character(playerName, playerHP, playerAT, playerSP);
		player.showStatus();

		//Daemon作成
		String daemonName = "Daemon";
		int[] daemonStatus = loadDaemon("daemon_status.txt");
		int daemonHP = daemonStatus[0];
		int daemonAT = daemonStatus[1];
		int daemonSP = daemonStatus[2];
		System.out.println(daemonName + "のステータス: HP=" + daemonHP + " AT=" + daemonAT + " SP=" + daemonSP);

		//先攻・後攻決定
		boolean playerTurn;
		if (playerSP > daemonSP) {
			playerTurn = true;
			System.out.println(playerName + "の先攻です！");
		} else if (playerSP < daemonSP) {
			playerTurn = false;
			System.out.println(daemonName + "の先攻です！");
		} else {
			//同じ場合はランダム
			playerTurn = rand.nextBoolean();
			System.out.println((playerTurn ? playerName : daemonName) + "の先攻です！");
		}

		//ターン制バトル
		while (player.isAlive() && daemonHP > 0) {
			//Player攻撃
			if (playerTurn) {
				daemonHP -= playerAT;
				System.out.println(playerName + "の攻撃！" + daemonName + "に" + playerAT + "のダメージ！");
				//Daemon攻撃
			} else {
				player.hp -= daemonAT;
				System.out.println(daemonName + "の攻撃！" + playerName + "に" + daemonAT + "のダメージ！");
			}

			//HP表示
			System.out.println(playerName + " HP=" + player.hp + " / " + daemonName + " HP=" + daemonHP);
			System.out.println("--------------------------------");

			//ターン交代
			playerTurn = !playerTurn;
		}

		//結果
		String result = (player.isAlive()) ? playerName + "の勝利！" : daemonName + "の勝利！";
		System.out.println("バトル終了！" + result);

		//結果をテキストファイルに出力
		try (PrintWriter pw = new PrintWriter(new FileWriter("battle_log.txt"))) {
			pw.println(result);
		} catch (IOException e) {
			System.out.println("結果の保存に失敗しました" + e.getMessage());
		}
		sc.close();
	}

}

