package kr.co.ch.day02;

import java.util.Scanner;

public class ScannerMain02 {
	
	public static void main(String[] args) {
		
		/*
		 * 문자열을 입력 : hello world
		 * 정수를 입력 : 123
		 * 문자열 : hello world 정수 : 123
		 */
		
		/*
		 * 정수입력을 받으면서 엔터치면 문자열을 입력 받지 않는 버그 발생 
		 * 이유 : 실제 스캐너 클래스가 입력 버퍼를 사용하기 때문에 이런 이유 발생
		 * 정수 입력 받고 구 뒤에 문자열 입력 받으면 에러가 자주 발생 
		 * 버퍼때문에 이런 문제 발생 
		 * 정수 입력시 버퍼에 123\n 들어와서 num으로 123 들어감 버퍼에는 \n남아있음
		 * 문자열 입력 하려 하는데 버퍼에 남아있는 \n이 있기에 문자열에 오류 발생 함
		 * 선 문자열 후 정수
		 */
		/*
		System.out.println("문자열을 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("문자열 : " + str + ", 정수 : " + num);
		*/
		
		/*
		 * 정수 다음 정수 받을때는(실수도) 처음 입력이 그다음 입력에도 영향을 준다. 
		 * 문제 발생 키보드 문재 발생 피하기 위해서는 버퍼를 비워야함!!!!
		 * 일반적 해결방법은 버퍼에 남아있는 \n를 지워주기 위해서 
		 * sc.nextLine(); 을 통해 남아있는 엔터까지 소비하게 하는 방법이 있음
		 * 처음 입력에 정수가 아니라 문자 들어오면 예외 처리를 해야함
		 * 
		 * 정수,실수,불린으로 받지 말고 차라리 무조건 문자열로 입력 받는게 어때?
		 * 입력 받은 문자열을 다시 본래 의도대로 바꿔주기 위해서
		 * sc.nextLine(); -> int num = Integer.parseInt(sc.nextLine());
		 * Double.parseDouble(sc.nextLine());
		 * parse , valuable
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 정수를 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두번쨰 정수를 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("정수1 : " + num + ", 정수2 : " + num2);
		
		/*
		 * 임의의 값을 추출하는 함수 Random
		 * 
		 */
		
	}
}
