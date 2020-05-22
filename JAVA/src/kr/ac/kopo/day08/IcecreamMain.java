package kr.ac.kopo.day08;

public class IcecreamMain {

	public static void main(String[] args) {
		
		Icecream ice = new Icecream("비비빅", 1000);
		
		// 아이스크림의 가격을 800원으로 수정하고 싶어요...
//		ice.price = 800;
		ice.setPrice(800);
		
		System.out.println("아이스크림명 : " + ice.getName());
		System.out.println("아이스크림가격 : " + ice.getPrice() + "원");
		
		
		
		
	}
}
