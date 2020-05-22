package kr.co.ch.day07;
//눈에보이는 객체에 대해 하는 추상 클래스 VO클래스 dto클래스?
public class Icecream {

	String name;
	int Price;
	
	Icecream() {}
	
	Icecream(String name, int price) {
		this.name = name;
		this.Price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return Price;
	}
}
