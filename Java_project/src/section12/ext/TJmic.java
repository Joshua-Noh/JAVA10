package section12.ext;

public class TJmic implements BluetoothMIC {
	@Override
	public void sing() { // Microphone 인터페이스의 추상 메서드
		System.out.println("마이크에 대고 노래를 부릅니다.");
	}
	
	@Override
	public void music() { // Speaker 인터페이스의 추상 메서드
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
	}
	
	@Override
	public void connect() { // BluetoothMIC 인터페이스의 추상 메서드
		System.out.println("핸드폰과 블루투스 연결이 되었습니다.");
	}
}