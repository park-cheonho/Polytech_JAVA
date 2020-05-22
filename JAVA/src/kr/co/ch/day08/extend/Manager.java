package kr.co.ch.day08.extend;

import kr.co.ch.day08.Employee;

public class Manager extends Employee {
	
	private Employee[] empList;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int no, String name, String grade, int salary, Employee[] empList) {
		super(no, name, grade, salary);
		this.empList = empList;
	}

	public Employee[] getEmpList() {
		return empList;
	}

	public void setEmpList(Employee[] empList) {
		this.empList = empList;
	}
	@Override
	public void info() {
		//this.info(); 는 Manager02의 info와 Employee의 info메소드가 중복이라 확실하게 지정
		super.info();
		System.out.println("==========================================================");
		System.out.println("\t\t < 관리사원 목록 > ");
		System.out.println("==========================================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("==========================================================");
	}

}
