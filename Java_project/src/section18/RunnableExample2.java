package section18;

public class RunnableExample2 {
	public static void main(String[] args) {
		//Runnable 인터페이스를 익명 객체로 처리
		Runnable white = () -> {
			while(true) {
				System.out.println("백기 올려!");
			}
		};
		
		Thread whiteFlag = new Thread(white);
		whiteFlag.start();
	}
}