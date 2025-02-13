package section17;

//두 문장을 결합하는 함수 생성
interface StrConcat {
	String concat(String str1, String str2);
}

public class StringConcat {
	public static void main(String[] args) {
		final String str = "java";
		StrConcat strConcat = (s, v) -> {
			String sentence = str + "! " + s + " " + v;
			return sentence;
		};
		System.out.println(strConcat.concat("Hello", "world"));
	}
}