package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(i+1 + "'s 정수 : ");
			nums[i] = sc.nextInt();
			sc.nextLine();
		}
		
		String[] title = {"짝수", "홀수"};
		for (int mod = 0; mod <= 1; mod++) {
//			System.out.println("<< " + (mod == 0 ? "짝수" : "홀수") +  " >>");
			System.out.println("<< " + title[mod] + " >>");
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] % 2 == mod) {
					System.out.print(nums[i] + "  ");
				}
			}
			System.out.println();
		}
		
		
		/*
		System.out.println("< 짝수 >");
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.print(nums[i] + "  ");
				sum = sum + nums[i];
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : " + sum);
		
		System.out.println("< 홀수 >");
		sum = 0;
		for(int num : nums) {
			if(num % 2 == 1) {
				System.out.print(num + "  ");
				sum = sum + num;
			}
		}
		System.out.println();
		System.out.println("홀수의 총합 : " + sum);
		*/
	}
}















