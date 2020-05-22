package kr.co.ch.day02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 계절을 입력하세요 : ");
		String season = sc.nextLine();
		//크다작다는 보통 if 많이씀
		//동등비교는 switch가 훨씬 편함 그래서 문자열까지 추가 된것
		switch(season) {
		case "봄" :
		case "spring" :
		case "SPRING" :	
			System.out.println(season + "은 3월 ~5월까지입니다.");
			break;
		case "여름" : case "summer" : case "SUMMER" :
			System.out.println(season + "은 6월 ~8월까지입니다.");
			break;
		case "가을" :
			System.out.println(season + "은 9월 ~11월까지입니다.");
			break;
		case "겨울" :
			System.out.println(season + "은 12월 ~2월까지입니다.");
			break;	
		}
		
		if(season  == "봄") {
			System.out.println(season + "은 3월 ~5월까지입니다.");
		}
	}
}
