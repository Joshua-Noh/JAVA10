package section12.ab;

public class PastaReceipt extends Receipt {
	PastaReceipt(String chef) {
		super(chef); // 부모 클래스(추상 클래스) 생성자 호출
	}
	
	void makeSource() {
		System.out.println("파스타 소스를 직접 만듭니다.");
	}
}