package kr.co.ch.day03;

public class LoopMain04 {

	public static void main(String[] args) {
		
		/*
	 	12345
	 	12345
	 	12345
	 	12345
	 	12345
	 */
	
//	for(int i = 1; i <=5; i++) {
//		for(int j = 1; j <= 5; j++) {
//			System.out.printf("%d", j);
//		}
//i가 1일때 j가 12345 i가 2일때 j가 12345			
//		System.out.printf("%d", 1);
//		System.out.printf("%d", 2);
//		System.out.printf("%d", 3);
//		System.out.printf("%d", 4);
//		System.out.printf("%d", 5);
//		System.out.print('\n');
//	}
	

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
	*/
	}	
}		