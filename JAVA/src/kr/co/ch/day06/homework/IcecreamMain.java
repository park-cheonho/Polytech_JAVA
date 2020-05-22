package kr.co.ch.day06.homework;

import java.util.Scanner;

public class IcecreamMain {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림을 몇개 구입 할래?");
		int EA = sc.nextInt();
		sc.nextLine();
		
		Icecream ice = new Icecream();
		ice.info(EA);
	}
}
