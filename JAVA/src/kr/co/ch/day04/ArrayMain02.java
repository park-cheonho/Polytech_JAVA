package kr.co.ch.day04;

import java.util.Arrays;

public class ArrayMain02 {
	
	public static void main(String[] args) {
		// "폴리텍", "자바", "교육" 3개의 문자열을 저장하는 배열 strArr 생성
		
//		String[] strArr = {"폴리텍", "자바", "교육"};
		String[] strArr = new String[5];
// 주소값을 가진 참조형들은 new로 하면 초기값 나옴 str 초기값 null		
		
		// 중간에 변수 넣을때편하게 하기 위해 변수 만듬
		int loc = 0;
		
		strArr[loc++] = "폴리텍";
		strArr[loc++] = "광명";
		strArr[loc++] = "자바";
		strArr[loc++] = new String("교육");
		
		/*
		 	배열의 모든 요소를 출력하는 3가지 방식 ! 일부분 x 모든 부분 츨력
		 	1. index를 이용한 출력 for 0 -> length까지
		 	2. 1.5버전의 for문을 이용한 출력 (foreach문)
		 		for( 자료형 변수명  :  배열) {}
		 	3. 자바가 제공하는 함수 
		 	   Arrays.toString() 메소드 이용한 출력
		 	   Arrays.toString(배열명) -> 가진 모든 원소를 합친 하나의 문자열을 만듦
		 	   Arrays.toString(배열명) -> "[첫번쨰요소, 두번쨰요소, 세번째요소 ..... 마지막요소]"
		 	   클래스라서 임포트해야함
		 */
		
		System.out.println("<index를 이용한 출력>"); // 입력 받는경우도 사용 가능
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("<foreach를 이용한 출력>"); // 입력받을떄 x 출력,검색으로만 가능 한계
		//strArr가 가진 원소 갯수만큼 루프
		//String str = strArr[0]
		//String str = strArr[1]
		//String str = strArr[2]
		//String str = strArr[2]
		//String str = strArr[strArr.length-1]
		
		for(String str : strArr) {
			System.out.println(str);
		}
		
		System.out.println("<Arrays.toString()를 이용한 출력>");
		System.out.println(Arrays.toString(strArr)); // 
	/*	
	static String arraysToString(String[] arr) {
			
			String str = "[";
			for
	*/		
			
		}
	}

