package kr.ac.kopo.day16;

class AAA extends Thread {

	@Override
	public void run() {
//		while(true) {
			for(int i =0; i <=10; i++) {
				System.out.println("go!!!!");
				
			}
		}
	}
	
//}

class BBB extends Thread {

	@Override
	public void run() {
//		while(true) {
			for(int i = 0 ; i <= 10; i++) {
				
				System.out.println("\t\t\tstop!!!!");
			}
		}
	}
	
//}

public class ThreadMain01 {

	public static void main(String[] args) {

		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		// 둘다 런어블로 보내주는 것
		//aaa.start();
		//bbb.start();
		
		// runable에 있지 않아도 ready 에서 run 으로 
		aaa.run();
		bbb.run();
		
	}
}


