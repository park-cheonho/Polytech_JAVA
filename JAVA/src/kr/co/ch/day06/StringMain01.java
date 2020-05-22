package kr.co.ch.day06;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String();
		String str2 = new String("HelloWorld");
		
		char[] chars = {'a', 'b', 'c', 'd', 'e'};
		String str3 = new String(chars);
		String str4 = new String(chars, 1, 3);
		
		System.out.println("str : [" + str + "], length : " + str.length());
		System.out.println("str2 : [" + str2 + "], length : " + str2.length());
		System.out.println("char : " + Arrays.toString(chars));
		System.out.println("str3 : [" + str3 + "], length : " + str3.length());
		System.out.println("str4 : [" + str4 + "], length : " + str4.length());
		
		// srt4.charAt(0) ~ srt4.charAt(str4.length()-1)
		System.out.println("str4의 첫번째 문자 : " + str4.charAt(0));
		System.out.println("str4의 두번째 문자 : " + str4.charAt(1));
		//System.out.println("str4의 세번째 문자 : " + str4.charAt(2));
		//인덱스 넘으면 String index out of bound 에러 나옴
		
		str = "Hello World!!!";
		chars = new char[15];
		
		
//		str.getChars(베끼기 시작할 부분, 끝낼 부분, chars, 앞에부터 공란 몇개);
//		str.getChars(0, str.length(), chars, 0);
//		str.getChars(0, 5, chars, 0);
		str.getChars(0, 5, chars, 3);
		System.out.println("chars : " + Arrays.toString(chars));
	}
		
}
