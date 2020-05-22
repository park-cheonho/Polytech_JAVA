package kr.co.ch.day08;

class One extends Object{
	One() {
		System.out.println("One() 생성자 호출");
	}
}

class Two extends One{
	
	Two() {
//		super();
		
		System.out.println("Two() 생성자 호출");
	}
}

class Three extends Two{
	
	Three() {
//		super();
		
		System.out.println("Three() 생성자 호출");
	}
}
public class ExtendMain {

	public static void main(String[] args) {
		
//		One one = new One();
		
//		Two two = new Two();//생성자 호출순서 부모부터 부모부터 만들어드함
		Three three = new Three();
	}
}
