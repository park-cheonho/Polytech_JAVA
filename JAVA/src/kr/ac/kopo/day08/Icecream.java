package kr.ac.kopo.day08;

public class Icecream {

	private String 	name;
	private int 	price;
	
	/**
	 * name, price의 값으로 초기화하는 생성자....
	 * @param name 설정할 아이스크림명
	 * @param price 설정할 아이스크림가격
	 */
	public Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	/**
	 * 아이스크림 정보를 출력
	 */
	public void info() {
		System.out.println("아이스크림명 : " + this.name + ", 가격 : " + this.price + "원입니다");
	}
	
	/**
	 * 아이스크림명을 알려주는 메소드
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 아이스크림 가격을 알려주는 메소드
	 * @return
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * 사용자가 넘겨준 가격으로 수정
	 * @param price 수정할 가격
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "아이스크림명 : " + name + ", 가격 " + price;
	}
}





















