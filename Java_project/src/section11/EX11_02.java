package section11;

class Car{}
class Bus extends Car{}
class SchoolBus extends Bus{}

class OpenCar extends Car{}
class SportsCar extends OpenCar{}

public class EX11_02 {
	public static void main(String[] args) {
		// Ŭ������ �ڵ� Ÿ�Ժ�ȯ 2
		
		Car c1 = new SchoolBus();	// 1�� ��Ӱ��谡 �ƴϴ��� �ڵ� Ÿ�Ժ�ȯ ����
		
		Bus b1 = new Bus();			// �ڵ� Ÿ�� ��ȯ
		Bus b2 = new SchoolBus();	// �ڵ� Ÿ�� ��ȯ
		
		Car c2 = new OpenCar();		// �ڵ� Ÿ�� ��ȯ
		OpenCar oc = new SportsCar(); // �ڵ� Ÿ�� ��ȯ
		// Bus b3 = new SportsCar(); // ����
	}

}
