package kr.ac.kopo.day02;

import java.util.Scanner;

public class ScannerMain02 {

	public static void main(String[] args) {
		
		/*
		 * 정수를 입력 : 123
		 * 문자열을 입력 : hello world
		 * 문자열 : hello world   정수 : 123
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력 : ");
		
		int num = Integer.parseInt(sc.nextLine());		// Integer.parseInt("123");
		
//		int num = sc.nextInt();
//		sc.nextLine();
		
		System.out.print("두번째 정수를 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num : " + num + ", num2 : " + num2);
		
		
		/*
		 * System.out.print("문자열을 입력 : "); String str = sc.nextLine();
		 * 
		 * System.out.print("정수를 입력 : "); int num = sc.nextInt();
		 * 
		 * System.out.println("문자열 : " + str + ", 정수 : " + num);
		 */		
	}
}













