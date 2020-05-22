package kr.co.ch.day07;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String str2 = "Hello";
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		
		/*
		//주소비교
		if(str==str2) {
			System.out.println("str == str2");
		}else {
			System.out.println("str != str2");
		}
		*/
		
		//값비교 = equals
		boolean bool = str.equals(str2);
		if(bool) {
			System.out.println("str : " + str);
		}else {
			System.out.println("str2 : " + str2);
		}
		
		bool = str.equalsIgnoreCase(str2);
		System.out.println("equalsIgnoreCase()...");
		if(bool) {
			System.out.println("str : " + str);
		}else {
			System.out.println("str2 : " + str2);
		}
		
		str = "Hello world";
		System.out.println(str + "h로 시작하나요?" + str.startsWith("h"));
		System.out.println(str + "He로 시작하나요?" + str.startsWith("He"));
		System.out.println(str + "he로 시작하나요?" + str.startsWith("he"));
		System.out.println(str + "world로 끝나나요?" + str.endsWith("world"));
		
		str = "Hello";
		str2 = "Hello";
	
		int cmp = str.compareTo(str2);
		System.out.println("compareTo() 결과 : " + cmp);
		// 유니코드 간의 차이로 비교하기 때문에 같으면 값이 0으로 나옴
		// 다르면 유니코드간 차를 리턴함
		//>0 첫번쨰 문자열이 두번쨰보다 사전적으로 뒤에 위치 / 0< 1이 2보다 사전적으로 앞에 위치 인지가 궁금함
		//문자열끼리 오름차순 내림차순 정렬할때 필요
		
		String[] names = {"홍길동", " 홍길순", "윤길동", " 강길동", "김철수", "홍길동"	};
		
			
		System.out.println("< 이름이 \"홍길동\"인 사람 검색 >");
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		System.out.println("< 성이 \"홍\"인사람 검색 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름이 \"길동\"인사람 검색 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		System.out.println("< \"홍\"이 포함된 사람 검색 >");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
}

}
