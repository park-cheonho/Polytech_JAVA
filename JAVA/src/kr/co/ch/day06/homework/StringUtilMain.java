package kr.co.ch.day06.homework;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
		
		StringUtil str_util = new StringUtil();
		
		Scanner sc = new Scanner(System.in);
		
		//1번 isUpperChar( char c ) 메소드
		System.out.println("1. 대문자 판별기\n 하나의 문자를 입력하세요. 대문자라면 true가 출력됩니다.\n 문자를 입력하세요. : ");
		String str_isUpper = sc.nextLine();
		char c = str_isUpper.charAt(0);
		System.out.println(str_util.isUpperChar(c));
		System.out.println();
		
		//2번 isLowerChar(char c) 메소드
		System.out.println("2. 소문자 판별기\n 하나의 문자를 입력하세요. 소문자라면 true가 출력됩니다.\n 문자를 입력하세요 : ");
		String str_isLower = sc.nextLine();
		char c2 = str_isLower.charAt(0);
		System.out.println(str_util.isLowerChar(c2));
		System.out.println();
		
		//3번 max( int i, int j) 메소드
		System.out.println("3. 큰수 판별기\n 두개의 정수를 입력하세요. 둘중 큰수가 출력 됩니다.\n 두 정수를 입력하세요 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.nextLine();
		System.out.print("두 정수중 큰수 : " +  str_util.max(n1, n2));
		System.out.println();
		System.out.println();
		
		//4번 min(int i, int j)
		System.out.println("4. 작은수 판별기\n 두개의 정수를 입력하세요. 둘중 작은수가 출력 됩니다.\n 두 정수를 입력하세요 : ");
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		sc.nextLine();
		System.out.print("두 정수중 작은수 : " +  str_util.min(n3, n4));
		System.out.println();
		System.out.println();
		
		//5번 reverseString( String str ) 메소드
		System.out.println("5.거꾸로 출력할 문자열을 입력 하세요. : ");
		System.out.println(str_util.reverseString(sc.nextLine()));
		System.out.println();
		
		//6번 toUpperString(' String str ) 메소드
		System.out.println("6. 입력한 알파벳 문자열을 대문자로 바꿔드립니다. 문자열을 입력하세요 : ");
		System.out.println(str_util.toUpperString(sc.nextLine()));
		System.out.println();
		
		//7번 toLowerString( String str ) 메소드
		System.out.println("7. 입력한 알파벳 문자열을 소문자로 바꿔드립니다. 문자열을 입력하세요 : ");
		System.out.println(str_util.toLowerString(sc.nextLine()));
		System.out.println();
	}
	
}
