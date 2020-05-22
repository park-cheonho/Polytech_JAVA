package kr.co.ch.day06;

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		
		Member m = new Member();
		Member m2 = new Member("홍길동");
		Member m3 = new Member("강길동", 22);
		Member m4 = new Member("강길동", 22, "RH+ B");
		
		m.info();
		m2.info();
		m3.info();
		m4.info();
		
	}
}
