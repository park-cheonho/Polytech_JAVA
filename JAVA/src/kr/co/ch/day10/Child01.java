package kr.co.ch.day10;

public class Child01 extends Parent {

	private String name = "자식1";
	
	@Override
	public void print() {
		System.out.println("나는 자식1의 객체입니다.");
	}
	
	public void study () {
		System.out.println("나는 공부합니다.");
	}
	
	public void sleep () {
		System.out.println("나는 잡니다.");
	}
}
