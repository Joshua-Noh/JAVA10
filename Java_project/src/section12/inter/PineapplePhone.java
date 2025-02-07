package section12.inter;

public class PineapplePhone implements Phone {
	int batteryCapacity = 40;
	boolean isOn = true;
	
	@Override
	public void powerOn() {	// 오버라이딩 하지 않으면 에러가 발생합니다.
		if(batteryCapacity > 30) {
			System.out.println("@@@Power On!! @@@\n");
		} else {
			System.out.println("Low Battery...");
		}
	}
	
	@Override
	public void powerOff() {	// 오버라이딩 하지 않으면 에러 발생.
		System.out.println("@@@Power Off!! @@@\n");
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
		if(batteryCapacity > 10) {
			System.out.println("----- watching Utube -----");
			batteryCapacity -= 10;
			System.out.println("battery is ..."+ batteryCapacity +"%\n");
		} else {
			System.out.println("Low battery ...");
			powerOff();
		}
	}
	
	@Override
	public void charge() {	// 오버라이딩 하지 않으면 에러 발생.
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20 ) {
			System.out.println("--- charging ---");
			batteryCapacity += 5;
			System.out.println("Charged ..."+ batteryCapacity +"%\n");
		} else {
			System.out.println("You don't have to charge ...");
			System.out.println("It's enough..."+ batteryCapacity +"%");
		}
	}
	
}