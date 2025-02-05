package section11;

public class Calendar {
	// 클래스의 자동 타입변환 3
	String color;
	int months;
	
	Calendar(String color, int months){
		this.color = color;
		this.months = months;
	}
	
	void info() {
		System.out.println(color +" 달력은 "+ months +"월까지 있습니다.");
	}
	
	void hanging() {
		System.out.println(color +" 달력을 벽에 걸 수 있습니다.");
	}
}
