package section15;

public class Member {
	private int memberId;
	private String memName;
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemName() {
		return memName;
	}
	
	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	// hashCode() 메서드를 override하여
	// 객체의 고유 ID 반환
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 비교 대상 객체가 Member 클래스이면
		if(obj instanceof Member) {
			// 타입 변환
			Member compare = (Member)obj;
			// 두 객체의 고유 ID를 비교
			if(this.memberId == compare.memberId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}