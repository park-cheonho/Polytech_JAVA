package strategyPattern;

public abstract class BTS {

	private Broadcast broadcast;
	
	public void setBroadcast(Broadcast broadcast) {
		this.broadcast = broadcast;
	}

	public void show() {
		if(broadcast == null) {
			System.out.println("아무것도 하지 않음");
		} else {
			broadcast.show();
		}	
	}
}