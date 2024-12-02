package ブラックジャック;

public class Text {
	Text() {//コンストラクタ
	}
	
	/**
	 * ゲームの説明
	 */
	public static void showGame() {
		System.out.println("【ブラックジャックのルール】");
		System.out.println("初めにディーラーがカードを2枚ずつ配ります。");
		System.out.println("ゲーム開始時、『ディーラー』の手は２枚のうち1枚だけ開示されます");
		System.out.println("『ディーラー』は『プレイヤー』に対してカードの追加を行うかを聞きます。");
		System.out.println("カードを追加する場合は、【１】を入力");
		System.out.println("手持ちの点数が十分だと思ったら、【０】を入力。その点数のままディーラーと勝負します。");
		System.out.println("カードは何枚でも追加できますが、21点を越えてしまうとその時点で『プレイヤー』の負けとなります。");
		System.out.println("『プレイヤー』が選択を終えた後、最後に『ディーラー』がカードをめくり、17点以上になるまでカードを引き続け、【勝負】となります。");
		System.out.println("『ディーラー』が22点以上になった場合は、『ディーラー』の負けとなり、『プレイヤー』が21点以下の場合勝利となります。");
		System.out.println("『ディーラー』よりも21点に近い場合、『プレイヤー』は勝ちとなり、逆に『ディーラー』よりも21点に遠い場合プレイヤーは負けとなります。");
		System.out.println("同点の場合は引き分けとなります。");
		Tool.newLine();
		System.out.println("【カードの数え方】");
		System.out.println(" 2～9 まではそのままの数字、10・J・Q・K は「すべて10点」と数えます。");
		System.out.println("また、 A （エース）は「1点」もしくは「11点」のどちらに数えても構いません。");
		Tool.newLine();
		System.out.println("【特別な役】");
		System.out.println("最初に配られた2枚のカードが「Aと10点札」で21点が完成していた場合を");
		System.out.println("『ブラックジャック』といい、片方のみの場合その時点で勝ちとなります。");
	}
	
	/**
	 * カードを追加するか聞く
	 */
	public static void showAddCard() {
		System.out.println("プレイヤーのターンです。カードを追加しますか？");
		System.out.print("カードを追加する場合は【１】  ");
		System.out.println("現在の点数で勝負する場合は【０】を入力。");
	}
	
	/**
	 * ブラックジャックになった時
	 */
	public static void showBlackJackDealer() {
		System.out.println("ディーラーの手は【ブラックジャック】です");
	}
	
	/**
	 * ブラックジャックになった時
	 */
	public static void showBlackJack() {
		System.out.println("プレイヤーの手は【ブラックジャック】です。ディーラーのターンに移ります。");
	}
	
	/**
	 * ディーラーの手が22を超えた
	 */
	public static void showOverDealer() {
		System.out.println("『ディーラー』の手は【22】を超えました。");
	}
	
	/**
	 * プレイヤーのカードの合計が22を超えた
	 */
	public static void showOver() {
		System.out.println("カードの合計が【22】を超えました。『プレイヤー』の負けです");
	}
	
	/**
	 * キーボード【１】が入力された時
	 */
	public static void showOne() {
		System.out.println("【１】が入力されました。カードを追加します。");
	}
	
	/**
	 * キーボード【０】が入力された時
	 */
	public static void showZero() {
		System.out.println("【０】が入力されました。現在の点数で勝負します");
	}
	
	/**
	 * ディーラーのターン宣言
	 */
	public static void showDealer() {
		System.out.println("ディーラーのターンです。");
	}
	
	/**
	 * 勝負する宣言
	 */
	public static void showCompete() {
		System.out.println("ディーラー「勝負します」");
	}
}
