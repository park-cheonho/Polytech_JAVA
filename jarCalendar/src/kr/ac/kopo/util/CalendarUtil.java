package kr.ac.kopo.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 현재시간과 달력관련 서비스를 제공하는 기능클래스
 * @author HP
 *
 */
public class CalendarUtil {

	/**
	 * 현재날짜를 알려주는 메소드
	 * @return 현재날짜정보 yyyy년 MM월 dd일 HH시 mm분 ss초 E요일
	 */
	public String today() {
		
		String pattern = "yyyy년 MM월 dd일 HH시 mm분 ss초 E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		return sdf.format(new Date());
	}
	
	/**
	 * 년도에 해당하는 전체 월의 달력을 표시하는 기능
	 * @param year 출력할 년도
	 */
	public void showByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showByMonth(year, month);
		}
	}
	
	/**
	 * 특정년도, 특정월의 달력을 표시하는 기능
	 * @param year 출력할 년도
	 * @param month 출력할 월
	 */
	 public void showByMonth(int year, int month) {
		 
		 System.out.println("<< " + year + "년 " + month + "월 >>");
		 
		 /*
		  	1. 특정 년, 월의 1일의 요일정보 알아내기
		  	2. 특정년, 월의 마지막날(28, 29, 30, 31일) 정보 알아내기
		  */
		 
		 Calendar c = Calendar.getInstance();
		 
		 c.set(year, month-1, 1);
		 int week = c.get(Calendar.DAY_OF_WEEK);
		 int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		 
		 showByDay(week, lastday);
		 
	 }
	 
	 /**
	  * 1일의 시작요일, 마지막날수를 이용하여 만년달력을 출력
	  * @param week  	시작요일(1(일) ~ 7(토))
	  * @param lastday	해당월의 마지막날(28, 29, 30, 31)
	  */
	 private void showByDay(int week, int lastday) {
		
		 System.out.println("일\t월\t화\t수\t목\t금\t토");
		 int cnt = 0;
		 for(int i = 1; i < week; i++) {
			 System.out.print("\t");
			 ++cnt;
		 }

		 for(int day = 1; day <= lastday; day++) {
			 System.out.print(day + "\t");
			 if(++cnt % 7 == 0)
				 System.out.println();
		 }
		 if(cnt %  7 != 0)
			 System.out.println();
	 }
}
















