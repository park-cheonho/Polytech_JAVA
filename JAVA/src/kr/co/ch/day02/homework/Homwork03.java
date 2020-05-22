package kr.co.ch.day02.homework;

import java.util.Scanner;

public class Homwork03 {

/*
3번 
반지름이 10 인 원의 면적을 구해서 출력하시오
참고 : 원주율 3.141592
결과출력 : 원의 면적은 143.1234 입니다
*/	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		
		double r = sc.nextDouble();
		double pi = 3.141592;
		double area = r * r * pi;
		sc.close();
		System.out.println("결과출력 : 원의 면적은 " + area + " 입니다.");
	}
	// 반지름이 10인데 원넓이가 143.1234가 가능한것인지 모르겠습니다.
}
