package section11;

public abstract class Receipt {
	String chef;
	
	Receipt(String chef){
		this.chef = chef;
	}
	
	void info() {
		System.out.println("�� �����Ǵ� "+ chef +" �������� ������ �Դϴ�.");
	}
}
