package kr.ac.kopo.day06;

import java.util.Scanner;

public class GugudanMain {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Gugudan gu = new Gugudan();
		
//		System.out.print("2 - 9사이의 단을 입력 : ");
//		int dan = gu.getDan();
		int dan = gu.getDan("2 - 9사이의 단을 입력 : ");
		
		gu.print(dan);
		
		gu.print();
		
		System.out.print("시작단을 입력 : ");
		int startDan = gu.getDan();
		
		System.out.print("종료단을 입력 : ");
		int endDan = gu.getDan();
		
		gu.print(startDan, endDan);
	}
	
}













