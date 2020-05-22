package kr.co.ch.day02;

import java.util.Random;

/*
 * 1 ~ 3 사이의 정수를 입력
 * 1입력시 "ONE" 출력
 * 2입력시 "TWO" 출력
 * 3입력시 "THREE" 출력
 * 그외 "ERROR" 출력
 */

public class SwitchMain {
	
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(5) + 1; // 1~5
		System.out.println("입력된 정수 : " + num);
		
		switch(num) {
		//default가 위에 있어도 case 먼저 무조건 반영 default는 마자막에 읽힌다.
		//switch의 약점 case에 올수 있는 아이들이 한계가 있다.
		case 1 : 
			System.out.println("ONE");
			break; //break 되면 가장 가까운 }를 찾아간다
		case 2 :
			System.out.println("TWO");
			break;
		case 3 : 
			System.out.println("THREE");
			break;
		default :
			System.out.println("ERROR");
			break;
		}
		
		
		/*
		if(num == 1) {
			System.out.println("ONE");
		} else if (num == 2) {
			System.out.println("TWO");
		} else if(num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		*/
	}

}
