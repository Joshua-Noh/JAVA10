package section12.ab;

public class EX12_04 {
	public static void main(String[] args) {
		// Receipt r = new Receipt(); ← 에러 : 추상 클래스는 직접 객체를 생성할 수 없음
		
		PastaReceipt pr = new PastaReceipt("최연석");
		pr.info(); // 자식 객체를 통해 추상 클래스의 메서드를 호출할 수 있음
		pr.makeSource();
		
		System.out.println();
		
		StakeReceipt sr = new StakeReceipt("이현복");
		sr.info();
		sr.grillStake();
	}
}