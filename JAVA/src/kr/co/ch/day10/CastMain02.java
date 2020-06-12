package kr.co.ch.day10;

import java.util.ArrayList;

public class CastMain02 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(10); //10을 int기본형으로 인식 x Intiger로 인식
		list.add("hello");
		list.add(new Icecream());
		list.add(new Hotdog());
	
		
		String str = (String)list.get(1);
		System.out.println("str : " + str + ", length : " + str.length());
		//ArrayList 코기를 수정할 수 있는 배열을 만들어주는  참조자료형들만 가능 기본자료형은 안돼
		//모든 클래스는 object 클래스를 상속 받는다
		
		
		Parent p = new Child01();
		
		//p = new Child02(); //얘때문에 컴파일러 애러는 안나지만 실행시 에러
		Child01 c = (Child01)p;
		//명시적 형변환때 에러는 실행해봐야 알수있음 
		//컴파일러는 형식과 형식으로 비교만해서
		
		/*
		// Runtime시 오류 발생
		Child01 c = (Child01)new Parent(); //명시적 형변환 실행시 에러 발생
		c.print();
		*/
	}
	
}

class Icecream {
	
}

class Hotdog {
	
}

