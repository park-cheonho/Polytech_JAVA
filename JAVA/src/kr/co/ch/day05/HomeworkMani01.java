package kr.co.ch.day05;

import java.util.Scanner;

public class HomeworkMani01 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		int[] evens = new int[10];
		int[] odds = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(i+1 + " `s 정수 : ");
			nums[i] = sc.nextInt();
		}
		
		System.out.println("< 짝수 >");
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.print(nums[i] + " ");
				sum = sum + nums[i];
			}
		}
		System.out.println();
		
		System.out.println("< 홀수 >");
		sum = 0;
		for(int num : nums) {
			if(num % 2 == 1) {
				System.out.print(num + " ");
				sum = sum + num;
			}
		}
		System.out.println();
		System.out.println("홀수의 총합 : " + sum);
	}
}
