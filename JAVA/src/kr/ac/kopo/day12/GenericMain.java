package kr.ac.kopo.day12;

import java.util.Random;

class CCC<T1, T2> {
	private T1 data;
	private T2 data2;
	
	public CCC(T1 data, T2 data2) {
		this.data = data;
		this.data2 = data2;
	}

	public T1 getData() {
		return data;
	}

	public void setData(T1 data) {
		this.data = data;
	}

	public T2 getData2() {
		return data2;
	}

	public void setData2(T2 data2) {
		this.data2 = data2;
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
	
	public Icecream() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Icecream(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("name : " + name + ", price : " + price);
	}
	
	
}

public class GenericMain {

	public static void main(String[] args) {

		CCC<String, String> c = new CCC<String, String>(new String("abc"), "123454");
		CCC<Icecream, String> c2 = new CCC<Icecream, String>(
											new Icecream("월드콘", 2000), 
											new String("hello world"));
		
		
		BBB<Object> obj = new BBB<Object>(); 
		BBB<String> obj2 = new BBB<String>();
		BBB<Random> obj3 = new BBB<Random>();
		BBB<Icecream> obj4 = new BBB<Icecream>();
		
		obj2.setData(new String("Hello"));
		
		System.out.println("obj2 길이 : " + obj2.getData().length());
		
		/*
		AAA obj = new AAA(new Object());
		AAA obj2 = new AAA(new String("Hello"));
		AAA obj3 = new AAA(new Random());
		AAA obj4 = new AAA(new Icecream("비비빅", 1000));
		
		System.out.println("obj : " + obj.getData().toString());
		String strObj = (String)obj2.getData();
		System.out.println("obj2 : " + strObj + ",  length : "  + strObj.length());
		
		Random r = (Random)obj3.getData();
		System.out.println("추출된 난수 : " + r.nextInt());
		
		Icecream ice = (Icecream)obj4.getData();
		ice.info();
		
		Icecream ice2 = (Icecream)obj2.getData();
		ice2.info();
		*/

	}
	
}















