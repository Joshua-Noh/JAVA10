package section11;

public abstract class Receipt {
	String chef;
	
	Receipt(String chef){
		this.chef = chef;
	}
	
	void info() {
		System.out.println("이 레시피는 "+ chef +" 셰프님의 레시피 입니다.");
	}
}
