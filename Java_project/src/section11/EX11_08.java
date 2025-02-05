package section11;

public class EX11_08 {

	public static void main(String[] args) {
		// 강제 형 변환 3
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		//b.addWheel(); // 부모 타입으로는 호출 불가
		System.out.println();
		
		FourWheelBike fwb = (FourWheelBike) b;
		fwb.addWheel();	// 자식 메서드 사용 가능
		fwb.info();
		fwb.ride();
		
	}

}
