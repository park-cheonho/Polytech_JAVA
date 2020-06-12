package kr.co.ch.day12;

public class CalendarMain {

	public static void main(String[] args) {

		// 클래스 3개로 분리 메인(샐행), 입력만 받는(view,ui-입출력 관련)클래스-컨트롤, util클래스 (기능모아둔 클래스)
		// 메인은 짧으면 짧을 수록 좋은 스테틱에 공간 많이 차지 하면 안좋음

		CalendarView view = new CalendarView();
		view.execute();
	}
}
