package kr.ac.kopo.day04.homework;

import java.util.Random;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num = r.nextInt(10) + 1;	 // 1 ~ 10사이의 정수
		
		System.out.println("< 1 ~ 100사이의 정수 중  " + num + "배수 제외 >");
		for(int i = 1; i <= 100; i++) {
			if(i % num != 0) {
				System.out.printf("%5d", i);
			}
		}
		System.out.println();
		
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
//				}
//			}
//		}
	}
}










