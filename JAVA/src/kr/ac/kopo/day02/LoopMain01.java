package kr.ac.kopo.day02;

/*
	< 반복문 수행 4가지 요소 >
	1. 반복문
	2. 시작값
	3. 시작값변경코드
	4. 종료조건
	
	init;
	while(expr) {
		statement;
		incre/decre;
	}
	
	for( init; expr; incre/decre ) {
		statment;
	} 
	
	한바퀴 뛸차례다
	while(!운동장 다섯바퀴 다 뛰었냐?) {
		운동장 한바퀴 뛴다
		바퀴수 증가
	}
 */
public class LoopMain01 {

	public static void main(String[] args) {
		
		// 12345 출력
//		int 변수 = 1;
//		while(변수 <= 5) {
//			System.out.print(변수);
//			변수 = 변수 + 1;
//		}
		
		for(int 변수 = 1; 변수 <= 5; 변수 = 변수+1) {
			System.out.print(변수);
		}

//		System.out.print(1);
//		System.out.print(2);
//		System.out.print(3);
//		System.out.print(4);
//		System.out.print(5);
		
		/*
		for(int cnt = 1;   cnt <= 3;   cnt++) {
			
			System.out.println("Hello");
		}
		*/
		
		
//		int cnt = 1;
//		while(cnt <= 3) {
//			System.out.println("Hello");
//			cnt++;
//		}
		
	}
}







