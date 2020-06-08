package kr.ac.kopo.day16;

class Data {

	public synchronized void a() {
	try {
		//Thread.sleep(100);
		// yield는 block으로 안빠진다 run에 있다가 작업권한을 넘겨주고 runnable로 가? 자연스럽게
		notify(); //이거 업승면 데드락에 빠진다 두개다 block에서 대기하면서 서로 기다리는 상황 -> 해결하려면 notofiyall? 사용 
		System.out.println("a() 메소드 호출...");
		wait(); // a가 무조건 block으로가 작업권한 넘겨주고 block으로가 풀려면 notofiy 씀 그럼 block에 있는거 랜덤하게 runnable로 감
	} catch (Exception e) {	
		e.printStackTrace();
	}
}
	public synchronized void b() {
		try {
			notify();
			System.out.println("b() 메소드 호출...");
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class NotifyThread01 extends Thread{

	private Data data;

	public NotifyThread01(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			data.a();
		}
	}


}
class NotifyThread02 extends Thread{

	private Data data;

	public NotifyThread02(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			data.b();
		}
	}



}

public class NotifyMain {
	public static void main(String[] args) {

		Data data = new Data();

		NotifyThread01 nt01 = new NotifyThread01(data);
		NotifyThread02 nt02 = new NotifyThread02(data);

		nt01.start();
		nt02.start();
	}

}
