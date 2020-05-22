package kr.co.ch.day06;
//일반적으로 따로 Method.javja파일 만들어서 해야함
class Method {
	/*
	 * 메소드는 오버로딩(overloading)을 지원합니다.
	 * 오버로딩 : 클래스 안에서 통일한 메소드 명을 가지면서 매개변수의 타입이나 갯수가 다른 것
	 * 
	 */
	void call() {
		System.out.println("call() 메소드 호출....");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드를 호출...");
	}
	
	void call(String str) {
		System.out.println("call(str) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(String str ,int i) {
	System.out.println("call(str, int) 메소드 호출...");
	}
	
	void call(int i, String str) {
	System.out.println("call(int, str) 메소드 호출...");
	}
	
	/*
	 * char<int<long<float<double
	 * 주석해도 int 형이 받고 int도 없으면 double이 받음
	 * 묵시적 형변환 자동적으로 진행
	void call(char c) {
		System.out.println("call(char) 메소드 호출...");
	}
	*/
	void call(boolean b) {
		System.out.println("call(boolean) 메소드 호출...");
	}
	//매개변수의 순서 중요함
	
}
//윗쪽은 메소드 오버로딩의 예 

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(0);
		m.call("Hello");
		m.call(12.34);
		m.call("Hello", 100);
		m.call(12, "Hello");
		m.call('A');
		m.call(true);
	}
}
