package kr.co.ch.day07.homework;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 checkChar()메소드 \n 입력한 문자열에서 특정 문자의 갯수를 반환하는 메소드 입니다.");
		System.out.println("문자열을 입력하세요 : ");
		String strData01 = sc.nextLine();
		System.out.println("문자열 중에서 카운트하고싶은 문자를 입력하세요 : ");
		char ch01 = sc.nextLine().charAt(0);
		int cnt = StringUtil.checkChar(strData01, ch01);
		System.out.println(strData01 + " 에 포함된 " + ch01 + " 의 갯수는 : " + cnt);
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("2번 String removeChar()메소드 \n 입력한 문자열에서 특정 문자를 제거하는 메소드 입니다.");
		System.out.println("문자열을 입력하세요 : ");
		String oriStr01 = sc.nextLine();
		System.out.println("문자열 중에서 제거하고 싶은 문자를 입력하세요 : ");
		char delChar01 = sc.nextLine().charAt(0);
		String char_remove01 = StringUtil.removeChar(oriStr01, delChar01);
		System.out.println(oriStr01 + "에서 " + delChar01 + " 을 제거한 문자열 입니다. ");
		System.out.println(char_remove01);
	}
}
