package kr.co.ch.day12;

import java.util.Random;

class CCC<T1, T2> {
	private T1 data;
	private T2 data2;
	
	public CCC(T1 data, T2 data2) {
		this.data = data;
		this.data2= data2;
	}
}


class BBB<T> {
	private T data;
	
	public BBB() {
		
	}
	
	public BBB(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

class AAA {
	private Object data;
	
	public AAA(Object data) {
		this.data = data;
	}
	public Object getData() {
		return this.data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}

class Icecream {
	private String name;
	private int price;
	
	public Icecream(String name, int price) {
		
	}
}



public class GenericMain {

	public static void main(String[] args) {
		
		CCC<String, String> c = new CCC<String, String>(new String("abc"), "12345");
		CCC<Icecream, String> c2 =new CCC<Icecream, String>(
				new Icecream("월드콘", 2000),
				new String("Hello World"));
		
		
		BBB<Object> obj = new BBB<Object>();
		BBB<String> obj2 = new BBB<String>();
		BBB<Random> obj3 = new BBB<Random>();
		BBB<Icecream> obj4 = new BBB<Icecream>();
		
		obj2.setData(new String("Hello"));
		System.out.println("obj2 길이 : " + obj2.getData().length());
		//obj4.setData(new String("Hello"));
		
		/*
		AAA obj = new AAA(new Object());
		AAA obj2 = new AAA(new String("Hello"));
		AAA obj3 = new AAA(new Random());
		AAA obj4 = new AAA(new Icecream("비비빅", 1000));
		
		System.out.println("obj : " + obj.getData().toString());
		
		// .length 쓰려면 명시적 형변환 필요 
		String strObj = (String)obj2.getData();
		System.out.println("obj2 : " + strObj.length());
		//
		Random r = (Random)obj3.getData();
		System.out.println("추출된 난수 : " + r.nextInt());
		
		Icecream ice = (Icecream)obj4.getData();
		ice.info();
		
		Icecream ice2 = (Icecream)obj2.getData();
		ice2.info();
		*/
		
	}
}
