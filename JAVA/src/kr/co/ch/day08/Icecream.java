package kr.co.ch.day08;

public class Icecream {

	private String name;
	private int price;
	
	
	/**
	 * name, price의 값으로 초기화하는 생성자......
	 * @param name 설정할 아이스크림명
	 * @param price 설정할 아이스크림가격
	 */
	public Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	/**
	 * 
	 */
	public void info() {
		System.out.println("아이스크림명 : " + this.name + ", 가격 : " + this.price + "원입니다.");
	}
	
	/**
	 * 아이스크림명을 알려주는 메소드
	 * @return String값으로
	 */
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	/**
	 * 사용자가 넘겨준 가격으로 아이스크림가격 수정함
	 * @param price 사용자가 수정한 가격입니다.
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
