package kr.co.ch.day06;

import java.util.Arrays;

public class ExamMethodMain {

	public static void main(String[] args) {
		
		ExamMethod exam = new ExamMethod();
		
		int sum = exam.getSum(1, 10); // 두개의 정수의 합?
		int totalSum = exam.getTotalSum(1, 10); //두개 정수 사이의 합은?
		
		System.out.println("1 + 10 = " + sum);
		System.out.println("1 + 10사이의 총합 = " + sum);
		
		int[] nums = exam.getNums();
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
		
		System.out.println("배열의 크기를 입력 : ");
		int size = exam.getNum();
		
		// 1~100사이의 난수를 size개만큼 추출.....
		nums = exam.getNums(size);
		
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
		
		System.out.println("1 ~ 100사이의 정수 입력 : ");
		int max = exam.getNum();
		
		//1~max사이의 난수를 size개 만큼 추출.....
		nums = exam.getNums(max, size);
		
		System.out.println("추출된 난수 : " + Arrays.toString(nums));
	}
}
