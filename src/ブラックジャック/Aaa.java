package ブラックジャック;

// テストファイルです

import java.util.List;

public class Aaa {
	private int hand = 0;
	private int aceEleven = 0;//エース(数字は１1の状態で保存)
	private int count = 0;
	private List<String> cardList;

	public Aaa(List<String> cardList) {
		this.cardList = cardList;
	}

	public void player() {
	}

	/**
	 * 引いたカードと、
	 * エースの枚数を数える為aceに１で加算、１１として扱う用にaceElevenに保存
	 * @param cardList 
	 */
	public void showAddCard(List<String> drawCard) {
		drawCard.add(cardList.remove(0));//山札から１枚引いてdrawCardに追加
		int draw = Integer.parseInt(drawCard.get(this.getCount()).substring(2));//１回目引いて代入
		System.out.println("配られたカードは  " + "【" + drawCard.get(this.getCount()) + "】");
		switch (draw) {
		case 1:
			this.hand += draw;//１を保存
			this.aceEleven = (draw + 10);//11を保存
			break;
		case 11:
			this.hand += (draw - 1);//10を保存
			break;
		case 12:
			this.hand += (draw - 2);
			break;
		case 13:
			this.hand += (draw - 3);
			break;
		default:
			this.hand += draw;
			break;
		}
		this.count++;//1
	}

	/**
	 * 21に近い変数を返す
	 */
	public int judge() {
		if (this.aceEleven == 11 && (this.hand - 1) + this.aceEleven <= 21) {
			return (this.hand - 1) + this.aceEleven;
		} else {
			return this.hand;
		}
	}

	/**
	 * ブラックジャックか確認する
	 */
	public boolean isBlackJack() {
		if (aceEleven == 11) {
			return hand == 21 || (hand - 1) + aceEleven == 21;
		} else {
			return hand == 21;
		}
	}

	/**
	 * カードの合計が22以上か判定する
	 */
	public boolean isOver() {
		if (this.aceEleven == 11) {
			return 22 <= this.hand ||
					22 <= this.hand && 22 <= (this.hand - 1) + this.aceEleven;
		} else {
			return 22 <= this.hand;
		}
	}

	/**
	 * カードの合計
	 */
	public void totalHand() {
		if (this.aceEleven == 11) {
			System.out.print("プレイヤーの合計は" + this.hand);
			System.out.println("  or  " + ((this.hand - 1) + this.aceEleven));
		} else {
			System.out.println("プレイヤーの合計は" + this.hand);
		}
	}

	/**
	 * プレイヤーがカードを追加
	 */
	public void addCard(List<String> drawCard) {
		boolean cardDraw = true;
		while (cardDraw) {
			if (isBlackJack() && this.count == 2) {
				Text.showBlackJack();
				cardDraw = false;
			} else if (isOver()) {
				cardDraw = false;
			} else {
				Text.showAddCard();//カードを追加するか
				int num = Tool.inputNum();//キーボード入力待ち
				if (num == 1) {//入力１
					Text.showOne();//入力された時の説明
					System.out.println("------------------------カード追加" + (this.getCount() - 1) + "回目");//追加1回目
					showAddCard(drawCard);
					totalHand();
					if (this.hand == 21) {
						System.out.println("カードの合計が【21】になりました。ディーラーのターンに移ります");
						cardDraw = false;
					}
				} else if (num == 0) {//入力０
					Text.showZero();
					cardDraw = false;
				}
			}
		}
	}

	/**
	 * プレイヤーの手を全て開示
	 * @param drawCard 
	 */
	public void handOpen(List<String> drawCard) {//Player
		System.out.print("プレイヤーの手は");
		for (String s : drawCard) {
			System.out.print("【" + s + "】" + "  ");
		}
		totalHand();
	}

	/**
	 * 最初にカードを２枚引く
	 */
	public void firstCard(List<String> drawCard) {
		for (int i = 0; i < 2; i++) {//カードを２回引く
			drawCard.add(cardList.remove(0));//山札から１枚引いてdrawCardに追加
			int draw = Integer.parseInt(drawCard.get(this.getCount()).substring(2));//１回目引いて代入
			switch (draw) {
			case 1:
				this.hand += draw;//１を保存
				this.aceEleven = (draw + 10);//11を保存
				break;
			case 11:
				this.hand += (draw - 1);//10を保存
				break;
			case 12:
				this.hand += (draw - 2);
				break;
			case 13:
				this.hand += (draw - 3);
				break;
			default:
				this.hand += draw;
				break;
			}
			this.count++;//1
		}
		System.out.println("配られたカードは  " + "【" + drawCard.get(0) + "】" + "【" + drawCard.get(1) + "】");
		totalHand();
	}

	public int getCount() {
		return count;
	}
}
