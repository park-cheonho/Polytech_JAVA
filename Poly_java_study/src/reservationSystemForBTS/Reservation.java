package reservationSystemForBTS;

public class Reservation {
	
	// 2차원 배열 생성
	String seatArr [][] = new String[3][10];
	
	//seatArr[0] = new String[] {"s1","s2","s3","s4","s5","s6","s7","s8","s9","s10"};
	//seatArr[1] = new String[] {"a1","a2","a3","a4","a5","a6","a7","a8","a9","a10"};
	//seatArr[2] = new String[] {"b1","b2","b3","b4","b5","b6","b7","b8","b9","b10"};
	
	Reservation() {
		for (int i = 0; i < 3; i++) 
			for (int j = 0; j < 10; j++)
				this.seatArr[i][j] = "[" + j + "]";
	}
	// 예약
	public void reserve() {
		
	}
	// 조회
	public void search() {
		for (int i = 0; i < 3; i++) {
			if(i == 0) {
				System.out.println("S석 : ");
			} else if (i == 1) {
				System.out.println("A석 : ");
			} else if (i == 2) {
				System.out.println("B석 : ");
			}
			for (int j = 0; j < 10; j++) {
				System.out.print(seatArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	// 취소
	public void cancel() {
		
	}
}


