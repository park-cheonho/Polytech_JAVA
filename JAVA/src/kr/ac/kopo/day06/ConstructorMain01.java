package kr.ac.kopo.day06;

/*
 * 생성자 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 존재하지 않음
 * 3. 생성자 오버로딩 지원
 * 4. 객체의 속성 초기화
 * 5. 디폴트 생성자 지원 : 클래스내에 생성자가 하나도 정의되어 있지 않은 경우 JVM이 자동으로 생성자 선언(매개변수 X, 내용부 X)
 *                    클래스명() {}
 */

class Dog {
	
	Dog() {
		System.out.println("Dog() 디폴트생성자(기본생성자) 호출...");
	}
	
	Dog(String name) {
		System.out.println("Dog(String) 생성자 호출...");
	}
	
	Dog(String name, int age) {
		System.out.println("Dog(String, int) 생성자 호출...");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
	
		new Dog();
		
		new Dog("아지");
		
		new Dog("강아지", 5);
	}
}















