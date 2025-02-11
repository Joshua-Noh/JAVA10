package section15;

public class EX15_09 {
	public static void main(String[] args) {
		
		String str = "HelloWorld_MyWorld";
		// 처음 위치에서 검색
		System.out.println("World 단어 위치 : " + str.indexOf("World"));
		// 10번째 위치부터 시작하여 검색
		System.out.println("World 단어 위치 : " + str.indexOf("World", 10));
	}
}