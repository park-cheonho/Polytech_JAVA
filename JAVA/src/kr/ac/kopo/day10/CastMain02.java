package kr.ac.kopo.day10;

import java.util.ArrayList;

public class CastMain02 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("hello");
		list.add(new Icecream());
		list.add(new Hotdog());
		
		String str = (String)list.get(1);
		System.out.println("str : " + str + ", length : " + str.length());
		
//		Parent p = new Child01();
//		
//		p = new Child02();
//		Child01 c = (Child01)p;
		
		/*
		// Runtime시 오류발생
		Child01 c = (Child01)new Parent();		// 명시적형변환
		c.print();
		*/
	}
}

class Icecream {
	
}

class Hotdog {
	
}
