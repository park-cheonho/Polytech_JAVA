package kr.co.ch.day02.homework;

import java.util.Scanner;

/*
 *  보유하고 있는 책권수를 입력 : 1
 *  1 Book
 *  
 *  보유하고 있는 책권수를 입력 : 2
 *  2 Book
 *  
 *  보유하고 있는 책권수를 입력 : -4
 *  잘못입력하셨습니다.
 *  
 *  if if else 다중if / switch는 어려워보임
 */


public class ExamMain {
	
	public static void main(String[] args) {
		
		System.out.println("보유하고 있는 책의 권수를 입력해 주세요. : ");
		Scanner sc = new Scanner(System.in);
		int 보유권수 = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		if(보유권수 == 1) {
			System.out.println("1 BOOK");
		} else if(보유권수 == 2) {
			System.out.println("2 BOOK");
		} else {
		System.out.println("잘못입력하셨습니다.");
		}
		
	}

}
