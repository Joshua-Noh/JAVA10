package section11;

public class EX11_08 {

	public static void main(String[] args) {
		// ���� �� ��ȯ 3
		Bike b = new FourWheelBike("����");
		b.info();
		b.ride();
		//b.addWheel(); // �θ� Ÿ�����δ� ȣ�� �Ұ�
		System.out.println();
		
		FourWheelBike fwb = (FourWheelBike) b;
		fwb.addWheel();	// �ڽ� �޼��� ��� ����
		fwb.info();
		fwb.ride();
		
	}

}
