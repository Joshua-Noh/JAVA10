package section11;

public class Calendar {
	// Ŭ������ �ڵ� Ÿ�Ժ�ȯ 3
	String color;
	int months;
	
	Calendar(String color, int months){
		this.color = color;
		this.months = months;
	}
	
	void info() {
		System.out.println(color +" �޷��� "+ months +"������ �ֽ��ϴ�.");
	}
	
	void hanging() {
		System.out.println(color +" �޷��� ���� �� �� �ֽ��ϴ�.");
	}
}
