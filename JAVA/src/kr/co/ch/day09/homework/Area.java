package kr.co.ch.day09.homework;

import java.util.Random;
import java.util.Scanner;

public class Area {
	
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	
//	public Area () {}
	
	public static int randomInt() {
		return random.nextInt(11) + 2;
	}
	
	public static void execute() {
		
		System.out.println("도형을 번호로 선택하세요. 1.직사각형 2.정사각형 3.삼각형 4.원");
//		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		//교수님 스텝2로 하려다가 3으로 간신히 햇는데 스텝 3이 정확하게 이해를 못했습니다.ㅠ
		Shape shape = null;
		if (answer == 1) {
			shape = new Rectangle(randomInt(), randomInt());
			//Shape rectangle = new Rectangle(randomInt(), randomInt());
			//rectangle.getArea();
		}
		if (answer == 2) {
			shape = new Square(randomInt(), randomInt());
			//Shape square = new Square(randomInt(), randomInt());
			//square.getArea();
			
		}if (answer == 3) {
			shape = new Triangle(randomInt(), randomInt());
			//Shape triangle = new Triangle(randomInt(), randomInt());
			//triangle.getArea();
		}if (answer == 4) {
			shape = new Circle(randomInt());
			//Shape circle = new Circle(randomInt());
			//circle.getArea();
		}
		//이부분이 헷갈렸습니다.
		shape.getArea();
	}

}
