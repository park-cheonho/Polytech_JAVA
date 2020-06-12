package kr.co.ch.day11;

import java.util.Random;

public class ExceptionMain2 {

	public static void main(String[] args) {

		System.out.println("main start");
		
		try {
		Random r = new Random();
		int random = r.nextInt(3);
		
		System.out.println("추출된 난수 : " + random);
		System.out.println(10 / random);
		} catch(ArithmeticException ae) {
			System.out.println("예외발생!!!!!!");
			System.out.println("발생이유 " + ae.getMessage());
			ae.printStackTrace();
		}
		System.out.println("main end");
	}
	//try catch가 무적이 아니고 무조건이 아니기 때문에 if 같은거도 충분히 활용해야함
}
