package kr.ac.kopo.day02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 계절을 입력하세요 : ");
		String season = sc.nextLine();
		
		switch(season) {
		case "봄" : 
		case "spring" : 
		case "SPRING" : 
			System.out.println(season + "은 3월 ~ 5월까지입니다");
			break;
		case "여름" : 
			System.out.println(season + "은 6월 ~ 8월까입니다");
			break; 
		case "가을" : 
			System.out.println(season + "은 9월 ~ 11월까입니다");
			break; 
		case "겨울" : 
			System.out.println(season + "은 12월 ~ 2월까입니다");
			break; 
			
		}
		
	}
}
