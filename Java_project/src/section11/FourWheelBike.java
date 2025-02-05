package section11;

public class FourWheelBike extends Bike {
	// 강제형변환 2
	FourWheelBike(String riderName){
		super(riderName);
	}
	
	@Override
	void info() {
		super.info();
	}
	
	void addWheel() {
		if(wheel == 2) {
			wheel = 4;
			System.out.println(riderName +"의 자전거에 보조 바퀴를 부착하였습니다.");
		} else {
			System.out.println(riderName +"의 자전거에 이미 조보 바퀴가 부착되어 있습니다.");
		}
	}
}
