package kr.ac.kopo.day05;

public class HandphoneMain {

	public static void main(String[] args) {
		
		HandPhone hp = new HandPhone();
		hp.name = "홍길동";
		hp.phone = "010-1111-2222";
		hp.company = "삼성";
		
		HandPhone hp2 = new HandPhone();
		hp2.name = "고길동";
		hp2.phone = "010-3333-4444";
		hp2.company = "애플";
		
		HandPhone hp3 = new HandPhone();
		hp3.name = "강길동";
		hp3.phone = "010-5555-6666";
		hp3.company = "LG";
		
//		System.out.println("소유주 : " + hp.name + ", 전화번호 : " + hp.phone + ", 제조사 : " + hp.company);
//		System.out.println("소유주 : " + hp2.name + ", 전화번호 : " + hp2.phone + ", 제조사 : " + hp2.company);
//		System.out.println("소유주 : " + hp3.name + ", 전화번호 : " + hp3.phone + ", 제조사 : " + hp3.company);
		
		HandPhone[] hpArr = {hp, hp2, hp3};
		
		for(int i = 0; i < hpArr.length; i++) {
			System.out.println("소유주 : " + hpArr[i].name + ", 전화번호 : " + hpArr[i].phone
									+ ", 제조사 : " + hpArr[i].company);
		}
	}
	
}









