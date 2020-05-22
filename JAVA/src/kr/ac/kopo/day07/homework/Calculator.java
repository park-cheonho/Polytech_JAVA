package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Calculator {

	int num;
	int num2;
	
	int getNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	void inputNums() {

		this.num = getNum();
		this.num2 = getNum();
	}
	
	int add() {
		return num + num2;
	}
	
	int sub() {
		return num - num2;
	}
	
	int mul() {
		return num * num2;
	}
	
	double div() {
		return (double)num / num2;
	}
	
	void calculate() {
		
		System.out.println("< 사칙연산 결과 >");
		System.out.println(num + " + " + num2 + " = " + add());
		System.out.println(num + " - " + num2 + " = " + sub());
		System.out.println(num + " * " + num2 + " = " + mul());
		System.out.println(num + " / " + num2 + " = " + div());
	}
	
	boolean isPrime(int num) {
		
		boolean bool = true;	// 소수라고 가정
		for(int i = 2; bool && i <= num/2; i++) {
			if(num % i == 0) {
				bool = false;
				break;
			}
		}
		
		return bool;
	}
	
	void checkPrime() {
		System.out.println(num + "소수 여부 : " + isPrime(num));
		System.out.println(num2 + "소수 여부 : " + isPrime(num2));
	}
}














