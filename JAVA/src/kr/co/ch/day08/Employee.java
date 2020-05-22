package kr.co.ch.day08;

public class Employee {
	
	private int no; //사원번호
	private String name; //사원이름
	private String grade; //직급
	private int salary; //연봉
	
	public Employee() {
		System.out.println("Employee생성자 호출");
	}
	
	public Employee(int no, String name, String grade, int salary) {
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("사원번호 : " + no + "사원명 : " + name + "직급 : " + grade + "연봉 : " + salary);
	}

	/*
	public int getNo() {
		return no;
	}
	public int getNo() {
		return no;
	}
	public int getNo() {
		return no;
	}
	public int getNo() {
		return no;
	}
	*/
}
