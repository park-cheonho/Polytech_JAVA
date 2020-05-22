package kr.co.ch.day06.homework;

import java.util.Arrays;

/*
 * StringUtil클래스 작성
 * 1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c ) 메소드를 작성하시오
 * 2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true 를 반환하는 isLowerChar(char c) 메소드를 작성하시오
 * 3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
 * 4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오
 * 5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
 * 6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
 * 7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
 * 
 */ 

public class StringUtil {
	
	//하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c ) 메소드를 작성하시오
	boolean isUpperChar(char c) {
		return ((65 <= c && c <= 90) ? true : false); 
		//알파벳 대문자는 아스키 코드표 65='A' ~ 90='Z 입니다.  따라서 c가 저 사이에 있으면 true를 반환하늗 메소드 작성
	}
	
	//하나의 문자를 입력받아 해당 문자가 소문자이면 true 를 반환하는 isLowerChar(char c) 메소드를 작성하시오
	boolean isLowerChar(char c ) {
		return ((97 <= c && c <= 122) ? true : false);
		//알파벳 소문자는 아스키 코드표 90='a' ~ 122='z" 입니다.  따라서 c가 저 사이에 있으면 true를 반환하늗 메소드 작성
	}
	
	//두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
	int max(int i, int j) {
		if(i > j) {
			return i;
		} else {
			return j;
		}
	} 
	// int i,j중에  큰수 비교 i가 크면 i return else라면 j return
	
	
	//두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오
	int min(int i, int j) {
		if (i > j) {
			return j;
		}else {
			return i;
		}
	}
	// int i,j중에  작은수 비교 i가 크면 j return else라면 i return
	
	
	//문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
	String reverseString(String str) {
	
		String str_reverse = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			str_reverse += str.charAt(i);
		}
		return str_reverse;
	}
	
	//문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
	String toUpperString(String str) {
	
		String str_large = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				str_large += (char)(str.charAt(i) - 32);
			} else {
				str_large += str.charAt(i);
			}
		}
		return str_large;
	}
	
	//문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
	String toLowerString(String str) {
		
		String str_low = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				str_low += (char)(str.charAt(i)+32);
			} else {
				str_low += str.charAt(i);
			}
		}
		return str_low;
	}
	
}
