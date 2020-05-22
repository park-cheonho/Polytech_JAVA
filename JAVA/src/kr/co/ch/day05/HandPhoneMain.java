package kr.co.ch.day05;

public class HandPhoneMain {

	public static void main(String[] args) {
		
		HandPhone hp = new HandPhone();
		
		hp.name = "박천호";
		hp.phone = "010-4141-7226";
		hp.company = "삼성";
		
		HandPhone hp2 = new HandPhone();
		
		hp2.name = "고길동";
		hp2.phone = "010-7226-4141";
		hp2.company = "엘지";
		
		HandPhone hp3 = new HandPhone();
		
		hp3.name = "둘리";
		hp3.phone = "010-2222-2222";
		hp3.company = "애플";
		
		//System.out.println("소유주 : " + hp.name + ", 전화번호 : " + hp.phone + ", 제조사 : " + hp.company);
		//System.out.println("소유주 : " + hp2.name + ", 전화번호 : " + hp2.phone + ", 제조사 : " + hp2.company);
		//System.out.println("소유주 : " + hp3.name + ", 전화번호 : " + hp3.phone + ", 제조사 : " + hp3.company);

		//데이터형[] 배열명 = {hp1, hp2, hp3}
		HandPhone[] hpArr = {hp, hp2, hp3};
		
		for(int i = 0; i < hpArr.length; i++) {
			System.out.println("소유주 : " + hpArr[i].name + ", 전화번호 :" +hpArr[i].phone + ", 제조사 : " + hpArr[i].company);
			
			
		}
	}
}
