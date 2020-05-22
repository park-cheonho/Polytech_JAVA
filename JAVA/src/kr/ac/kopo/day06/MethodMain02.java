package kr.ac.kopo.day06;

class Method {
	/*
	 * 메소드는 오버로딩(Overloading)을 지원
	 * 오버로딩 : 클래스내에 동일한 메소드명을 가지면서 매개변수의 타입이나 개수가 다른 것
	 */
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
//	void call(int i) {
//		System.out.println("call(int) 메소드 호출...");
//	}
	
	void call(String str) {
		System.out.println("call(String) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(String str, int i) {
		System.out.println("call(String, int) 메소드 호출...");
	}
	
	void call(int i, String str) {
		System.out.println("call(int, String) 메소드 호출...");
	}
	
	/*
	void call(char c) {
		System.out.println("call(char) 메소드 호출...");
	}
	*/
	
	void call(boolean b) {
		System.out.println("call(boolean) 메소드 호출...");
	}
}

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(10);
		m.call("Hello");
		m.call(12.34);
		m.call("goodbye", 100);
		m.call(123, "hi");
		m.call('A');
		m.call(true);
		
	}
}





