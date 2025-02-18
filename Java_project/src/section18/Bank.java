package section18;

public class Bank {
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	// 동기화 처리
//	public synchronized void addMoney(int money) {
//		this.money += money;
//	}
	
}