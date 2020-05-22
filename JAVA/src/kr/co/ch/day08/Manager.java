package kr.co.ch.day08;

public class Manager {

	int no; //사원번호
	String name; //사원이름
	String grade; //직급
	int salary; //연봉
	Employee[] empList; //관리사원 목록
	
	
	public Manager(int no, String name, String grade, int salary, Employee[] empList) {
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
		this.empList = empList;
	}
	
	public void info() {
		System.out.println("사원번호 : " + no + "사원명 : " + name + "직급 : " + grade + "연봉 : " + salary + " 만원");
		System.out.println("==========================================================");
		System.out.println("\t\t < 관리사원 목록 > ");
		System.out.println("==========================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("==========================================================");
	}
}

