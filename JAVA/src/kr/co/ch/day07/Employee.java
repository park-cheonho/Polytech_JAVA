package kr.co.ch.day07;

public class Employee {

	private String 	name; 				//사원명
	private int 	salary; 			//연봉
	private static int 	totalEmployeeCount; 	//총사원수	
	//공유되어야하는 총사원수 클래스에서 공유되어야하는
	//static은 무조건 클래스 명 . 으로 접근해야 개발자가 static인것 알수있음
	public Employee() {
		Employee.totalEmployeeCount++;
	}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		Employee.totalEmployeeCount++;
	}
	
	public void info() {
		System.out.println("사원명 : " + name + " 연봉 : " + salary);
	}
	
	//static인 Employee.totalEmployeeCount를 메소드화 해야 Main에서 접근 가능
	public static void totalEmployeeCountInfo() {
		//static 공유하기 위해서 만듦 static변수는 일반 메소드로는 호출 x static메소드로 호출!
		//논스태틱 메소드에서는 스태틱 메소드,변수를 호출이 가능한거가 맞음
		//static메소드 안에서는 nonstatic메소드 사용 불가
		//nonstatic에서는 static 사용가능 생성 시점이 static이 제일 빠름
		System.out.println("입사한 총 사원수 : " + Employee.totalEmployeeCount + "명");
	}
}





