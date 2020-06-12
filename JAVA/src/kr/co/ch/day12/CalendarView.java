package kr.co.ch.day12;

import kr.ac.kopo.util.CalendarUtil;
import java.util.Scanner;

public class CalendarView {

	private Scanner sc;
	private CalendarUtil util;

	public CalendarView() {
		sc = new Scanner(System.in);
		util = new CalendarUtil();
	}

	public int scanInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();

		return num;
	}

	public void execute() {

		loop: while (true) {
			int no = scanInt("항목을 선택하세요(1.특정년도, 2.특정일, 3.현재시간, 0.종료) : ");

			int year = 0, month = 0;
			switch (no) {
			case 1 :
				System.out.println("1번선택");
				year = scanInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2 :
				System.out.println("2번선택");
				year = scanInt("년도를 입력하세요 : ");
				month = scanInt("월을 입력하세요 : ");

				break;
			case 3 :
				System.out.println("현재시간 : " + util.today());
				break;
			case 0 :	
				// break loop; 방법 2개 선택취사!!
				System.exit(0); // 프로그램을 종료하는 메소드 0은 정상적 종료 의미
			}

		}
	}
}
