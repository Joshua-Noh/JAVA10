package section16;

public class DataListExample {
	public static void main(String[] args) {
		
		DataList list = new DataList();
		
		// 정수 입력
		list.add(10);
		// 문자 저장
		list.add("문자");
		// 숫자 저장
		list.add(10.33);
		
		// 데이터 출력
		for(int i = 0; i < list.size(); i++) {
			// 데이터 가져오기
			Object data = list.get(i);
			
			// 저장된 데이터 타입이 어떤 타입인지 검사
			if(data instanceof Integer) {
				System.out.println("정수 : " + (int)data);
			} else if(data instanceof Double) {
				System.out.println("실수 : " + (double)data);
			} else if(data instanceof String) {
				System.out.println("문자열 : " + (String)data);
			}
		}
	}
}