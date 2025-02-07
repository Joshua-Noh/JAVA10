package section12.inter;

public interface Phone {
	
	public static final int  MAX_BATTERY_CAPACITY = 100;
	
	abstract void powerOn();	// <-- 공통 구현부가 사라짐
	abstract void powerOff();	// <-- 공통 구현부가 사라짐
	abstract boolean isOn();	// 새로운 메서드 추가
	abstract void watchUtube();	// 새로운 메서드 추가
	abstract void charge();		// 새로운 메서드 추가
}
