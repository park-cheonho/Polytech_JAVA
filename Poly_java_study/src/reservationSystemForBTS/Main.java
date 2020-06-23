package reservationSystemForBTS;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Reservation reservation = new Reservation();
		
		while(true) {
			System.out.println("2020 BTS 콘서트 좌석 예매 시스템 입니다.");
			System.out.println("원하는 메뉴의 숫자를 입력하세요");
			System.out.println("1.예약 / 2.조회 / 3.취소 / 4.종료");
			
			int inputNum = sc.nextInt();
			
			switch (inputNum) {
			case 1:
				reservation.reserve();
				break;
			case 2:
				reservation.search();
				break;
			case 3:
				reservation.cancel();
				break;
			case 4:
				System.out.println("시스템을 종료합니다");
				System.exit(0);
				break;
			}
		}
	}
}
