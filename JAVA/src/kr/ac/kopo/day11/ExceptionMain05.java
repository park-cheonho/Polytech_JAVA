package kr.ac.kopo.day11;

public class ExceptionMain05 {

	static void a() {
		for(int i = -2; i < 3; i++) {
			System.out.println("for문 진입...[" + i + "]");
			try {
				System.out.println(10 / i);
//				if(i == -1)
//					return;
			} catch(Exception e) {
				e.printStackTrace();
				return;
			} finally {
				System.out.println("for문 종료...");
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		a();
		
		/*
		for(int i = -2; i < 3; i++) {
			System.out.println("for문 진입...[" + i + "]");
			try {
				System.out.println(10 / i);
			} catch(Exception e) {
				e.printStackTrace();
				break;
			} finally {
				System.out.println("for문 종료...");
			}
		}
		*/
		
		System.out.println("main end");
		
	}
}
