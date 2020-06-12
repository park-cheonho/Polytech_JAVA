package kr.co.ch.day09.homework;

public class Rectangle extends Shape{

	private int width;
	private int heigth;
	
	public Rectangle() {}
	
	public Rectangle(int width, int heigth) {
		this.heigth = heigth;
		this.width = width;
	}

	//@Override
	//교수님 여기서 괄호 부분에 The method getArea() of type Circle must override or implement a supertype method 에러가 났었는데 오탈자 문제는 아니였고 원인이 뭘까요 ㅠ
	//@Override지우면 해결이 되는데 분명히 getArea abstract로 했는데...
	//하다가 보니 오류는 사라졌습니다..
	@Override
	void getArea() {
		System.out.println("가로 : " + width + " 세로 : " + heigth + " 인 직사각형의 넓이는 : " + width*heigth + " 입니다." );
	}
}
