package kr.ac.kopo.day02;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random r = new Random();
		
		int random = r.nextInt();	// 임의의 정수를 추출
		System.out.println("추출된 정수 : " + random);
		
		// 0 ~ 9 사이의 난수를 추출
		int num = r.nextInt(10);	// 0 ~ 9
		System.out.println("num : " + num);
				
		// 1 ~ 10 사이의 난수를 추출
		int num2 = r.nextInt(10) + 1;	// 0+1 ~ 9+1 => 1 ~ 10
		System.out.println("num2 : " + num2);
	
	
	}
}
