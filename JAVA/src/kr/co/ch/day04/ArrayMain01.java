package kr.co.ch.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		//기본자료형 배열 
		int[] arr = new int[5]; // [0] ~ [4]
		
		System.out.println("arr : " + arr);
		//arr : [I@15db9742 주소값 실제 렘주소가 아니라 jvm이 매핑한 가상의 해쉬코드
		// @표시가 나오면 주소값이 나옴
		
		System.out.println("1번째 정수 : " + arr[0]);
		System.out.println("2번째 정수 : " + arr[1]);
		System.out.println("3번째 정수 : " + arr[2]);
		System.out.println("4번째 정수 : " + arr[3]);
		System.out.println("5번째 정수 : " + arr[4]);
		//System.out.println("6번째 정수 : " + arr[5]);
		// arr[5]는 없는데 출력하면 
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		at kr.co.ch.day04.ArrayMain01.main(ArrayMain01.java:18) 라고 뜸 
		Exception 예외발생은 에러라고 보자 내가 코드를 잘못친것으로 
		 */
		
		// 5개의 변수에 10 ~ 50 대입
		//arr[0] = 10;
		//arr[1] = 20;
		//arr[2] = 30;
		//arr[3] = 40;
		//arr[4] = 50;
		// 변수화 가능 (x+1) * 10
		//루프로 가능
		// i <= 4 -> i< 5 -> i < arr.length
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		//System.out.println("1번째 정수 : " + arr[0]);
		//System.out.println("2번째 정수 : " + arr[1]);
		//System.out.println("3번째 정수 : " + arr[2]);
		//System.out.println("4번째 정수 : " + arr[3]);
		//System.out.println("5번째 정수 : " + arr[4]);
		
		System.out.println("<대입후 !!!!!!!>");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + " 번째 정수 : " + arr[i]);
		}
		
		//참조형 배열이 더 중요 String[]

	}
}
