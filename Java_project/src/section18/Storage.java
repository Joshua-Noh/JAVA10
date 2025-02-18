package section18;

public class Storage {
	private int stackCount = 10; // 기본 10개를 지닌다.
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		if(this.stackCount >= 10) {
			System.out.println("==스레드 깨우기====");
			notify(); // 잠자는 스레드를 깨운다.
		}
	}
	
	public synchronized void popStack(int leaveCount) {
		try { // 현재 남아있는 것보다 꺼낼 것이 많다면..
			if(leaveCount > this.stackCount) {
				this.stackCount = 0; // 0개로 변경한다.
			} else {
				this.stackCount -= leaveCount;
			}
			
			if(this.stackCount == 0) {
				System.out.println("==짐 없음 대기====");
				wait(); // 스레드를 대기한다.
				System.out.println("==짐 없음 완료====");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getStackCount() {
		return this.stackCount;
	}
}