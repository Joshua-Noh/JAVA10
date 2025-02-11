package section15;

public class EX15_01 {
	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//문자열 변수 비교
		System.out.println("str1 vs str2 : " + (str1 == str2));
		System.out.println("str2 vs str3 : " + (str2 == str3));
		
		// 각 문자열 변수가 있는 위치의 값을 출력
		System.out.println("str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("str2 hashCode : " + System.identityHashCode(str2));
		System.out.println("str3 hashCode : " + System.identityHashCode(str3));
	}
}