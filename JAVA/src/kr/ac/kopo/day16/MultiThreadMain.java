package kr.ac.kopo.day16;

class Calculator {

	private int count = 0;

	/*
	public synchronized void sum() {
		for(int i = 0; i < 10000; i++) {
			count++;
		}
	}
	 */
	/*
	public void sum() {
		synchronized(this-오브젝트 객체만 들어옴 기본 자료형은 안됨) {
			for(int i = 0; i < 10000; i++) {
				count++;
			}
		}
	}
	 */

	public void sum() {

		for(int i = 0; i < 10000; i++) {
			synchronized(this) {
				count++;
			}
		}
	}

	public int getCount() {
		return count;
	}
}
class MultiThread extends Thread{
	private Calculator cal;

	public MultiThread(Calculator cal) {
		this.cal = cal;
	}

	@Override
	public void run() {
		cal.sum();
	}


}

public class MultiThreadMain {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		//두개의 객체가 cal라는 공유자원을 공유하고 있음
		MultiThread mt = new MultiThread(cal);
		MultiThread mt2 = new MultiThread(cal);

		mt.start();
		mt2.start();

		try {
			mt.join();
			mt2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(cal.getCount());
	}
}
