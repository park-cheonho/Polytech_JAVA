package kr.ac.kopo.day04.homework;

import java.util.Random;

public class HomeworkMain03 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int start = r.nextInt(8) + 2;	// 0+2 ~ 7+2 
		int end = r.nextInt(8) + 2;	// 0+2 ~ 7+2 

		System.out.println(start + " , " + end);
		
		int sdan = start, edan = end;
		if(start > end) {
			sdan = end;
			edan = start;
		}
		
		for(int dan = sdan; dan <= edan; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			System.out.println();
		}
	}
}














