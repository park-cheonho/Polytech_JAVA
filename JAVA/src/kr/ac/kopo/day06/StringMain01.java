package kr.ac.kopo.day06;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String();
		String str2 = new String("Hello World");
		
		char[] chars = {'A', 'B', 'C', 'D', 'E'};
		String str3 = new String(chars);
		String str4 = new String(chars, 1, 3);
		
		System.out.println("str  : [" + str + "], length : " + str.length());
		System.out.println("str2 : [" + str2 + "], length : " + str2.length());
		System.out.println("chars : " + Arrays.toString(chars));
		System.out.println("str3 : [" + str3 + "], length : " + str3.length());
		System.out.println("str4 : [" + str4 + "], length : "+ str4.length());
		
		// str4.charAt(0) ~ str4.charAt(str4.length()-1)
		System.out.println("str4의 첫번째 문자 : " + str4.charAt(0));
		System.out.println("str4의 두번째 문자 : " + str4.charAt(1));
		System.out.println("str4의 세번째 문자 : " + str4.charAt(2));
//		System.out.println("str4의 네번째 문자 : " + str4.charAt(3));
		
		str = "Hello World!!!";
		chars = new char[15];
		
//		str.getChars(0, str.length(), chars, 0);
//		str.getChars(0, 5, chars, 0);
		str.getChars(0, 5, chars, 3);
		System.out.println("chars : " + Arrays.toString(chars));
	}
}
















