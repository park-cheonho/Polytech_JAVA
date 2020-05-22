package kr.co.ch.day06;

/*
 * 생성자 특징
 * 1. 클래스 명과 동일
 * 2. 반환형이 존재하지 않는다.
 * 3. 생성자 오버로딩을 지원한다.
 * 4. 객체의 속성을 초기화 하기 위해서
 * 5. 디폴트 생성자를 지원한다 : 클래스내에 생성자가 정의 되어 있지 않은 경우 JVM이 자동으로 생성자를 선언 (매게변수x, 내용부x)
 * 						 클래스명 () {}
 * 
 */
class Dog{

	Dog() {
		System.out.println("Dog() 디폴트생성자(기본생성자) 호출...");	
	} // 생성자는 앞에 아무것도 안붙힘
	
	Dog(String name) {
		System.out.println("Dog(String) 생성자 호출...");
	} // 매개변수 가진 생성자 만들려면 습관적으로 기본 생성자 만드는 습관 가지기
	
	Dog(String name, int age) {
		System.out.println("Dog(String, int) 생성자 호출...");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {

		new Dog(); // jvm이 자동으로 디폴트 생성자 만듦

		new Dog("아지");
		
		new Dog("강아지", 5);
	}
	
}
