package kr.co.ch.day05;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		// 주로 객체지향 1차원 배열을 만들지만 내부적으로는 1차원 배열처럼 움직임
		// 그래서 2차원 배열을 알아야함
		//int[] arr = new int[3];
		//int[] arr2 = new int[3];
		//int[] arr3 = new int[3]; // heap
		
		// 위 참조 변수 1차 배열등의 주소값을 가지고 있는 배열로 만들고자 함
		// datatype [1차원배열의 개수][1차원 배열의 크기] -> 1차원 배열의 크기를 비우는 경우도 있음

		
		int[] [] ar = new int [3][]; // stack
		for(int i = 0; i < ar.length; i ++) {
			ar[i] = new int[i+2];
		}
		
		//축약
		//int[][] ar = new int[3][4];
		
		//ar[0] = new int[4];
		//ar[1] = new int[4];
		//ar[2] = new int[4];
		
		
		System.out.println("ar.length : " + ar.length);
		System.out.println("ar[0].length : " + ar[0].length);
		System.out.println("ar[1].length : " + ar[1].length);
		System.out.println("ar[2].length : " + ar[2].length);
//		/Arrays.toString(ar)
		
		System.out.println("<PRINT>"); 
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar.length; j++) {
				
			}
		}
	}
}
