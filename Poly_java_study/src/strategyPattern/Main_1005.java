package strategyPattern;

public class Main_1005 {

	public static void main(String[] args) {
		
		BTS_1005 v = new V_1005();
		BTS_1005 jungkuk = new Jungkuk_1005();
		BTS_1005 jimin = new Jimin_1005();
		
		v.setBroadcst(new Wink_1005());
		v.ami();
		
		jungkuk.setBroadcst(new Dance_1005());
		jungkuk.ami();
		
		jimin.setBroadcst(new Strip_1005());
		jimin.ami();
	}
}
