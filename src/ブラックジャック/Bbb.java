// package ブラックジャック;

// // テストファイルです

// import java.util.List;

// public class Bbb {

// 	private int hand = 0;
// 	private int aceEleven = 0;
// 	private int count = 0;
// 	private List<String> cardList;

// 	public Bbb(List<String> cardList) {
// 		this.cardList = cardList;
// 	}

// 	public void dealer() {
// 	}

// 	/**
// 	 * 引いたカードと、
// 	 * エースの枚数を数える為aceDealerに１で加算、１１として扱う用にaceElevenDealerに保存
// 	 * @param cardList 
// 	 */
// 	public void showAddCard(List<String> drawCard) {
// 		drawCard.add(cardList.remove(0));//山札から１枚引いて手札に追加
// 		int draw = Integer.parseInt(drawCard.get(this.count).substring(2));//１回目引いて代入
// 		System.out.println("ディーラーの引いたカードは  " + "【" + drawCard.get(this.count) + "】");
// 		switch (draw) {
// 		case 1:
// 			this.hand += draw;//１を保存
// 			this.aceEleven = (draw + 10);//11を保存
// 			break;
// 		case 11:
// 			this.hand += (draw - 1);//10を保存
// 			break;
// 		case 12:
// 			this.hand += (draw - 2);
// 			break;
// 		case 13:
// 			this.hand += (draw - 3);
// 			break;
// 		default:
// 			this.hand += draw;
// 			break;
// 		}
// 		this.count++;//1
// 	}

// 	/**
// 	 * 21に近い変数を返す
// 	 */
// 	public int judge() {
// 		if (this.aceEleven == 11 && (this.hand - 1) + this.aceEleven <= 21) {
// 			return (this.hand - 1) + this.aceEleven;
// 		} else {
// 			return this.hand;
// 		}
// 	}

// 	/**
// 	 * ディーラーがブラックジャックか判定
// 	 */
// 	public boolean isBlackJack() {
// 		if (this.aceEleven == 11) {
// 			return this.hand == 21 || (this.hand - 1) + this.aceEleven == 21;
// 		} else {
// 			return this.hand == 21;
// 		}
// 	}

// 	/**
// 	 * ディーラーの手が22以上か判定
// 	 */
// 	public boolean isOver() {
// 		if (this.aceEleven == 11) {
// 			return 22 <= this.hand ||
// 					22 <= this.hand && 22 <= (this.hand - 1) + this.aceEleven;
// 		} else {
// 			return 22 <= this.hand;
// 		}
// 	}

// 	/**
// 	 * ディーラーのカードの合計
// 	 */
// 	public void totalHand() {
// 		if (this.aceEleven == 11) {
// 			System.out.print("ディーラーの合計は" + this.hand);
// 			System.out.println("  or  " + ((this.hand - 1) + this.aceEleven));
// 		} else {
// 			System.out.println("ディーラーの合計は" + this.hand);
// 		}
// 	}

// 	/**
// 	 * ディーラーの手を全て開示
// 	 * @param cardList 
// 	 */
// 	public void handOpen(List<String> drawCard) {//dealer
// 		System.out.print("ディーラーの手は");
// 		for (String s : drawCard) {
// 			System.out.print("【" + s + "】" + "  ");
// 		}
// 		totalHand();
// 	}

// 	/**
// 	 * ディーラーがカードを追加
// 	 */
// 	public void addCard(List<String> drawCard) {
// 		boolean cardDraw = true;
// 		while (cardDraw) {
// 			if (17 <= this.hand || aceEleven == 11 && 17 <= (this.hand - 1) + aceEleven && (this.hand - 1) + aceEleven <= 21) {//入力０
// 				Text.showCompete();
// 				Tool.newLine();
// 				cardDraw = false;
// 			} else {//ディーラーの手が17未満の時
// 				Tool.newLine();
// //				System.out.println("------------------------");
// 				System.out.println("ディーラーがカードを追加しました。");
// 				System.out.println("------------------------カード追加" + (this.count - 1) + "回目");//追加1回目
// 				showAddCard(drawCard);//引いたカードを表示して加算
// 				if (this.hand == 21 || this.aceEleven == 11 && (this.hand - 1) + this.aceEleven == 21) {
// 					Text.showCompete();
// 					Tool.newLine();
// 					cardDraw = false;
// 				}
// 			}
// 		}
// 	}

// 	/**
// 	 * 最初にカードを２枚引き、一枚目のみ開示
// 	 */
// 	public void firstCardOpen(List<String> drawCard) {
// 		for (int i = 0; i < 2; i++) {//２回カードを引く
// 			drawCard.add(cardList.remove(0));//山札から１枚引いて手札に追加
// 			int draw = Integer.parseInt(drawCard.get(this.count).substring(2));//１回目引いて代入
// 			if (i == 0) {
// 				System.out.println("ディーラーのカードは  " + "【" + drawCard.get(this.count) + "】" + "【???】");
// 			}
// 			this.count++;//1
// 			switch (draw) {
// 			case 1:
// 				this.hand += draw;//１を保存
// 				this.aceEleven = (draw + 10);//11を保存
// 				break;
// 			case 11:
// 				this.hand += (draw - 1);//10を保存
// 				break;
// 			case 12:
// 				this.hand += (draw - 2);
// 				break;
// 			case 13:
// 				this.hand += (draw - 3);
// 				break;
// 			default:
// 				this.hand += draw;
// 				break;
// 			}
// 		}
// 	}

// 	public int getCount() {
// 		return this.count;
// 	}
// }
