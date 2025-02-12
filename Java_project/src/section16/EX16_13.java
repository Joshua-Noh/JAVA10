package section16;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX16_13 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet< >();
		// 데이터 삽입
		for(int i = 1; i <= 10; i++) {
			set.add(i);
		}
		// Iterator 객체 가져오기
		Iterator<Integer> iter = set.iterator();
		
		int count = 0;
		// 반환할 요소가 있는지 검사
		while(iter.hasNext()) {
			// 요소 반환
			int val = iter.next();
			System.out.println("set 데이터["+ (count++) +"] : " + val);
		}
	}
}