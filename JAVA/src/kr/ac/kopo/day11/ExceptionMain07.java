package kr.ac.kopo.day11;

import java.util.Scanner;

public class ExceptionMain07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.print("짝수를 입력하세요 : ");
			int num = sc.nextInt();
			if(num % 2 == 1) {
//				throw new Exception();
//				throw new Exception("짝수만 가능합니다 but 입력받은 정수 : " + num);
				throw new OddException("짝수만 가능합니다 but 입력받은 정수 : " + num);
			}
			System.out.println("입력받은 짝수 : " +  num);
		} catch(Exception e) {
//			System.out.println("예외발생!!! : " + e.getMessage());
			e.printStackTrace();
		}
		
		/*
		System.out.print("짝수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num % 2 == 1) {
			System.out.print("홀수입니다... 짝수를 입력하세요");
		} else {
		
		System.out.println("입력받은 짝수 : " +  num);
		}
		*/
	}
}
