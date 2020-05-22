package kr.co.ch.day03.homework;

import java.util.Scanner;

/*
6. 단을 입력받아 구구단을 출력하세요
	2 - 9 단을 입력 : 6
 	*** 6단 ***	
	6 * 1 = 6
	6 * 2 = 12
	...
	6 * 9 = 54
 */
public class Homework06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("2 - 9 단을 입력 : ");
		int a = sc.nextInt();

		System.out.println("*** " + a + " 단***");

		// 바깥쪽이 행 안쪽이 열
		for (int i = 1; i <= 9; i++) { 
			System.out.println(a + "*" + i + "=" + a * i);
			// for (int j = 1; j <= 9 ; j++) {
			// System.out.println(a + "*" + j + "=" + a * j);
		}
	}
}
/*
 원래 질문 for문 중첩으로 하면 무한대로 나오는 문제 해결법  
 */
/*
==> 답변
for문이 안에 들어가면 9 * 9개만큼의 출력코드가 나오는거에요
i조건 한번에 j를 9번씩 반복하니깐요..
고민을 조금 더 해보세요
*/
//이해완료