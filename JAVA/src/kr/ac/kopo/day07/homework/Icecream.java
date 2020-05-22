package kr.ac.kopo.day07.homework;

public class Icecream {

	String 	name;
	int		price;
	
	Icecream() {}
	
	Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
}
