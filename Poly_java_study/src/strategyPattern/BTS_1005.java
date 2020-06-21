package strategyPattern;

public abstract class BTS_1005 {

	private Broadcast_1005 broadcast_1005;
	
	public void setBroadcst(Broadcast_1005 broadcast) {
		this.broadcast_1005 = broadcast;
	}
	
	public void ami() {
		if (broadcast_1005 == null) {
			System.out.println("휴식 & 연습");
		} else {
			//델리케이트?
			broadcast_1005.ami();
		}
	}
}
