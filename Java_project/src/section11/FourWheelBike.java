package section11;

public class FourWheelBike extends Bike {
	// ��������ȯ 2
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
			System.out.println(riderName +"�� �����ſ� ���� ������ �����Ͽ����ϴ�.");
		} else {
			System.out.println(riderName +"�� �����ſ� �̹� ���� ������ �����Ǿ� �ֽ��ϴ�.");
		}
	}
}
