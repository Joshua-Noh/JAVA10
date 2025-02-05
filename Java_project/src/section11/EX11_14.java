package section11;

public class EX11_14 {

	public static void main(String[] args) {
		// ComputerRoom 객체를 만들어 줄 클래스
		ComputerRoom cr = new ComputerRoom();
		cr.computer1 = new LZ();	// LZ computer1
		cr.computer2 = new LZ();	// LZ computer2
		
		cr.allPowerOn();
		cr.allPowerOff();
	}

}
