package kr.ac.kopo.day08;

class One {
	One() {
		System.out.println("One() 생성자 호출...");
	}
}

class Two extends One {
	Two() {
		System.out.println("Two() 생성자 호출...");
	}
}

class Three extends Two {
	Three() {
		System.out.println("Three() 생성자 호출...");
	}
}

public class ExtendMain {

	public static void main(String[] args) {
		
//		One one = new One();
//		Two two = new Two();
		Three three = new Three();
	}
}





