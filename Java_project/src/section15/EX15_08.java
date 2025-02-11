package section15;

public class EX15_08 {
	public static void main(String[] args) {
		
		String word = "1I2LOVE6YOU";
		
		// 문자열에서 숫자를 찾아 제거하고 문자만 출력
		String text = "";
		
		// length()는 해당 문자열의 길이를 반환해 주는 메서드
		for(int i = 0; i < word.length(); i++) {
			// charAt(index) 메서드는 문자열을 하나의 문자로 각각 반환
			char ch = word.charAt(i);
			int asciiNum = ch; // 문자를 아스키코드에 의한 10진수 값으로 변환
			
			// 소문자 a~z는 97~122, 대문자는 65~90 사이
			if((asciiNum >= 65 && asciiNum <= 90) || (asciiNum >= 97 && asciiNum <= 122)) {
				text += ch;
			} else {
				text += " ";
			}
		}
		
		System.out.println(text);
	}
}