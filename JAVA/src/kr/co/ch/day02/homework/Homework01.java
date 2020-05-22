package kr.co.ch.day02.homework;

/*
1번 
영문자 모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하시오
--------------------
영문자 모음의 아스키 코드 값
--------------------
A = 65
E = 69
I = 73
O = 79
U = 85
-------------------
 */

public class Homework01 {
	
	public static void main(String[] args) {
		
		
		System.out.println("영문자 모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하시오");
		System.out.println("-------------------");
		System.out.println("영문자 모음의 아스키 코드 값");
		System.out.println("-------------------");
		char a = 'A';
		System.out.println("A = " + (int)a);
		//문자열 'A'를 정수형으로 표현하기 위한 코드
		char e = 'E';
		System.out.println("E = " + (int)e);
		char i = 'I';
		System.out.println("I = " + (int)i);
		char o = 'O';
		System.out.println("O = " + (int)o);
		char u = 'U';
		System.out.println("U = " + (int)u);
		System.out.println("-------------------");
	}

}
