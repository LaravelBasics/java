package 上級準備編;

public class Sub {
	private int num = 0;
	private int number = 0;
	public int value;
	
	public Sub(int value) {
		this.value = value;
	}
	
	public Sub add(int num) {
		this.num += num;//加算
		return this;//インスタンスsを返す
	}
	
	public void add02(int num) {
		this.num += num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public int aaa(int num) {
		this.num += num;
		return this.num;
	}
	public void show() {
		System.out.println(num);
	}
	
	

}
