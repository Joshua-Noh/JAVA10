package section11;

public class EX11_12 {

	public static void main(String[] args) {
		// Samsong 컴퓨터 객체를 만들줄 클래스
		ComputerRoom cr = new ComputerRoom();
		cr.computer1 = new Samsong();	// Samsong computer1
		cr.computer2 = new Samsong();	// Samsong computer2
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println();
	}

}
