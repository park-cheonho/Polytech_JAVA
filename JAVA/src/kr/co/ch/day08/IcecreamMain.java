package kr.co.ch.day08;

public class IcecreamMain {

	public static void main(String[] args) {
		
		//생성자 잘써야함 그안에 누구누구를 초기화해서 예 7개 중에 3개 4개 1개 자기가 선택
		//매개변수 있는 생성자도 잘알아야함
		Icecream ice = new Icecream("비비빅", 1000);
		
		//오늘의 특가를 위해 외부에서 가격을 800으로 고치고 싶은데 맴버변수가 프라이빗이라 고치기 불가능 절대!
		//ice.price = 800;
		//info는 절대 못고치고 price는 수정해야하는 경우
		//외부에서 맴버변수값을 보는 경우는 get
		//항목값을 수정하고 싶은 경우는 set 일반적으로 맴버변수 이름과 동일하게 써야함
		ice.setPrice(800);
		//get들을 getter메소드 set들을 setter메소드라고 함
		//관습 습관적으로 getter setter만듦
		
		System.out.println("아이스크림명 : " + ice.getName() + "원");
		//System.out.println("아이스크림가격 : " + ice.getPrice());
		//가격만 따로 출력해주는 메소드는 없음 그러면 info로 알아야함 
		//실제 아이스크림 클래스 만드는사람이 제어하는 권리를 가짐 은닉성 보안은 private
		ice.info();
		//외부에서 info말고 일부분만 쓰고 싶을때

		//ice.name = "비비빅"; 함부로 멤버변수에 접근하지 못하게 메소드로만 접근하도록 안내
		
	} 
	
}
