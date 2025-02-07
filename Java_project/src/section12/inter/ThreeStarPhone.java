package section12.inter;

public class ThreeStarPhone implements Phone {
	int batteryCapacity = 35;
	boolean isOn = true;
	
	@Override
	public void powerOn() {	// 오버라이딩 하지 않으면 에러가 발생합니다.
		if(batteryCapacity > 30) {
			System.out.println("*** 폰이 켜졌습니다. ***\n");
		} else {
			System.out.println("배터리가 부족합니다 ...");
		}
	}
	
	@Override
	public void powerOff() {	// 오버라이딩 하지 않으면 에러 발생.
		System.out.println("***폰이 꺼졌습니다.***\n");
		isOn = false;
	}
	
	@Override
	public boolean isOn() {		// 오버라이딩 하지 않으면 에러 발생.
		if(isOn) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void watchUtube() {	// 오버라이딩 하지 않으면 에러 발생.
		if(batteryCapacity > 15) {
			System.out.println("----- U튜브 시청 중 -----");
			batteryCapacity -= 10;
			System.out.println("잔여 배터리 ..."+ batteryCapacity +"%\n");
		} else {
			System.out.println("배터리가 부족합니다. ...");
			powerOff();
		}
	}
	
	@Override
	public void charge() {	// 오버라이딩 하지 않으면 에러 발생.
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20 ) {
			System.out.println("--- 충전 중 ---");
			batteryCapacity += 10;
			System.out.println("잔여 배터리 ..."+ batteryCapacity +"%\n");
		} else {
			System.out.println("충전할 필요가 없습니다.");
			System.out.println("잔여 배터리 ..."+ batteryCapacity +"%");
		}
	}
	
	
}