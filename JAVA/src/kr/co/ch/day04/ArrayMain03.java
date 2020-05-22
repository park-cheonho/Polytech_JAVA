package kr.co.ch.day04;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		//int[] copyArr = arr; // shallow copy  <-> deep copy
		
		int[] copyArr;
		copyArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			copyArr[i] = arr[i];
		}
		
		// -> 매번 for 문쓰지말고 System.arraycopy사용
		//System.arraycopy(arr, 0, copyArr, 0, length);
		// (복사할배열, 어디부터, 새로운배열, 새 배열의 어디 부터, 얼마나);
		
		System.out.println("<arr의 모든 정수 출력>");
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("<copy의 모든 정수 출력>");
		for(int num : copyArr) {
			System.out.println(num);
		}

		arr[2] = 100;
		
		System.out.println("<arr의 모든 정수 출력>");
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("<copy의 모든 정수 출력>");
		for(int num : copyArr) {
			System.out.println(num);
		}
		
		
		
		
		
		/*
		String[] strArr = {"폴리텍", "자바", "교육"};
		String[] copyArr = strArr;
		
		System.out.println("<strArr의 문자열 출력>");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		System.out.println("<strArr의 문자열 출력>");
		for(String str : copyArr) {
			System.out.println(str);		
		}
		strArr[1] = "hello world";
		
		System.out.println("<strArr의 문자열 출력>");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		System.out.println("<strArr의 문자열 출력>");
		for(String str : copyArr) {
			System.out.println(str);		
		}
		*/
		
	}
}
