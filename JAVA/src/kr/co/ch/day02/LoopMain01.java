package kr.co.ch.day02;

/*	반복하려는 문장이 필요
 * 	시작값이 필요 몇바퀴 뛰었는지 카운트 1->5 4->0
 *  운동장 한바퀴 뛴다
 *  운동장 한바퀴 뛴다
 *  <반복문 수행 4가지 요소>
 *  1. 반복문 
 *  2. 시작값 
 *  3. 시작값변경코드
 *  4. 종료조건 
 *  반드시 4가지 다 있어야 하는 것은 아님 필수 요소 아님 때에따라 다름 시작값이 여러개일수도 있고 없을수도 있고 
 *  
 *  한바퀴 뛸차례이다 (시작값 init)
 *  if->while(/조건exper/!(not)조건 운동장 다섯바퀴 다 뛰었니?-참) {참이면 {}안에 문장 수행 거짓이면 빠져나옴 -> !(not) 거짓이면 수행 참이면 나옴
 *  	운동장 한바퀴 뛴다statement
 *  	바퀴수 증가 incre/decre
 *  }
 *  
 *  for( init;    expr;  incre/decre ) {
 *  	statement;
 *  }
 */
public class LoopMain01 {
	
	public static void main(String[] args) {
		
		//12345출력
		int 변수 = 1;
		while(변수 <= 5) {
			System.out.print(변수);
			변수 = 변수 + 1;
		}
		
		for(int 변수2 = 1; 변수2 <=5; 변수2 = 변수2+1) {
			System.out.print(변수2);
		}
		
		
		/*
		//1 cnt 값1 -> //6 cnt값2 //11 cnt 값3
		int cnt = 1;
		   //2 //7
		while(cnt <= 5) {
			//3 hello 출력 //8 hello 출력
			System.out.println("Hello");
			//4 // 9
			cnt++;
		} //5 위로 올라감 cnt 값 1->2 // 10 위로올라감 cnt 값2->3
		*/
		
		/*
									//4 cnt: 1->2
		for(int cnt = 1; cnt <= 3; cnt++) {
		    //1 cnt=1    //2 1<=3 참이되면 {}안으로 들어감  
			System.out.println("Hello");
			//3
		}
		*/
		
	}
	
	/*
	 * 
	 */

}
