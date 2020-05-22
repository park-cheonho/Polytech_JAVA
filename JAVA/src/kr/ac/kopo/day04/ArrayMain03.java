package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] ar = /*new int[]*/{10, 20, 30, 40, 50};
		
		ar = new int[]{500, 400, 300};
		System.out.println("ar : " + Arrays.toString(ar));
		
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] copyArr;
		
		copyArr = new int[arr.length];
		
		System.arraycopy(arr, 2, copyArr, 0, 3);
//		for(int i = 2, j = 0; i < arr.length; i++, j++) {
//			copyArr[j] = arr[i];
//		}
		
//		System.arraycopy(arr, 0, copyArr, 0, arr.length);
//		for(int i = 0; i < arr.length; i++) {
//			copyArr[i] = arr[i];
//		}
		
		System.out.println("< arr의 모든 정수 출력 >");
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("< copyArr의 모든 정수 출력 >");
		for(int num : copyArr) {
			System.out.println(num);
		}
		
		arr[2] = 100;
		
		System.out.println("< 변경 후 arr의 모든 정수 출력 >");
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("< copyArr의 모든 정수 출력 >");
		for(int num : copyArr) {
			System.out.println(num);
		}
		
		
//		String[] strArr = {"폴리텍", "자바", "교육"};
//		String[] copyArr = strArr;
//		
//		System.out.println("< strArr의 문자열 출력 >");
//		for(String str : strArr) {
//			System.out.println(str);
//		}
//		
//		System.out.println("< copyArr의 문자열 출력 >");
//		for(String str : copyArr) {
//			System.out.println(str);
//		}
//		
//		strArr[1] = "hello world";
//		
//		System.out.println("<변경후 strArr의 문자열 출력 >");
//		for(String str : strArr) {
//			System.out.println(str);
//		}
//		
//		System.out.println("< copyArr의 문자열 출력 >");
//		for(String str : copyArr) {
//			System.out.println(str);
//		}
		
	}
}
