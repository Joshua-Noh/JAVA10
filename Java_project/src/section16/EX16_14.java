package section16;
import java.util.HashMap;
import java.util.Map;

public class EX16_14 {
	public static void main(String[] args) {
		// Map 선언
		Map<String, String> map = new HashMap< >();
		// 데이터 삽입
		// put(key, value);
		map.put("spring", "봄");
		map.put("summer", "여름");
		map.put("fail", "가을");
		map.put("winter", "겨울");
		// key가 중복될 경우 value 변경
		map.put("spring", "봄봄");
		// 삭제
		map.remove("winter");
		
		// 특정 키가 존재하는지 확인
		System.out.println("Is Exist Key : " + map.containsKey("winter"));
		// 특정 값이 존재하는지 확인 - 중복은 신경쓰지 않고 존재하면 tru e
		System.out.println("Is Exist value : " + map.containsValue("가을"));
		// key에 해당하는 값 가져오기
		System.out.println("get Data : " + map.get("spring"));
	}
}