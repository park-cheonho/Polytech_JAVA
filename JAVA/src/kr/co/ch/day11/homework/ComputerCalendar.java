package kr.co.ch.day11.homework;

import java.util.Scanner;
import java.util.Calendar; // 파일명과 달라야함 주의

public class ComputerCalendar {

	Scanner sc;
	Calendar cal;
	
	//선택하는 메소드
	public void Choice() {
		while(true) {
			int choice;
			int year;
			int month;
			sc = new Scanner(System.in);
			
			System.out.println("선택하세요(1. 특정년도 2.특정월 3. 종료) => ");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("년도를 입력하세요 : ");
				year = sc.nextInt();
				printYear(year);
			} else if(choice == 2) {
				System.out.println("년도를 입력하세요 : ");
				year = sc.nextInt();
				System.out.println("월을 입력하세요 : ");
				month = sc.nextInt();
				
				printMonth(year, month);
			} else {
				System.out.println("종료합니다^^");
				break;
			}
		}
	}

	//월 출력 메소드
	public void printMonth(int year, int month) {
		String[] str = {"일","월","화","수","목","금","토"};
		cal = Calendar.getInstance();
		cal.set(year, month-1,1);
		System.out.println("\t\t<< "+year+"년 "+month+"월 >>");
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		// 이부분이 달력 출렵하는 부분중에 첫재요일부터 나오도록하는것과 토요일에 줄바꿈인데 잘 생각이 안나서 동기분들 자료를 참고했습니다.ㅠㅠ 죄송합니다.
		for(int i = 0; i < cal.get(Calendar.DAY_OF_WEEK)-1;i++){
			System.out.print("\t");
		}
		for(int i = cal.getActualMinimum(Calendar.DAY_OF_MONTH); i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			System.out.printf("%2d\t",i);
			if(i!=cal.getActualMaximum(Calendar.DAY_OF_MONTH) &&
					(i + cal.get(Calendar.DAY_OF_WEEK) -1 ) % 7 ==0) { // 토요일 일때 줄바꿈
				System.out.println();
			}
		}
		System.out.println();
	}
	
	//년 출력 메소드
	public void printYear(int year) {
		for(int i = 1; i <= 12; i++) {
			printMonth(year,i);
		}
	}
	
}
