package section18;

//Runnable을 상속
class whiteFlag implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("백기 올려");
		}
	}
}
//스레드 메인
public class RunnableExample {
	public static void main(String[] args) {
		Thread write = new Thread(new whiteFlag());
		write.start();
	}
}