package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 	
 */
public class IFMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\t집에서 출발한 시간을 입력(7시10분 710입력) : ");
		int 출발시간 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("기상한다");
		if(출발시간 < 800) {
			System.out.println("걸어서");
		} else if(출발시간 < 815) {
			System.out.println("버스타고");
		} else {
			System.out.println("택시타고");
		}
		
		System.out.println("학교간다");
		
		
		/*
		System.out.println("기상한다");
		
		if(800 <= 출발시간 && 출발시간 < 815) {
			System.out.println("버스타고");
		} else {	// 출발시간이 8시 이전과 출발시간 8시 15이후
			if(출발시간 < 800) {
				System.out.println("걸어서");
			} else {
				System.out.println("택시타고");
			}
		}
		*/
		
		// 방법2
//		if(출발시간 < 815) {
//			if(출발시간 < 800) {
//				System.out.println("걸어서");
//			} else {
//				System.out.println("버스타고");
//			}
//		} else {
//			System.out.println("택시타고");
//		}
		
		// 방법1
//		if(출발시간 < 800) {
//			System.out.println("걸어서");
//		} else {
//			if( 출발시간 < 815 ) {
//				System.out.println("버스타고");
//			} else {
//				System.out.println("택시타고");
//			}
//		}
		
		System.out.println("학교간다");
		
		/*
		System.out.println("기상한다");
		
		
//		System.out.println(출발시간 >= 800 ? "버스타고" : "걸어서");
		
		if(출발시간 >= 800) {
			System.out.println("버스타고");
		} else {
			System.out.println("걸어서");
		}
		
//		if(출발시간 < 800) {
//			System.out.println("걸어서");
//		} else {
//			System.out.println("버스타고");
//		}
		
		System.out.println("학교간다");
		*/
	
		/*
		 System.out.println("기상한다");
		 
		 System.out.print("\t일어난시간을 입력(7시10분 710입력) : ");
		 int 기상시간 = sc.nextInt();
		 sc.nextLine();
		 
		 if(기상시간 < 700) {
			 System.out.println("밥먹고");
		 }
		 
		 System.out.println("학교간다");
		 */
	}
}
