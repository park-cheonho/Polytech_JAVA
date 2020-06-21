package ProxyPattern;

public class main {

	public static void main(String[] args) {
		
		Subject real = new RealSubject();
		
		Subject proxy1 = new proxy(real);
		
		Subject proxy2 = new proxy(real);
		
		Subject proxy3 = new proxy(real);
		
		Subject proxy4 = new proxy(real);
		
		proxy1.action1();
		proxy2.action1();
		proxy3.action1();
		proxy4.action1();
		
		proxy1.action2();
		proxy2.action2();
		proxy3.action2();
		proxy4.action2();
	}
}
