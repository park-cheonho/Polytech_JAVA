package kr.co.ch.day08.extend;

public class Employee {

	private int no; //사원번호
	private String name; //사원이름
	private String grade; //직급
	private int salary; //연봉
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}// 소스 -> 제너레이트 -> 컨스트럭터프롬 슈퍼클래스
	
	public Employee(int no, String name, String grade, int salary) {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}
	// 소스 -> 제너레이트 -> 컨스트럭터 유징 필드

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("사원번호 : " + no + "사원명 : " + name + "직급 : " + grade + "연봉 : " + salary);
	}
	
	
}
