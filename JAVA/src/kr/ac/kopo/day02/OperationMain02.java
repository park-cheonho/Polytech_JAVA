package kr.ac.kopo.day02;

import java.util.Random;

public class OperationMain02 {

	public static void main(String[] args) {
		
		Random r = new Random();
	
		int num = r.nextInt(10);
		int num2 = r.nextInt(10);
		
		System.out.printf("num = %d  num2 = %d\n", num, num2);
		
		String result = (num > num2 ? "num > num2" : ( num < num2 ? "num < num2" : "num == num2") );
		
		System.out.println(result);
		
		
		/*
		System.out.printf("num = %d  num2 = %d\n", num, num2);
		
//		int max = ( num > num2 ? num : num2 );
//		System.out.println("MAX : " + max);
		
//		System.out.println("MAX : " + (num > num2 ? num : num2));
		System.out.println("MAX : " + (num <= num2 ? num2 : num));
		*/
	}
}
