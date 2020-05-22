package kr.co.ch.day02.homework;

import java.util.Scanner;

public class Homwork07 {

/*
화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램을 작성하시오.
입력(알파벳) : a
변경된 값 : A
참고> 화면에서 받은 문자열에서 한 문자 가져오기
Scanner sc = new Scanner(System.in);
String inputStr = sc.nextLine( );
char c = inputStr.charAt(0); -> 문자열 c에 담은 문자열에서 첫번째 문자를 c에 담는다?
*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력(알파벳) : ");
		String inputStr = sc.nextLine( );
		sc.close();
		//아스키 코드 65 = A 90 = Z 
		       //97 = a 122 = z
				// 규칙 소문자 + 32 = 대문자 | 대문자 - 32 = 소문자
		//만들어야 하는것 문자열로 받은것을 +-32해서 아스키 코드로 변환?
		char c = inputStr.charAt(0);
		
		if('A' <= c && c <= 'Z') { // 대문자의 경우
			c += 32;
		} else if('a' <= c && c <= 'z') { // 소문자의 경우
			c -= 32;
		}
		System.out.println("변경된 값 : " + c);
		
		
	}
}
