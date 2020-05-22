package kr.co.ch.day07;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {
		
		String str = "hello world";

		char c = 'r';
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c));
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c, 4));
	
		c = 'p';
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c));
		
		c = 'l';
		System.out.println("lastIndexOf() " + c + "의 검색된 위치 : " + str.lastIndexOf(c));
		
		//l 다 검색하고 싶은 경우
		str = "hello world";
		String searchStr = "l";
		System.out.println("< " + str + "에서\"" + searchStr + "\" 위치>");
		int searchIdx = str.indexOf(searchStr);
		while(searchIdx != -1) {
			System.out.println("검색된 위치 : " + searchIdx);
			searchIdx = str.indexOf(searchStr, searchIdx+1);
		}

		System.out.println("< " + str + "에서\"" + searchStr + "\" 위치>");
		searchIdx = -1;
		while((searchIdx = str.indexOf(searchStr, searchIdx+1)) != -1); {
			System.out.println("검색된 위치 : " + searchIdx);			
		}
		//LastIndexOf도 해보기
		
		str = "hello world";
		System.out.println("substring(2) : " + str.substring(2)); // str.substring(2, str.length());
		System.out.println("substring(2, 7) : " + str.substring(2, 7));//7번지 전까지 llo w 가 나옴
		
		String strA = "good";
		String strB = "bye!!!";
		
		str = strA + strB;
		str = strA.concat(strB);
		System.out.println("str : " + str);
		//
		
		str = "             hello              ";
		
		System.out.println("[" + str + "]의 길이 : " + str.length());
		str = str.trim(); // 중간 공백은 제어 x
		System.out.println("[" + str + "]의 길이 : " + str.trim() + str.length());
		
		str = "홍길동전:허균:조선시대";
		System.out.println("str : " + str);
		
		String[] strArr = str.split(":");
		System.out.println(Arrays.deepToString(strArr));

		strArr = str.split(",");
		System.out.println(Arrays.deepToString(strArr));
		
		String date = "2020-04-20";
		String[] dateArr = date.split("-");
		System.out.println(Arrays.toString(dateArr));
		
		int num = 12345;
		int num2 = 100;
		
		System.out.println(num + "" + 100); // 원하는 형태 12345100
		//정수형을 문자형으로 바꾸고 싶을떄
		System.out.println(String.valueOf(num) + 100 );
		String.valueOf(num2); // 기본적인 타입들을 스트링으로 바꾸줌
		System.out.println(Integer.valueOf("12") + 100); // 문자 12를 int 12로 바꿈
		// 참조자료형
		System.out.println(Integer.parseInt("12") + 100);
		// 똑같다고 봐야함 아주 미세하게 다른점? 
}
	
}
