package kr.co.ch.day05;

import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; ) { //문은 생략도 가능 
			System.out.println("num " + (i+1) + " : ");
			nums[i] = sc.nextInt();
			sc.nextInt();
			
			if(i > 0 && nums[i-1] >= nums[i]) {
				for(int j = 0; j < i; j++) {
					if(j != 0) {
						System.out.print(", ");
						System.out.print(nums[j]);
					}
					System.out.println("큰수를 입력하세요...");
				//수정하기} else {
					i++;
				}
			}
		}
				
		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = nums.length-1; i >= 0; i--) {
			/*
			 * 정수가 최대 2자리 가정하에 코드 작성
			 * 정수의 자리수에 상관없이 출력되는 코드 생각하기
			 */
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			System.out.print(n1 * 10 + n10 + "\t");
		}
		System.out.println();
	}
}
