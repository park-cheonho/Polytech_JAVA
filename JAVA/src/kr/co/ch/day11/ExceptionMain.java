package kr.co.ch.day11;

import java.util.Random;

public class ExceptionMain {

	public static void main(String[] args) {

		System.out.println("main start");
		
		Random r = new Random();
		int random = r.nextInt(3);
		
		System.out.println("추출된 난수 : " + random);
		System.out.println(10 / random);
		
		System.out.println("main end");
	}
}
