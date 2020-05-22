package kr.co.ch.day02.homework;


import java.util.Scanner;

public class Homwork05 {
	
/*
1 달러는 현재 1,092.50 원 입니다 . 화면에서 달러를 입력 받아 원화로 보여주는 프로그램을 작성하세요
달러를 입력하세요 ? 10
원화 :10925.00 원
 */
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 보유하신 달러를 입력 하십시오 : ");
		double dollar = sc.nextDouble();
		sc.close();
		double won = dollar * 1092.50;
		// 소수점 두자리 까지 표현 하기 위헤 println이 아닌 printf(조건, 변수);사용
		System.out.printf("원화 : %.2f원", won);
		
		
	}
	
}
