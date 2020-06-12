package kr.ac.kopo.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 현재시간과 달력 관련 기능 제공하는 기능 클래스
 * @author cheonho
 *
 */
public class CalendarUtil {

	
	/**
	 * 현재 날짜를 알려주는 메소그
	 * @return 현재 날짜정보 yyyy MM dd HH mm ss E
	 */
	public String today() {
		
		String pattern = "현재시간정보 : yyyy년 MM월 dd일 HH시 mm분 ss초 E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		return sdf.format(new Date());
	}
	
	/**
	 * 년도에 해당하는 전체 월의 달력을 표시하는 기능
	 * 
	 * @param 출력할 년도
	 * 
	 */

	// 변수 네이밍에서 밑줄 두개로 시작하는 애들은 __ 시스템관련된 아이들임
	public void showByYear(int year) {

		for (int month = 1; month <= 12; month++) {
			showByMonth(year, month);
		}
	}

	/**
	 * 특정년도 특정월의 달력 표시기능
	 * 
	 * @param year  출력할 년도
	 * @param month 출력할 월
	 */
	private void showByMonth(int year, int month) {

		System.out.println("<< " + year + "년" + month + "월 >>");

		/*
		 * 1. 해당 특정 년,월의 1일의 요일 정보 알아야함 2. 특정 년, 월의 마지막 날이 28,29,30,31일인지 정보 알아야함
		 */

		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1); // 특정년도 월의 1일로 세팅 월-1이 뭔의미지?
		int week = c.get(Calendar.DAY_OF_WEEK);
		// System.out.println("week : " + week);
		// 입력받은 달의 1일이 무슨 요일인지 파악

		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		// System.out.println(lastday);

		showByDay(week, lastday);

	}

	/**
	 * 1일의 시작요일, 마지막날수를 이용하여 만년 달력을 출력
	 * 
	 * @param week    시작요일 1일 ~ 7토
	 * @param lastday 해당월의 마지막 날 28, 29, 30, 31
	 */
	private void showByDay(int week, int lastday) {
		// 내부적 굥유 상황에서는 private로 공유하고 외부로 공유하는거는 public만 공유

		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		int cnt = 0;
		for (int i = 1; i < week; i++) {
			System.out.println("\t");
			++cnt;
		}

		for (int day = 1; day <= lastday; day++) {
			System.out.println(day + "\t");
			if (++cnt % 7 == 0)
				System.out.println();
		}
		if (cnt % 7 != 0)
			System.out.println();
	}
}
