package section16;
import java.util.ArrayList;
import java.util.List;

public class EX16_06 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList< >();
		
		// 2의 배수를 넣는다
		for(int i = 1; i < 10; i++) {
			int temp = 2 * i;
			list.add(temp);
		}
		// 출력
		System.out.println("리스트 값 : " + list);
		
		// 3번째 인덱스 내용 삭제
		list.remove(3);
		// 숫자 타입의 데이터는 객체화 후 삭제
		list.remove(Integer.valueOf(10));
		
		// 출력
		System.out.println("리스트 값 : " + list);
	}
}