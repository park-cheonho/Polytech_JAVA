package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {
		
		String str = "hello world";
	
		char c = 'l';
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c));
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c, 4));
		
		c = 'p';
		System.out.println(c + "의 검색된 위치 : " + str.indexOf(c));
		
		c = 'l';
		System.out.println("lastIndexOf() " + c + "의 검색된 위치 : " + str.lastIndexOf(c));
		
		str = "hello world";
		String searchStr = "l";
		System.out.println("< " + str + "에서 \"" + searchStr + "\" 위치 >");
		int searchIdx = str.indexOf(searchStr);
		while(searchIdx != -1) {
			System.out.println("검색된 위치 : " + searchIdx);
			searchIdx = str.indexOf(searchStr, searchIdx+1);
		}
		
		System.out.println("< " + str + "에서 \"" + searchStr + "\" 위치 >");
		searchIdx = -1;
		while((searchIdx = str.indexOf(searchStr, searchIdx+1)) != -1) {
			System.out.println("검색된 위치 : " + searchIdx);
		}
		
		str = "hello world";
		System.out.println("substring(2) : " + str.substring(2));	// str.substring(2, str.length());
		System.out.println("substring(2, 7) : " + str.substring(2, 7));
		
		String strA = "good";
		String strB = "bye!!!";
		
//		str = strA + strB;
		str = strA.concat(strB);
		System.out.println("str : " + str);
		
		str = "        hello          world          ";
		System.out.println("[" + str + "]의 길이 : " + str.length());
		str = str.trim();
		System.out.println("[" + str + "]의 길이 : " + str.length());
		
		str = "홍길동전:허균:조선시대";
		System.out.println("str : " + str);
		
		String[] strArr = str.split(":");
		System.out.println(Arrays.toString(strArr));
		
		strArr = str.split(",");
		System.out.println(Arrays.toString(strArr));
		
		String date = "2020-04-20";
		String[] dateArr = date.split("-");
		System.out.println(Arrays.toString(dateArr));
		
		int num = 12345;
		
		System.out.println(num + "" + 100);	// 12345100
		System.out.println(String.valueOf(num) + 100);
		
		int n = Integer.valueOf("12");	 
		int n2 = Integer.parseInt("12");
		
	}
	
	String concat(String a, String b) {
		char[] chars = new char[a.length() + b.length()];
		int loc = 0;
		for(int i = 0; i < a.length(); i++) {
			chars[loc++] = a.charAt(i);
		}
		for(int i = 0; i < b.length(); i++) {
			chars[loc++] = b.charAt(i);
		}
		
		return new String(chars);
	}
	
}

















