package kr.ac.kopo.day08;

public class Manager02 extends Employee {

	Employee[] empList;
	
	public Manager02() {
	}
	
	public Manager02(int no, String name, String grade, int salary, Employee[] empList) {
		super(no, name, grade, salary);
		this.empList = empList;
	}
	
	public void info() {
		super.info();
		System.out.println("======================================================");
		System.out.println("\t\t< 관리 사원 목록 >");
		System.out.println("======================================================");
		for( Employee e : empList ) {
			e.info();
		}
		System.out.println("======================================================");
	}
}
