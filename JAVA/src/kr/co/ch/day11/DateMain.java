package kr.co.ch.day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kr.ac.kopo.util.CalendarUtil;

public class DateMain {

	public static void main(String[] args) {

		// String pattern = "오늘은 yyyy년 MM월 dd일(E요일)입니다.";
		String pattern = "yyyy-MM-DD";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		System.out.println(sdf.format(new Date()));

		/*
		 * //오늘은 2020년 4월 27일이다. Date d = new Date();
		 * 
		 * System.out.println("d : " + d); //System.out.println("d : " + d.toString());
		 * 
		 * int year = d.getYear() + 1900; int month = d.getMonth() + 1; int date =
		 * d.getDate();
		 * 
		 * System.out.println("오늘은 " + year + "년" + month + " 월" + date + "일"); }
		 */
		/*
		 * @Override public String toString() { return super.toString(); }
		 */

		/*
		 * @Override public String toString() { return super.toString(); }
		 */

		// 오늘은 2020년 04월 27일 (월요일)입니다.

		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c);
		int year = c.get(1);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK); // 1일~7토
		String[] dayArr = { " ", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		// 카멜표기가 아닌이유는 상수이기 때문에 상수는 대문자_
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);

		// 2023년 10월 9일은 무슨요일?
		c.set(2023, 10 - 1, 9);

		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2023년 10월 9일은 무슨요일?" + dayArr[day]);

		Date d = c.getTime();
		System.out.println(d);

		System.out.println(c);
		d = new Date();
		c.setTime(d);
		System.out.println(c);

		// 이번달의4월 마지막 날수?
		month = c.get(Calendar.MONTH) + 1;
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(month + "월의 마지막 날은 " + lastday);
		System.out.println("마지막 월은 : " + c.getActualMaximum(Calendar.MONTH));
	}
}
