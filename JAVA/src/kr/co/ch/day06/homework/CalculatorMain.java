package kr.co.ch.day06.homework;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int x = sc.nextInt();
		
		System.out.println("정수 : ");
		int y = sc.nextInt();
		sc.nextLine();
		
		System.out.println(x + " + " + y + " = " + cal.plus(x, y));
		System.out.println(x + " - " + y + " = " + cal.minus(x, y));
		System.out.println(x + " - " + y + " = " + cal.multi(x, y));
		System.out.println(x + " - " + y + " = " + cal.divide(x, y));
		
		System.out.println(x + " 소수체크  : " + cal.prime(x));
		System.out.println(y + " 소수체크  : " + cal.prime(y));
		
	}
}
