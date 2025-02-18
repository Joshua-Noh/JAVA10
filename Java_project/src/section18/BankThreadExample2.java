package section18;

class AddThread2 implements Runnable {
	private Bank b;
	private String name;
	public AddThread2(String name, Bank b) {
		this.name = name;
		this.b= b;
	}
	
	@Override
	public void run() {
		synchronized(b) {
			try {
				for(int i = 0; i < 10; i++) {
					Thread.sleep(1000);
					b.addMoney(1000);
					System.out.println(this.name + " 현재 잔고 : " + b.getMoney());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class BankThreadExample2 {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread th1 = new Thread(new AddThread2("1번", b));
		Thread th2 = new Thread(new AddThread2("2번", b));
		th1.start();
		th2.start();
	}
}