package kr.co.ch.day04.homework;

import java.util.Random;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(10) +1;
		int num2 = r.nextInt(10) +1;
		int num3 = r.nextInt(10) +1;
		
		System.out.println(num + " : " + num2 + " : " + num3);
		
		int max = num;
		int min = num2;		
		if(num > num2) {
		
			
		/*
		 Random r = new Random();
		int num = r.nextInt(10) + 1;
		int num2 = r.nextInt(10) + 1;
		int num3 = r.nextInt(10) + 1;
		
		System.out.println(num + " : " + num2 + " : " + num3);
		
		int min = num, max = num2;
		if(num > num2) {
			min = num2;
			max = num;
		}
		
		if(num3 > max)
			System.out.println(num3 + " > " + max + " > " + min);
		else if(num3 > min)
			System.out.println(max + " > " + num3 + " > " + min);
		else
			System.out.println(max + " > " + min + " > " + num3);	
		 */
		}
	}
}
