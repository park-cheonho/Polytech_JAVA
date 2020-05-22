package kr.co.ch.day08;

public class Manager2 extends Employee {

	Employee[] empList;
	
	public Manager2() {
		//super();
	}
	
	public Manager2(int no, String name, String grade, int salary, Employee[] empList) {
		super(no, name, grade, salary);
		//this.no = no; //super.no = no; 지만 원래 this로도 자기꺼처럼 사용가능하다는 것임
		//this.name = name;
		//this.grade = grade;
		//this.salary = salary;
		this.empList = empList;
	}
	
	public void info() {
		super.info();
		//System.out.println("사원번호 : " + no + "사원명 : " + name + "직급 : " + grade + "연봉 : " + salary + " 만원");
		System.out.println("==========================================================");
		System.out.println("\t\t < 관리사원 목록 > ");
		System.out.println("==========================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("==========================================================");
	}
}
