package JumpToJava1;

public class Animal {
/*
 * Animal 클래스는 가장 간단한 형태의 클래스이다. 
 * 클래스의 선언만 있고 내용이 없는 껍데기뿐인 클래스이다. 
 * 하지만 이 껍데기뿐인 클래스도 아주 중요한 기능을 가지고 있다. 
 * 그 기능은 바로 객체(object)를 만드는 기능이다.
 * ※ 객체와 인스턴스

클래스에 의해서 만들어진 객체를 인스턴스라고도 한다. 
그렇다면 객체와 인스턴스의 차이는 무엇일까? 이렇게 생각 해 보자. 
Animal cat = new Animal() 이렇게 만들어진 cat은 객체이다. 
그리고 cat이라는 객체는 Animal의 인스턴스(instance)이다. 
즉 인스턴스라는 말은 특정 객체(cat)가 어떤 클래스(Animal)의 
객체인지를 관계위주로 설명할 때 사용된다. 즉, "cat은 인스턴스" 
보다는 "cat은 객체"라는 표현이 "cat은 Animal의 객체" 보다는 
"cat은 Animal의 인스턴스" 라는 표현이 훨씬 잘 어울린다.
 * 
 * 
 * 
 */
	String name;
//객체 변수 (Instance variable)
//클래스에 선언된 변수를 객체 변수 라고 부른다. 
//또는 인스턴스 변수, 멤버 변수, 속성이라고도 말한다.
	
//클래스에는 객체 변수와 더불어 메소드(Method)라는 것이 있다. 
//메소드는 클래스 내에 구현된 함수를 의미하는데 보통 함수라고 말하지 
//않고 메소드라고 말한다.
	
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal horse = new Animal();
		//객체.객체변수 = 값
		cat.setName("키티");
		dog.setName("happy");
		System.out.println(cat.name);
		System.out.println(dog.name);
		
	}
}
