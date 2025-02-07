package section12.ab;

public abstract class Phone {
	abstract void openingLogo();
	
	void powerOn() {
		openingLogo(); // 자식 클래스들이 구현한 오버라이딩 메서드가 호출됨
		System.out.println("핸드폰이 켜집니다.");
	}
	
	void powerOff() {
		System.out.println("핸드폰이 꺼집니다.");
	}
}