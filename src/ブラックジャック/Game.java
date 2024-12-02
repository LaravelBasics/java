package ブラックジャック;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
	public static void main(String[] args) {
		Path path1 = Paths.get("BJ.txt");
		try (BufferedWriter writer = Files.newBufferedWriter(path1, StandardCharsets.UTF_8)) {
		
		blackJack(writer);
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました" + e);
		}
	}

	/**
	 * ブラックジャック
	 * @param writer 
	 * @throws IOException 
	 */
	public static void blackJack(BufferedWriter writer) throws IOException {
		System.out.println("ブラックジャックを開始します");
		writer.write("ブラックジャックを開始します");
		writer.newLine();
		System.out.println("ルールの説明が必要な場合は【1】を、不要な場合は【0】を入力。");
		int num = Tool.inputNum();
		if (num == 1) {
			Text.showGame();
			Tool.newLine();
			System.out.println("「enter」を押すと、ゲームが始まります");
			Tool.inputStr();//入力待ち
		} else if (num == 0) {
		}
		System.out.println("【ゲームを開始します】");
		Tool.newLine();
		boolean play = true;
		while (play) {
			List<String> cardList = playingCards();//５２枚のトランプ生成して返す
			Collections.shuffle(cardList);//シャッフル
			List<String> drawCardPlayer = new ArrayList<String>();//山札から引いたカードを追加していく
			Player player = new Player(cardList);
			player.firstCard(drawCardPlayer);//引いたカードを表示して加算
			Tool.newLine();
			
			List<String> drawCardDealer = new ArrayList<String>();
			Dealer dealer = new Dealer(cardList);
			dealer.firstCardOpen(drawCardDealer);
			Tool.newLine();
			
			player.addCard(drawCardPlayer);
			Tool.newLine();
			
			if (player.isOver()) {
				Text.showOver();
				play = rematch();
			} else {
				System.out.println("「enter」を押すとディーラーのターンに移ります");
				Tool.inputStr();//入力待ち
				if (dealer.isBlackJack()) {
					player.handOpen(drawCardPlayer, writer);
					dealer.handOpen(drawCardDealer, writer);
					System.out.println("****************************");
					judgement(player, dealer, play);
					System.out.println("****************************");
					play = rematch();
				} else {
					dealer.addCard(drawCardDealer);
					player.handOpen(drawCardPlayer, writer);
					dealer.handOpen(drawCardDealer, writer);
					System.out.println("****************************");
					judgement(player, dealer, play);
					System.out.println("****************************");
					play = rematch();
				}
			}
		}
	}

	/**
	 * 勝敗の判定
	 */
	public static void judgement(Player player, Dealer dealer, boolean play) {
		if (player.isBlackJack() && player.getCount() == 2 &&
				dealer.isBlackJack() && dealer.getCount() == 2) {
			System.out.println("両者ブラックジャック。【引き分けです】");
		} else if (player.isBlackJack() && player.getCount() == 2) {
			System.out.println("プレイヤーはブラックジャックです。【プレイヤーの勝利】");
		} else if (dealer.isBlackJack() && dealer.getCount() == 2) {
			System.out.println("ディーラーはブラックジャックです。【ディーラーの勝利】");
		} else if (player.judge() == 21 && dealer.judge() != 21 ||
				dealer.judge() < player.judge() && player.judge() <= 21 ||
				player.judge() <= 21 && 22 <= dealer.judge()) {
			System.out.println("【プレイヤーの勝利】");
		} else if (dealer.judge() == 21 && player.judge() != 21 ||
				player.judge() < dealer.judge() && dealer.judge() <= 21 ||
				dealer.judge() <= 21 && 22 <= player.judge()) {
			System.out.println("【ディーラーの勝利】");
		} else {
			System.out.println("【引き分けです】");
			play = false;
		}
	}

	/**
	 * ５２枚のトランプを生成
	 */
	public static List<String> playingCards() {//トランプ、playing cards
		List<String> list = new ArrayList<>();
		for (int i = 1; i < 14; i++) {
			list.add("♠の" + i);//１～１３を入れる
			list.add("♡の" + i);
			list.add("♧の" + i);
			list.add("♦の" + i);
		}
		return list;
	}

	/**
	 * 再戦するか
	 */
	public static boolean rematch() {
		Tool.newLine();
		System.out.println("再戦する場合は【1】を、止める場合は【0】を入力");
		int rematch = Tool.inputNum();
		if (rematch == 1) {
			System.out.println("【1】が入力されました。再戦します");
			System.out.println("-------------------------------------------------------------再戦");
			return true;
		} else if (rematch == 0) {
			System.out.println("【0】が入力されました。ゲームを終了します。お疲れ様でした。");
			return false;
		}
		return false;		
	}
}