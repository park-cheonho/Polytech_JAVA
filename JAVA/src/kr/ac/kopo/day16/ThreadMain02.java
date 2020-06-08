package kr.ac.kopo.day16;

/*
 * 
 * Thread 생성하는 2가지 방식
 * 1. thread 클래스 상속
 * 2. runnable 인터페이스 상속
 */

class ExtendThread extends Thread {

	@Override
	public void run() {
		for(int i = 0; i <=100; i++) {
			System.out.println(i+"번째 인형 눈 붙히기......");
		}
	}
	
	
}

//일반적으로 thread가 필요하다면 runable 인터페이스를 상속 받아서 진행합니다 -> 왜나면 상속은 다중 상속이 안되니까!!
class ImplementThread implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i <=100; i++) {
			System.out.println(i+"번째 인형 입 붙히기......");
		}
		
	}
	
}

public class ThreadMain02 {

	public static void main(String[] args) {
		//1이나옴 main이 돌아가는 것 자체가 jvm에서는 thread가 동작하도록 만들어줌 main메소드도 스레드로 동작함 
		//System.out.println("현재 실행중인 스레드 갯수 : " + Thread.activeCount());

		ExtendThread et = new ExtendThread();
		ImplementThread it = new ImplementThread();
		Thread t = new Thread(it);
		
		et.start();
		//thread클래스에만 strat메소드가 있음 
		t.start();
		
	
		
		//for(int i = 1; i <= 100; i++) {
		//	System.out.println(i + "번째 감독중......");
		//}
		
		//현재 실행중인 스레드 갯수
		//System.out.println("현재 실행중인 스레드 갯수 : " + Thread.activeCount());
		try {
			et.join();
			t.join();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("인형만들기 감독 종료....");
		
	}
}


