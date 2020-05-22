package kr.co.ch.day06;

public class Member {

	String name; //이름
	int age; //나이
	String bloodType; //혈액형
	// 1맴버변수 정의
	
	
	
	Member() {
		
		this("알수없음", -1, "알수없음");
		System.out.println("!!!");
		//this 생성자는 생성자 내에서만 오버로딩된 생성자를 호출하기 위해
		//this 생성자는 객체 생성순간 초기화가 목표라서 생성자의 첫라인에 와야함
	}
	
	Member(String name) {
		
		this(name, -1, "알수없음");
	}
	
	Member(String name, int age) {
		
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name; // 맴버변수(파란색)의 왼쪽 name //지역변수(갈색) 오른쪽의 name 인식 못함 지역 변수의 변수 먼저 찾음 자동으로 없으면 멤버변수 착고 거기도 없으면 에러
		this.age = age; 
		this.bloodType = bloodType;
	}
	// 2생성자 정의
	
	
	void info() {
		System.out.println("이름 : " + name + " 나이 : " + (age == -1 ? "알수없음 " : age) + " 혈액형 : " + bloodType);
	}
	// 3메소드 정의 
}

/*
 * 	Member(String name) {
		this.name = name;
		age = -1;
		bloodType = "알수없음";
	}
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
		bloodType = "알수없음";
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name; // 맴버변수(파란색)의 왼쪽 name //지역변수(갈색) 오른쪽의 name 인식 못함 지역 변수의 변수 먼저 찾음 자동으로 없으면 멤버변수 착고 거기도 없으면 에러
		this.age = age; 
		this.bloodType = bloodType;
	}
	// 2생성자 정의
	
	
	void info() {
		System.out.println("이름 : " + name + " 나이 : " + (age == -1 ? "알수없음 " : age) + " 혈액형 : " + bloodType);
	}
	// 3메소드 정의 
	 */
