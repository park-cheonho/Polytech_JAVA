package kr.co.ch.day02.homework;

import java.util.Scanner;

public class Homwork04 {

/*
 화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면 에 출력하시오
정수 를 입력하세요 : 10
나눌수를 입력하세요 : 7
몫 : 1
나머지 : 3
*/

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int putint1 = sc1.nextInt();
		sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("나눌수를 입력하세요 : ");
		int putint2 = sc2.nextInt();
		sc2.nextLine();
		sc1.close();
		sc2.close();
		
		int 몫 = putint1/putint2;  
		int 나머지 = putint1%putint2; 
				
		System.out.println("몫 : " + 몫);
		System.out.println("나머지 : " + 나머지);
		
	}
}
