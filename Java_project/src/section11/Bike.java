package section11;

public class Bike {
	// 강제 형변환 1
	String riderName;
	int wheel = 2;
	
	Bike(String rideName){
		this.riderName = rideName;
	}
	
	void info() {
		System.out.println(riderName +"의 자전거는 "+ wheel +"발 자전거 입니다.");
	}
	
	void ride() {
		System.out.println("씽씽");
	}
}
