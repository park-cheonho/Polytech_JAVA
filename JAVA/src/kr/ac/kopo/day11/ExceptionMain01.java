package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {

		System.out.println("main start...");
		
		Random r = new Random();
		int num = r.nextInt(3);
		
		System.out.println("추출된 난수 : " + num);
		
	//	if(num != 0) {
			System.out.println(10 / num);
	//	}
		
		System.out.println("main end...");
	}
}
