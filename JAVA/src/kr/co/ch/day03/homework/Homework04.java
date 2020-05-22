package kr.co.ch.day03.homework;

import java.util.Scanner;

/*
4. 다음의 결과를 보이는 프로그램 작성하시오.
	1 - 100 사이의 정수를 입력 : 40
	2 - 10사이의 정수를 입력 : 5
	< 1 ~ 40사이의 5의 배수를 제외한 정수 출력>
	1 2 3 4 6 7 8 9 11 ... 39
	< 1 ~ 40사이의 5의 배수를 제외한 정수 5개씩 출력>
	1 2 3 4 6
	7 8 9 11 12
	...
 */

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - 100 사이의 정수를 입력 : ");
		int a = sc.nextInt();
		System.out.println("2 - 10 사이의 정수를 입력 : ");
		int b = sc.nextInt();
		sc.close();
		
		System.out.println("< 1 ~ " + a + " 사이의 " + b + " 의 배수를 제외한 정수 출력>");
		for(int i = 1; i <= a; i++) { 
			if(i%b == 0) { // b의 배수이면 공백 출력
				System.out.printf(" ");
			} else { // 아니라면 숫자 출력
				System.out.printf("%5d ", i);						
			}
		}
		
		System.out.println("\n"); 
		
		System.out.println("< 1 ~ " + a + " 사이의 " + b + " 의 배수를 제외한 정수 " + b + "개씩 출력>");
		int j = 0; // 새로운 정수를 도입하는 생각은 구글 참고 이런 생각을 못했습니다.
		for(int i = 1; i <= a; i++) {
			if(i%b != 0) { // 0이 아니라면 출력 -> 위 방법보다 간략하게 사용 가능!! 학습
				System.out.printf("%5d ", i);
				j++; //정수  j가 증가하고
				
				if(j == b) { //j가 b가 되면 한줄 엔터
					System.out.println();
					j = 0;
			}
		}
		}
	}
}
/*
  System.out.println("< 1 ~ 100사이의 정수 중  " + num + "배수 제외, 한라인에 5개씩 출력>");
		
		int cnt = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % num != 0) {
				System.out.printf("%-5d", i);
				cnt++;
			}
			if(cnt == 5) {
				System.out.println();
				cnt = 0;
			}
		}
		
				// 방법1
//		int cnt = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % num != 0) {
//				System.out.printf("%5d", i);
//				cnt++;
//				if(cnt % 5 == 0) {
//					System.out.println();
 */
