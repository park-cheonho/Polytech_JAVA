package kr.ac.kopo.day06;

public class Member {
	
	String 	name;		// 이름
	int 	age;		// 나이
	String 	bloodType;	// 혈액형
	
	Member() {
		this("알수없음");
	}
	
	Member(String name) {
		this(name, -1);
	}
	
	Member(String name, int age) {
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	/*
	Member() {
		
		this("알수없음", -1, "알수없음");
	}
	
	Member(String name) {
		this(name, -1, "알수없음");
	}
	
	Member(String name, int age) {
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	*/
	/*
	Member() {
		name = "알수없음";
		age = -1;
		bloodType = "알수없음";
	}
	
	Member(String name) {
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
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	*/
	void info() {
		System.out.println("이름 : " + name
						+ ", 나이 : " + (age == -1 ? "알수없음" : age)
						+ ", 혈액형 : " + bloodType);
	}
}












