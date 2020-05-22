package kr.ac.kopo.day07;

public class Employee {

	private String 			name;				// 사원명
	private int				salary;				// 연봉
	private static int		totalEmployeeCount;	// 총사원수

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		Employee.totalEmployeeCount++;
	}
	
	public Employee() {
		Employee.totalEmployeeCount++;
	}
	
	public void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원");
//		System.out.println("입사한 총 사원수 : " + Employee.totalEmployeeCount + "명");
	}
	
	public static void totalEmployeeInfo() {
		System.out.println("입사한 총 사원수 : " + Employee.totalEmployeeCount + "명");
	}
}













