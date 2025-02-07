package section12.ab;

public class StakeReceipt extends Receipt {
	StakeReceipt(String chef) {
		super(chef);
	}
	
	void grillStake() {
		System.out.println("스테이크를 맛있게 굽습니다.");
	}
}