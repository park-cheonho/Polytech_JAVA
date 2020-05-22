package kr.ac.kopo.day01;

import java.util.Scanner;

/*
 * Scanner 클래스
 	키보드를 통해 정수, 실수, 논리값, 문자열을 입력받는 기능을 제공하는 클래스 
 */

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
//		String str = sc.next();
		String str = sc.nextLine();
		System.out.println("str : [" + str + "]");
		
//		System.out.print("참/거짓 중 선택하세요(ture, false만 입력가능) : ");
//		boolean bool = sc.nextBoolean();
//		System.out.println("bool : " + bool);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		System.out.println("num = " + num);
//		
	}
}














