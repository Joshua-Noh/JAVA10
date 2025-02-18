package section18;

class TimeThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("스레드 출력" + (i+1));
			
			try {
				// 1초간 일시 정지
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("sleep Error");
			}
		}
	}
}

public class ThreadSleepExample {
	public static void main(String[] args) {
		TimeThread th = new TimeThread();
		th.start();
	}
}