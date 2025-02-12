package section16;
import java.util.HashSet;
import java.util.Set;

public class EX16_11 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet< >();
		// 데이터 삽입
		set.add("apple");
		set.add("mango");
		set.add("banana");
		set.add("melon");
		
		System.out.println("set items : " + set);;
		
		// 데이터 삭제
		set.remove("banana");
		set.remove("mango");
		
		System.out.println("set items : " + set);;
	}
}