package section16;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EX16_12 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// Iterator 객체 가져오기
		Iterator<Integer> iter = list.iterator();
		int count = 0;
		// 반환할 요소가 있는지 검사
		while(iter.hasNext()) {
			// 요소 반환
			int val = iter.next();
			System.out.println("list 데이터[" + (count++) + "] : " + val);
		}
	}
}