package section11;

public class EX11_05 {

	public static void main(String[] args) {
		// 클래스의 자동 타입변환 3
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calendar c = new DeskCalendar("검은색", 12);
		c.info();
		c.hanging();	// 오버라이드한 메서드를 호출
		//c.onTheDesk(); // 에러
	}

}
