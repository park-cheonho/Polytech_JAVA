package kr.co.ch.day03.homework;

/*
7. 구구단을 출력하세요
 	*** 2단 ***
    2 * 1 = 2
	...
	2 * 9 = 18

 	*** 3단 ***
	...
	9 * 9 = 81
 */

public class Homework07 {

	public static void main(String[] args) {

		// 바깥쪽이 행 안쪽이 열
		for (int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + " 단 ***");
			for (int j = 1; j <= 9; j++) {
				System.out.println("   " + i + "*" + j + "=" + i * j);
			}
		}
	}
}