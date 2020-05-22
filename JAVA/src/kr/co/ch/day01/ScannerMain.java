package kr.co.ch.day01;

import java.util.Scanner;

/*
 * Scanner 클래스
 *  키보드를 통해 정수, 실수, 논리값, 문자열을 입력받는 기능을 제공하느 클래스
 */
public class ScannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println("str : [" + str + "]");
		//nextLine은 문자열을 오직 엔터로만 구별한다.
		
		
		//System.out.println("참/거짓 중 선택하세요(ture, false만 입력가능) : ");
		//boolean bool = sc.hasNextBoolean();
		//System.out.println("bool : " + bool);
		
		//System.out.println("정수를 입력하세요 : ");
		//int num = sc.nextInt();
		//System.out.println("num = " + num);
		
		//Scanner에 대한 버그 이야기 해야함
		//연산자 제어문 과제 폭탄입니다.
		// 책을 보고 복습을 하세요.
		// 자바 책을 쫙펴요 치고 복습하세요
	
	}

}
