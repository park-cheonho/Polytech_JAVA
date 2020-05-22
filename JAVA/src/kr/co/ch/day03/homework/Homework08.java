package kr.co.ch.day03.homework;

import java.util.Scanner;

/*
8. 시작단과 종료단을 입력받아 구구단을 출력하시오.
	시작단을 입력 : 5
	종료단을 입력 : 8	
 	*** 5단 ***
	5 * 1 = 5
	...
	8 * 9 = 72
	이 때, 시작단을 8, 종료단을 5을 입력해도 같은 결과가 나와야 합니다
 */
public class Homework08 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("시작단을 입력 : ");
		int a = sc.nextInt();
		System.out.println("종료단을 입력 : ");
		int b = sc.nextInt();

		int sdan = a, edan = b;
		if(a > b) {
			sdan = b;
			edan = a;
		}
		
		for(int dan = sdan; dan <= edan; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			System.out.println();
		}
	}
}

		
		/*
		// 바깥쪽이 행 안쪽이 열
		for (int i = a; i <= b; i++) { // 시작단 부터 종료단 까지
			System.out.println("*** " + i + " 단 ***");
			for (int j = 1; j <= 9; j++) {
				System.out.println("   " + i + "*" + j + "=" + i * j);
			}
		}

	}

}
*/
	