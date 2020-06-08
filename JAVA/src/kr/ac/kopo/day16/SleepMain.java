package kr.ac.kopo.day16;

import java.util.Date;

//thread 패키지는 lang에 있음 임포트 하지 않아도 쓸 수 있으니까
//일정한 시간이 지나서 종료되면 block에 있던 것이 runnable로 가도록 하려는 것
//



class SleepThread extends Thread {

	@Override
	public void run() {
		
		while (true) {
			try {
				Thread.sleep(1000);
				 System.out.println("현재시간 : " + new Date().toLocaleString());			
			} catch (Exception e) {
				 e.printStackTrace();
			}
		}
	}
	
}


public class SleepMain {

	public static void main(String[] args) {
	     // sleep을 만난 순간 run에서 빠져 나오면서 runnable로 가는게 아니라 block(대기상태)로 감
		SleepThread st = new SleepThread();
		st.start();
		
		while(true) {
			try {
				Thread.sleep(100);
				System.out.println("go!!!!!");				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		/*
		System.out.println("메인 스레드를 2초동안 잠들게 하겠습니다.");
		
		try {
			Thread.sleep(2000);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드가 2초후에 깨어났습니다.");
		*/
		
		
	}
	
}
