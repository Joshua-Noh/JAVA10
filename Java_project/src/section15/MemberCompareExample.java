package section15;
import java.util.HashSet;
import java.util.Set;

public class MemberCompareExample {
	
	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member();
		
		mem1.setMemberId(100);
		mem1.setMemName("홍길동");
		
		mem2.setMemberId(100);
		mem2.setMemName("홍길동");
		
		// Set은 데이터를 저장하는 자료 구조
		// 중복 데이터를 허용하지 않는다.
		Set<Member> list = new HashSet<>();
		list.add(mem1); //데이터(객체)를 삽입
		list.add(mem2); //데이터(객체)를 삽입
		
		// Set 객체에 저장된 데이터 크기 출력
		System.out.println("데이터 크기 : " + list.size());
	}
}