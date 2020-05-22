package kr.ac.kopo.day07;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e = new Employee("홍길동", 3500);
		e.info();
		
		Employee e2 = new Employee("강길동", 4200);
		e2.info();
		
		Employee.totalEmployeeInfo();
	}
}






