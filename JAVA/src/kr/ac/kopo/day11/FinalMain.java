package kr.ac.kopo.day11;

import java.util.Random;

/*final*/ class Super {
	
	public /* final */ int MAX = 100;
	
	public /* final */ void print() {
		System.out.println("Super print() 호출...");
	}
}

class Sub extends Super {
	
	@Override
	public void print() {
		MAX = 40;
		System.out.println("Sub print() 호출...");
	}
}

class MyRandom extends Random {

	/**
	 * nextInt(10)
	 * 	상위클래스 Random의 0 ~ 9사이의 난수 추출 아닌 
	 *  1 ~ 10사이의 난수를 추출 
	 */
	@Override
	public int nextInt(int bound) {
		int r = super.nextInt(bound) + 1;
		return r;
	}
	
}

/*
class MyString extends String {
	
}
*/

public class FinalMain {

	public static void main(String[] args) {

//		Random r = new Random();
//		int random = r.nextInt(100)+1;
		
		Random r = new MyRandom();
		int random = r.nextInt(100);
		
		System.out.println("추출된 정수 : " +  random);
	}
}


















