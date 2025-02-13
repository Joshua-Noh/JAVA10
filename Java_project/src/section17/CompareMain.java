package section17;

public class CompareMain {
	public static void main(String[] args) {
		
		// 인터페이스 객체를 익명 클래스 선언으로 정의
		CompareNumber compare = new CompareNumber() {
			// 메서드 구현
			@Override
			public int compareTo(int num01, int num02) {
				return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
			}
		};
		
		// 람다식을 이용해 함수 구현
		//CompareNumber compare = 
		//		(num01, num02) -> {return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;};
		
		int num01 = 10;
		int num02 = 20;
		// 두 수를 비교해 결과를 반환
		int result = compare.compareTo(num01, num02);
		// 비교에 대한 결과를 출력
		if(result > 0) {
			System.out.println("num01이 num02 보다 크다");
		} else if(result < 0) {
			System.out.println("num01이 num02 보다 작다");
		} else {
			System.out.println("num01과 num02 같다");
		}
	}
}