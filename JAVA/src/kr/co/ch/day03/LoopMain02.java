package kr.co.ch.day03;


public class LoopMain02 {

	public static void main(String[] args) {
		
		/*
		   *****
		    ****
		     ***
		      **
		       *
		 */
		
	// 방법 1	
		/*
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print('-');
			}
			for(int j = 1; j <= 6 -i; j++) {
				System.out.print('*');
			}	
				System.out.print('\n');	
		}	
		*/

		
		/*
		 	12345
		 	12345
		 	12345
		 	12345
		 	12345
		 */
		
//		for(int i = 1; i <=5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				System.out.printf("%d", j);
//			}
//	i가 1일때 j가 12345 i가 2일때 j가 12345			
//			System.out.printf("%d", 1);
//			System.out.printf("%d", 2);
//			System.out.printf("%d", 3);
//			System.out.printf("%d", 4);
//			System.out.printf("%d", 5);
//			System.out.print('\n');
//		}
		

		/*
		 	*
		 	**
		 	***
		 	****
		 	*****
		 */
		/* 일반적으로 바깥에 있는 애들은 행(줄수)이다!!!!!! 안에 있는게 열이다!!!!!!!!!!!1
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');				
			}
			System.out.print('\n');
		}
		//가장 중요한 부분 규칙성 찾기 안되면 손으로 그려서 규칙 찾기
		//i /*
		//1 /*
		//2 /** 규칙
		
		/*
		 *****
		 *****
		 *****
		 */
		
		
		/*
		// int cnt = 1;로 쓰는거 가능
			// cnt 선언을 for문 안에서 했으면 cnt는 {}안에서만 의미가 있다 그래서 {} 밖에서 cnt선언하려면
			// 다시 for문 쓰고 cnt 선언
			// 아니면 for문 밖에 선언 하기?
		
		for (int cnt2 = 1; cnt2 <= 3; cnt2++) {

			for (int cnt = 0; cnt <= 4; cnt++) {

				System.out.print("문장2");
			}
			
			System.out.print('\n');
		//별다섯개 찍고 엔터찍는거 먼저 수행한다
		// 그 후 cnt2로가서 별 다섯개 찍고 엔터 수행
		//	왼쪽부터 횡우선방식으로 찍는다.
		}
		/*
		 * cnt 보다 i로 많이 씀 단순 반복문 횟수 정하는거는 i j k l 횟수 반복은 초기 숫자를 1이나 5나 10이나 이렇게 보통 많이함
		 * for(int cnt = 1 ; cnt <= 5; cnt++) for(int cnt = 0 ; cnt < 5; cnt++) for(int
		 * cnt = 1 ; cnt >= -3; cnt--) for(int cnt = 7 ; cnt <= 11; cnt++) {
		 * 
		 * System.out.println("cnt : " + cnt);
		 * 
		 * }
		 */
	}
	

}
