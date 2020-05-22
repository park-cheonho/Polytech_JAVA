package kr.co.ch.day02.homework;

import java.util.Scanner;

public class Homwork08 {

/*
9480원어치 물건을 사고 10000원을 지불했을 때의 거스름돈과 1000원, 500원, 100원, 50원, 10원의 
개수를 출력하는 프로그램을 작성하시오. 이때 물건값과 거스름돈은 키보드로 입력할 수 있어야 한다. 
액수가 정해져 있는 것은 아님. 모든 경우가 되도록 작성할 것.
물건값을 입력하세요 : 5480
지불한 돈의 액수를 입력하세요 : 10000
거스름돈 : 4520원
1000원 : 4개
500원 : 1개
100원 : 0개
50원 : 0개
10원 : 2개
물건값을 입력하세요 : 5480
지불한 돈의 액수를 입력하세요 : 5000
480원이 부족합니다
*/
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("물건값을 입력하세요 : ");
		int price = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("지불한 돈의 액수를 입력하세요 : ");
		int pay = sc2.nextInt();
		
		// 잔돈을 권종별로 나누는 기준을 잘세워야 한다.
		// 보통 이런 경우 과제2번과 비슷하게 흘러가는 양상인 것을 학습 
		// 처음엔 /로 몫 챙기고 두번쨰 부터 % 로 나머지 가져와서 권종으로 / 해서 몫 챙기기!!
		int change = pay - price;
		if(change > 0) {
			System.out.println("거스름돈 : " + change + " 원");
			int thousand = change / 1000;
			System.out.println("1000원 : " + thousand + "개");
			int fivehundred = (change % 1000) / 500;
			System.out.println("500원 : " + fivehundred + "개");
			int hundred = ((change % 1000) % 500) / 100;
			System.out.println("100원 : " + hundred + "개");
			int fifty = (((change % 1000) % 500) % 100) / 50 ;
			System.out.println("50원 : " + fifty + "개");
			int ten = ((((change % 1000) % 500) % 100) % 50) / 10;
			System.out.println("10원 : " + ten + "개");
		} else if(change < 0) {
			System.out.println(-change + " 원이 부족합니다");
		}
	}
}
