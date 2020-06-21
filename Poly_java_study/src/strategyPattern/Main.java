package strategyPattern;

public class Main {
	public static void main(String[] args) {
		BTS v = new V();
		BTS jk = new Jk();
		BTS jimin = new Jimin();
		
		
		v.setBroadcast(new Winkk());
		v.show();
		
		jk.setBroadcast(new Dance());
		jk.show();
		
		jimin.setBroadcast(new Takeoff());
		jimin.show();
		
		
	}
}
