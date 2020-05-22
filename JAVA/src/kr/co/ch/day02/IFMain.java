package kr.co.ch.day02;

import java.util.Scanner;

/*
 * 기상;
 * 밥먹고 / 그냥;
 * 학교간다;
 */

public class IFMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t집에서 출발 시간을 입력(7시10분 710입력) : ");
		int 출발시간 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("기상한다");
		if(출발시간 <800) {
		System.out.println("걸어서");
		} else if(출발시간 < 815) {
		System.out.println("버스타고");
		} else {
		System.out.println("택시타고");
		}
		
		System.out.println("학교간다");
		
		/*
		if(800 <= 출발시간 && 출발시간 < 815) {
		System.out.println("버스타고");
		} else { //출발시간 8이전 8시15분 이후만 가능
			if(출발시간 < 800) {
			System.out.println("걸어서");
			} else {
			System.out.println("택시타고");
			}
		}
		
		System.out.println("학교간다");
		*/
		
		
		
		
		//방법2
		/*
		if(출발시간 < 815) {
			if(출발시간 < 800) {
				System.out.println("걸어서");
			} else {
				System.out.println("버스타고");
			}
		} else {
			System.out.println("택시타고");
		}
		*/
		
		//방법1
		/*
		if(출발시간 < 800) {
		System.out.println("걸어서");
		} else { // 중첩된 if else의 해석이 중요 이미 출발시간의 의미가 담긴다
			if( 출발시간 < 815){ // 얘는 800 이후릐 출발
				System.out.println("버스타고");
			} else { // 얘는 815이후의 출발
				System.out.println("택시타고");
			}	
		}
		System.out.println("학교간다");
		*/
		
		/*
		System.out.println("기상한다");
		
		System.out.println("\t집에서 출발 시간을 입력(7시10분 710입력) : ");
		int 출발시간 = sc.nextInt();
		sc.nextLine();
		*/

		// System.out.println(출발시간 >= 800 ? "버스타고" : "걸어서");
		// 3항 연산자로도 가능
		
		/*
		if(출발시간 >= 800) {
			System.out.println("버스타고");
			} else {
				System.out.println("걸어서");
			}
			
	 		System.out.println("학교간다");
		
		
//		if(출발시간 < 800) {
//		System.out.println("걸어서");
//	
//		} else {
//			System.out.println("버스타고");
//		}
//		
// 		System.out.println("학교간다");
		
		// 걸어서 or 버스타고 둘중에 하나를 선택하면 나머지 한 선택지는 포기하는 것 -> if else
		
		/*
		System.out.println("기상한다");
		
		System.out.println("일어난 시간을 입력(7시10분 710입력) : ");
		int 기상시간 = sc.nextInt();
		sc.nextLine();
		
		if(기상시간 < 700) {
			System.out.println("밥먹고");
		}
		
		System.out.println("학교간다");
		*/
	}

}
