package section11;

public class ComputerRoom {
	// ComputerRoom ��ü�� ����� �� Ŭ����
	// EX11_12.java
	//Samsong computer1;
	//Samsong computer2;
	
	// EX11_14.java
	Computer computer1;
	Computer computer2;
	
	void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
	}
	
	void allPowerOff() {
		computer1.powerOff();
		computer2.powerOff();
	}
}
