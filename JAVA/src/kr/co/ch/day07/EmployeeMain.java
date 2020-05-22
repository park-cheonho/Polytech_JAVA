package kr.co.ch.day07;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		//int totalEmployeeCnt = 0; // 지역변수
		
		Employee e = new Employee("홍길동" , 3500);
		e.info();
		Employee e2 = new Employee("강길동" , 4200);
		e2.info();
		
		
		//static은 객체를 생성하지 않아도 접근 하도록
		Employee.totalEmployeeCountInfo();
		
		//System.out.println("총입사자 :  " + Employee.totalEmployeeCount + " 명");
		//totalEmployeeCnt는 맴버변수 e. 이런게 아니라 클래스 명으로 접근 이탤릭체
	}

}
