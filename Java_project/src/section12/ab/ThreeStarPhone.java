package section12.ab;

public class ThreeStarPhone extends Phone {
	@Override
	void openingLogo() { // 구현하지 않으면 에러 발생
		System.out.println("★★★");
	}
}