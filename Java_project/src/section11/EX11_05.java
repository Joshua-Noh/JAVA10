package section11;

public class EX11_05 {

	public static void main(String[] args) {
		// Ŭ������ �ڵ� Ÿ�Ժ�ȯ 3
		DeskCalendar dc = new DeskCalendar("�����", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calendar c = new DeskCalendar("������", 12);
		c.info();
		c.hanging();	// �������̵��� �޼��带 ȣ��
		//c.onTheDesk(); // ����
	}

}
