package kr.ac.kopo.day02;

import java.util.Random;

/*
 	1 ~ 3사이의 정수를 입력 : 
 	1 입력 시 "ONE" 출력
 	2 입력 시 "TWO" 출력
 	3 입력 시 "THREE" 출력
 	그외        "ERROR" 출력
 */

public class SwitchMain {

	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt(5) + 1; 	// 1 ~ 5
		System.out.println("입력된 정수 : " + num);
		
		switch(num) {
		case 1 : 
			System.out.println("ONE");
			break;
		case 2 : 
			System.out.println("TWO");
			break;
		case 3 : 
			System.out.println("THREE");
			break;
		default :
			System.out.println("ERROR");
		}
		
		/*
		if(num == 1) {
			System.out.println("ONE");
		} else if(num == 2) {
			System.out.println("TWO");
		} else if(num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		*/
	}
}

















