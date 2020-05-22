package kr.co.ch.day03.homework;
/*
2. 4 개 의 정 수 를 입 력 받 아 가 장 큰 수 를 구 하 는 코 드 를 작 성 하 시오
     정 수 는 각 각 입 력 받 아도 상 관 없 습 니다
     정수 4 개 를 입 력 하 세요 : 89 4 222 6
   89, 4, 222, 6 중 가 장 큰 수 : 222
 */
import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 4개를 각각 입력하세요 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		sc.close();
// if를 통해서 숫자의 크기를 비교해보기
// 구글링해서 보았던 for 문을 써서 하는 부분이 이해를 못하겠어서 좀 원시적이라고 생각되는 방식으로 진행했습니다.		
		if(n1 > n2 && n1 > n3 && n1 > n4) {
			System.out.println( n1 + ", " + n2 + ", " + n3 + ", " + n4 + " 중 가장 큰수 : " + n1 );
		} 
		if(n2 > n1 && n2 > n3 && n2 > n4) {
			System.out.println( n1 + ", " + n2 + ", " + n3 + ", " + n4 + " 중 가장 큰수 : " + n2 );
		}
		if(n3 > n1 && n3 > n2 && n3 > n4) {
			System.out.println( n1+", " + n2 + ", " + n3 + ", " + n4 + " 중 가장 큰수 : " + n3 );
		}
		if(n4 > n1 && n4 > n2 && n4 > n3) {
			System.out.println(n1+", " + n2 + ", " + n3 + ", " + n4 + " 중 가장 큰수 : " + n4 );			
		}
		
		/* 조건 연산자 반영
		 int max01 = n1>n2 ? n1:n2;
		 int max02 = n3>n4 ? n3:n4;
		 
		 System.out.println("max : " + (max01 > max02 ? max01 : max02));
		 
		 -----------------------
		 int max = n1 > n2 ? n1 : n2;
		 if(n3>max) {
		 	max = n3;
		 } if(n4 > max) {
		 	max = n4;
		 }
		 System.out.println("max :" + max);	
		 */
	}
}
