package section11;

public class Bike {
	// ���� ����ȯ 1
	String riderName;
	int wheel = 2;
	
	Bike(String rideName){
		this.riderName = rideName;
	}
	
	void info() {
		System.out.println(riderName +"�� �����Ŵ� "+ wheel +"�� ������ �Դϴ�.");
	}
	
	void ride() {
		System.out.println("�ž�");
	}
}
