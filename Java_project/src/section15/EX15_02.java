package section15;

public class EX15_02 {
	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//문자열 변수 비교
		System.out.println("str1 vs str2 : " + (str1.equals(str3)));
		System.out.println("str2 vs str3 : " + (str2 .equals(str3)));
	}
}