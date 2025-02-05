package section11;

class Car{}
class Bus extends Car{}
class SchoolBus extends Bus{}

class OpenCar extends Car{}
class SportsCar extends OpenCar{}

public class EX11_02 {
	public static void main(String[] args) {
		// 클래스의 자동 타입변환 2
		
		Car c1 = new SchoolBus();	// 1차 상속관계가 아니더라도 자동 타입변환 가능
		
		Bus b1 = new Bus();			// 자동 타입 변환
		Bus b2 = new SchoolBus();	// 자동 타입 변환
		
		Car c2 = new OpenCar();		// 자동 타입 변환
		OpenCar oc = new SportsCar(); // 자동 타입 변환
		// Bus b3 = new SportsCar(); // 오류
	}

}
