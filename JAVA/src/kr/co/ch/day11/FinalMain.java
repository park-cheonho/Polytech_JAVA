package kr.co.ch.day11;

import java.util.Random;

/*final*/ class Super {
	
	public /*final*/ int MAX = 100;
	public /*final*/ void print() {
		System.out.println("Super print 호출");
	}
}

class Sub extends Super{
	
	@Override
	public void print() {
		MAX = 40;
		System.out.println("Sub print 호출");
	}
}
//////////////////////////////////////////////////////
class MyRandom extends Random {
//String은 final로 만들어져있어서 랜덤메소드처럼 사용 불가능!!!!!!!!
	/**
	 * nextInt(10) : 기존 상위 클래스 Random 0 ~ 9 사이의 난수추출이 아닌 1~10 사이의 난수 추출 
	 */
	@Override
	public int nextInt(int bound) {
		int r = super.nextInt(bound) + 1;
		return r;
	}
}

public class FinalMain {
	
	public static void main(String[] args) {
		
//		Random r = new Random();
		
		MyRandom r = new MyRandom();
		int random = r.nextInt(100)+1;
		
		System.out.println("추출된 정수" + random);
		
	}
}
