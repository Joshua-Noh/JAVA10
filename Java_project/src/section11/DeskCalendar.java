package section11;

public class DeskCalendar extends Calendar {
	// Ŭ������ �ڵ� Ÿ�Ժ�ȯ 3
	
	DeskCalendar(String color, int months){
		super(color, months);
	}
	
	@Override
	void hanging() {
		System.out.println(color +" �޷��� ���� �ɱ� ���� ���� �߰��� �ʿ��մϴ�.");
	}
	
	void onTheDesk() {
		System.out.println(color +" �޷��� å�� ���� �� �ֽ��ϴ�.");
	}
	
}
