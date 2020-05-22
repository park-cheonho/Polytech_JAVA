package kr.co.ch.day02.homework;

import java.util.Scanner;

/*
2번 
3661 초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오
결과출력
1 시간 1 분 1 초
초를 입 력 하 세요 : 3600
3600
초 1 시 간 0 분 0 초  1 시 간
초를 입 력 하 세요 3610
3610
초 1 시 간 0 분 10 초  1 시 간 10 초
*/

public class Homwork02 {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("초를 입력하세요 : ");
		int sec1 = sc1.nextInt();
		sc1.nextLine(); // 버퍼에러 방지용!
		sc1.close();
		
		int hour = (sec1 / 3600); // 시간은 입력된 값을 3600으로 나눈 몫
		//int min = hour % 60;
		int min = (sec1 % 3600) / 60; // 분은 시간을 3600으로 나눈 나머지를 60으로 나눈 몫
		int sec2 =(sec1 % 3600) % 60; // 초는 분을 60으로 나눈나머지
		
		
		//System.out.println(hour + " 시간 " + min + " 분 " + sec2 + " 초 ");
		
		/*
		if(hour > 0) {
			System.out.print(hour + " 시간 " + min + " 분 " + sec2 + " 초 ");
		} else if(min > 0 ) {
			System.out.print(min + " 분 " + sec2 + " 초 ");
		} else {
			System.out.print(sec2 + " 초 ");
		}
		// 59초는 해결 했지만 3600은 해결 실패....
		*/
		//접근방식을 바꾸기 0이면 안나오게 해보기 -> 성공
		if(hour!=0){
			System.out.print(hour+"시간");
		}
		if(min!=0){
			System.out.print(min+"분");
		}
		if(sec2!=0){
			System.out.print(sec2+"초");
		}
		
		
		/*
		 * 진행과정중 실패한 것들
		if(hour < 0) {
			System.out.println(min + " 분 " + sec2 + " 초 ");
		} else if(min < 0 ) {
			System.out.println(sec2 + " 초 ");
		} else {
			System.out.println(hour + " 시간 " + min + " 분 " + sec2 + " 초 ");
		}
		*/
		/*
		if(0 < sec2 && sec2 <60) {
			System.out.print(sec2 + " 초 ");
		} else if (sec2 < 3600) {
			System.out.print(min + " 분 " + sec2 + " 초 ");	
		} else if (sec2 > 3600) {
			System.out.print(hour + " 시간 " + min + " 분 " + sec2 + " 초 ");
		}
		*/
		
	}	
}



