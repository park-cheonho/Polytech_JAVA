package kr.co.ch.day05;

/*
  **********
  Hello
  **********
  Hi
  **********
  Goodbye
  **********
 */

public class MethodMain01 {

	/*
	반환형 메소드() {
		문장;
		문장;
		문장;
	}	
	*/
	// 피호출자 메소드
	/*
	static void printStar( ) { //printStar 함수를 정의
		for(int i = 10; i < 10; i++) {
			System.out.print("*");
			
		}
		System.out.println();
		
	}
	*/
	
	/*
	static void printStar(int cnt) { //printStar 함수를 정의
		for(int i = 0; i < cnt; i++) {
			System.out.print("*");
			
		}
		System.out.println();
		
	}
	*/
	
	static void printStar(char c, int cnt) { //printStar 함수를 정의
		for(int i = 0; i < cnt; i++) {
			System.out.print(c);
			
		}
		System.out.println();
		
	}
		
	// 호출자 메소드가 피호출자에게 피호출자가 호출자에게 변수를 전달하고 싶은 경우
	// 피호출자가 가진 값을 호출자인 메인에게 전달 하고 싶을때 -> void 메소드명 (매개변수) { }
	// 매개변수 : main -> printStar 호출자 메소드가 피호출자 메소드에게 값을 전달하는 부분
	// 반환형 : printStar -> main 피호출자가 호출자에게 값을 전달 -> void 부분
	// void는 전달할 값이 없음
	//static은 17,18일에
	static int factorial(int n) {
		int result = 1;
		for(int i = n; i >= 1; i--) {
			result = result * i;
		}
		// 피호출자메소드가 호툴자에게 전달할 값
		return result;
	}
	public static void main(String[] args) {
	//호출자 메소드
		//배열 로문장들을 모아 놓은 집합 -> 수정 용이하도록 -> 메소드로 만듦 클래스 안에 정의
		
		//반복문은 반복되는 문장이 연달아서 사용될때 의미
		
		//수정에 용이하지 않아 시간이 오래 걸리고 
		//System.out.println("**********");
		/*
		int i = 100;
		printStar(10); // printStar 함수를 호출
		System.out.println("Hello");
		//System.out.println("**********");
		printStar(5);
		System.out.println("Hi");
		//System.out.println("**********");
		printStar(20);
		System.out.println("Goodbye");
		//System.out.println("**********");
		printStar(12);
		*/
		
		//대입연산자로 받기
		int result = factorial(3);
		System.out.println("3! ==> " + result);
		
		int i = 100;
		printStar('*', 10); // printStar 함수를 호출
		System.out.println("Hello");
//System.out.println("**********");
		printStar('#', 29);
		System.out.println("Hi");
//System.out.println("**********");
		printStar('-', 5);
		System.out.println("Goodbye");
//System.out.println("**********");
		printStar('!', 8);
		
	}
}
