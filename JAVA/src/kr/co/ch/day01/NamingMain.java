package kr.co.ch.day01;

import java.util.Random;

/*
 	NamingRule에 의거하여
 	클래스, 변수, 메소드의 개수를 구하시오.
 	
 	클래스 : 대문자의 갯수로 생각 4개(NamingMain, String, Random, System) 
 	변 수 : 소문자 시작 3개 (args, r, out)
 	메소드 : 소문자 시작+괄호 main println nextInt
 */

public class NamingMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		System.out.println(r.nextInt());
					
	}
}
