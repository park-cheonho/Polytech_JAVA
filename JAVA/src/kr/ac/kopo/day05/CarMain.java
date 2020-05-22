package kr.ac.kopo.day05;

// 실행클래스
public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.name = "소나타";
		c.price = 2500;
		
		Car c2 = new Car();
		
		c2.name = "모닝";
		c2.price = 1100;
		
		System.out.println("브랜드명 : " + c.name + ", 가격 : " + c.price + "만원");
		System.out.println("브랜드명 : " + c2.name + ", 가격 : " + c2.price + "만원");
	}
}








