package kr.co.ch.day05;
// 실핼클래스 = 메인메소드를 가지고 있는 클래스
public class CarMain {
//CarMain도 클래스라서 객체가 필요하지만 main 메소드가지는 클래스는 jvm이 객체를 만든다
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.name = "Hyundai 소나타";
		c.price = 25_000_000;		

		Car c2 = new Car();
		
		c2.name = "BMW 320d";
		c2.price = 50_000_000;		

		
		System.out.println("모델명 : " + c.name + ", 가격 : " + c.price + " 만원");
		System.out.println("모델명 : " + c2.name + ", 가격 : " + c2.price + " 만원");
		
	}
}
