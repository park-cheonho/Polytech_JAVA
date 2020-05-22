package kr.co.ch.day03.homework;
/*
1. 정 수 3 개 를 입 력 받 아 큰 수 에서 작 은 수 순 으로 출 력 하 는 코 드 를 작 성 하 시오
     정 수 3 개 를 입 력 하 세요 : 12 6 22
   22 12 6
     또 는
     첫 번 째 정 수 입 력 : 12
     두 번 째 정 수 입 력 : 6
     세 번 째 정 수 입 력 : 22
   22 12 6
 */
import java.util.Scanner;

public class Homework01 {
// 더 간략하게 짜는 방법이 궁금합니다. -> 3/14 수업 내용 보완 방법2
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close(); // 경고 없애는 방법 -> 이유는 잘 모르겠습니다.ㅠ
		
		// 방법은 if의 조건을 절묘하게 나누기!!!!
		/* 직접 써보기
		 * 나오는 경우의 수 
		 * 1>2>3  ("%d %d %d", num1, num2, num3);
		 * 1>3>2  ("%d %d %d", num1, num3, num2);
		 * 2>1>3  ("%d %d %d", num2, num1, num3);
		 * 2>3>1  ("%d %d %d", num2, num3, num1);
		 * 3>1>2  ("%d %d %d", num3, num1, num2);
		 * 3>2>1  ("%d %d %d", num3, num2, num1);
		 */
		/*
		if (num1 > num2 && num2 >num3) {
			System.out.printf("%d %d %d", num1, num2, num3);
		} else if (num1 > num3 && num3 >num2) {
			System.out.printf("%d %d %d", num1, num3, num2);
		} else if (num2 > num1 && num1 >num3) {
			System.out.printf("%d %d %d", num2, num1, num3);
		} else if (num2 > num3 && num3 >num1) {
			System.out.printf("%d %d %d", num2, num3, num1);
		} else if (num3 > num1 && num1 >num2) {
			System.out.printf("%d %d %d", num3, num1, num2);
		} else if (num3 > num2 && num2 >num1) {
			System.out.printf("%d %d %d", num3, num2, num1);
		}
		*/
		
		//방법 2
		int min = num1, max = num2;
		if(num1 > num2) {
			min = num2;
			max = num1;
		}
		
		if(num3 > max) {
			System.out.println(num3 + " > " + max + " > " + min);			
		}else if(num3 > min) {
			System.out.println(max + " > " + num3 + " > " + min);						
		}else {
			System.out.println(max + " > " + min + " > " + num3);									
		}
	}
}
