package kr.co.kopo.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Wrapper class 기본자료형 8가지 -> 참조자료형 
 * java.lang
 * 
 * boolean  -> Boolean
 * byte  ->  Byte
 * char  ->  Character
 * short   -> Short
 * int  -> Integer
 * long  -> Long
 * float   -> Float
 * double   -> Double
 */

/*
 * 	보통의 형태 입니다.
 *  class Integer {
 *  	private int value;
 *  }
 */

public class WrapperMain {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(100)); 
		list.add(new Integer(200));
		// 이렇게 안넣음
		list.add(101);
		// 이렇게 넣음
		// auto boxing
		Integer i3 = 123;
		//1.5 버전부터 가능 이렇게 넣기 가능
		// auto boxing 한다 원래는 불가능 했던 기능 1.5 버전부터
		int i5 = new Integer(200);
		//이건 불가능 했다. auto-uboxing이 가능해짐
		
		
		System.out.println(Arrays.toString(list.toArray()));
		
		int i = 10;
		//Integer i2; // 초기화 해줘야함
		Integer i2 = new Integer("100");
		//래퍼클래스는 생성자로 움직인다

		System.out.println("i2 : " + i2);
	}
}
