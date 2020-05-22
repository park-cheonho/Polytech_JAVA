package kr.ac.kopo.day06;

import java.util.Scanner;

/**
 * 구구단과 관련된 기능을 가지고 있는 기능클래스
 * @author HP
 *
 */
public class Gugudan {
	

	/**
	 * 키보드로 하나의 단를 입력받아 호출자메소드에게 넘겨주는 기능
	 * @return 입력받은단(int)
	 */
	int getDan() {
		
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
		
	}
	
	int getDan(String msg) {
		
		System.out.print(msg);
		
		int dan = getDan();
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		sc.nextLine();
		
		return dan;
	}
	
	/**
	 * 호출자가 출력할 단을 넘겨주면 그 단의 구구단을 출력
	 * @param dan 출력할단
	 */
	void print(int dan) {
		
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i
					+ " = " + (dan * i));
		}
		
	}
	
	/**
	 * 2 ~ 9단까지의 구구단을 출력 
	 */
	void print() {
		
		print(2, 9);
		
		/*
		for(int dan = 2; dan <= 9; dan++) {
			
			print(dan);
			
//			System.out.println("*** " + dan + "단 ***");
//			
//			for(int i = 1; i <= 9; i++) {
//				System.out.println(dan + " * " + i + " = "
//									+ (dan * i));
//			}
//			System.out.println();
		}
		*/
	}
	
	/**
	 * 시작단에서부터 종료단까지의 구구단을 출력
	 * @param start 시작단
	 * @param end   출력단
	 */
	void print(int start, int end) {
		for(int dan = start; dan <= end; dan++) {
			print(dan);
		}
	}
}

















