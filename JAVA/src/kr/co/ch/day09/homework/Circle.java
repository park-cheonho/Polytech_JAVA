package kr.co.ch.day09.homework;

public class Circle extends Shape {
	
	private int radius;
	static double PI = Math.PI;
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//@Override
	//교수님 여기서 괄호 부분에 The method getArea() of type Circle must override or implement a supertype method 에러가 났었는데 오탈자 문제는 아니였고 원인이 뭘까요 ㅠ
	//@Override지우면 해결이 되는데 분명히 getArea abstract로 했는데...
	//하다가 보니 오류는 사라졌습니다..
	@Override
	void getArea() {
		System.out.println("반지름 : " + radius + " 인 원의 면적은 : " + radius*radius*PI + " 입니다.");
	}
}

