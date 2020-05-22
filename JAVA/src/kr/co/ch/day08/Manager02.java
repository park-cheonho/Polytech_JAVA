package kr.co.ch.day08;

public class Manager02 extends Employee {

	Employee[] empList;
	
	public Manager02() {
		//super();
	}
	
	public Manager02(int no, String name, String grade, int salary, Employee[] empList) {
		super(no, name, grade, salary); //Employee에 있는 것 상속받아서 super로 받아옴
		//위에가 아래보다 빈도 높음
		//this.no = no; //super.no = no; 지만 원래 this로도 자기꺼처럼 사용가능하다는 것임
		//this.name = name;
		//this.grade = grade;
		//this.salary = salary;
		this.empList = empList;
	}
	
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
