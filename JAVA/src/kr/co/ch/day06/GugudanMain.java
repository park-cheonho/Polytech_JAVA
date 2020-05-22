package kr.co.ch.day06;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Gugudan gu = new Gugudan();
		
//		System.out.println("2 ~ 9사이의 단을 입력 : ");
//		int dan = gu.getDan();
		int dan = gu.getDan("2 ~ 9사이의 단을 입력 : ");
		
		
		gu.print(dan);
		
		gu.print();
		
		System.out.println("시작단을 입력 : ");
		int startDan = gu.getDan();
		
		System.out.println("종료단을 입력 : ");
		int endDan = gu.getDan();
		
		gu.print(startDan, endDan);
		
		}
}
