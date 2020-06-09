package kr.ac.kopo.day17.homework;

import java.util.Random;

class HelpEachOther {
	
	private int count = 0;
	private int meney = 0;
	private int total = 0;
	
	public void sum(int num) {
		
		for(int i = 1; i < 11; i ++) {
			//synchronized (this) 
			
				//System.out.println(i);
				count++;
				Random r = new Random();
				meney = r.nextInt(10)*1000 + 1000;
				System.out.println(num + "콜센터 : " + meney + " 원을 받았습니다.");
				total += meney;
			
		}
		System.out.println( num + "번 콜센터의  : " + total + "입니다.");
	}
	
	public int getCount() {
		return total;
		}
}

class CallMultiThread extends Thread{
	
	private HelpEachOther heo;
	private int num;
	
	public CallMultiThread(HelpEachOther heo, int num) {
		this.heo = heo;
		this.num = num;
	}

	@Override
	public void run() {
		heo.sum(num);
	}
}

public class CallMultiThreadMain {
	
	public static void main(String[] args) {
		
		HelpEachOther heo = new HelpEachOther();
		
		//4개의 객체가 heo라는 공유자원 공유
		CallMultiThread cmt1 = new CallMultiThread(heo,1);
		CallMultiThread cmt2 = new CallMultiThread(heo,2);
		CallMultiThread cmt3 = new CallMultiThread(heo,3);
		CallMultiThread cmt4 = new CallMultiThread(heo,4);
		
		cmt1.start();
		cmt2.start();
		cmt3.start();
		cmt4.start();
		
		try {
			cmt1.join();
			cmt2.join();
			cmt3.join();
			cmt4.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("국민들이 보내주신 성금총액 : " + heo.getCount());
	}
	
}
