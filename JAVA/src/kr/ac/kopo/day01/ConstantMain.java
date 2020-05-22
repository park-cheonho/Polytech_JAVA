package kr.ac.kopo.day01;

public class ConstantMain {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		int radius = 10;
		double area = radius * radius * PI;
		
		System.out.println("반지름 : " + radius + " ==> 원 넓이 : " + area);
		
		
		radius = 10;
		area = radius * radius * PI;
		area = radius * radius * Math.PI;
	
		System.out.println("반지름 : " + radius + " ==> 원 넓이 : " + area);
		
	}
}
