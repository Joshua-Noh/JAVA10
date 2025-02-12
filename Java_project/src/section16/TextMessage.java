package section16;

public class TextMessage {
	// 메시지를 식별하는 번호
	private int msgNumber;
	// 메시지 내용
	private String msg;
	
	public TextMessage(int msgNumber, String msg) {
		this.msgNumber = msgNumber;
		this.msg = msg;
	}
	
	public int getMsgNumber() {
		return msgNumber;
	}
	
	public String getMsg() {
		return msg;
	}
	
	@Override
	public int hashCode() {
		// 식별 번호 리턴
		return msgNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TextMessage) {
			TextMessage compare = (TextMessage)obj;
			if(this.msg.equals(compare.getMsg())) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}