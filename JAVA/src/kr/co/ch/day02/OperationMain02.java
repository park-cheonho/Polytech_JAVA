package kr.co.ch.day02;

import java.util.Random;

public class OperationMain02 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num = r.nextInt(10);
		int num2 = r.nextInt(10);
		
		System.out.printf("num = %d num2 = %d\n", num, num2);
		
		//int max = ( num > num2 ? num : num2 );
		//System.out.println("Max : " + max);
		
		System.out.println("Max : " + (num > num2 ? num : num2));
		
		//3항 연산자로 수식1, 수시2, 수식3 늘리기 가능
	
		
	}

}
