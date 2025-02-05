package section11;

public class Samsong extends Computer {
	// Samsong 컴퓨터 객체를 만들어줄 클래스
	@Override
	void powerOn() {
		super.powerOn();
		System.out.println("아이 러브 삼송");
	}
}
