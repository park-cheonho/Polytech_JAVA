package kr.ac.kopo.day02;

import java.util.Scanner;

public class OperationMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a를 입력 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("b를 입력 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		// b가 a의 약수 여부 판단
		boolean result = b != 0 && a % b == 0;
		System.out.println("약수여부 : " +  result);
		
		/*
		System.out.print("정수를 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean result = (num >= 0) && (num % 2 == 0);
		
		System.out.println(num + " 짝수판단여부 : " + result);
		*/
		
		/*
		int a = 1, b = -1, c = 0;
		
//		boolean bool = (++a > 0) && (++b > 0);
		
//		boolean bool = (--a > 0) && (--b > 0);
		
		boolean bool = (--b > 0) && (--a > 0);
		
		System.out.printf("a = %d  b = %d  c = %d  bool = %b\n", a, b, c, bool);
		*/
	}
}
