package kr.ac.kopo.day16;
/*
 * runnable        ->       run
 * thread queue 
 * st st3 st2      -> 
 * st3 st2		   ->        st = a 메소드 실행 루프 도는 와중에 시간이 지나서 제어권 상실 -> context switch 발생 -> 몇번꺼지 돌았는지 기억
 * st2 st	       ->        st3 = c 메소드 실행 -> 시간 지나면 제어권 상실 -> context switch 발생 -> 몇번꺼지 돌았는지 기억
 * st st3          ->        st2 = b 메소드 실행 -> 시간 지나면 제어권 상실 -> context switch 발생 -> 몇번꺼지 돌았는지 기억
 */
// 어떤 작업을 진행하는데 작업이 끝나기 전에 run에서 runnable로 보내기 싫은 상황입니다. -> 하지만 그런건 없어요 무조건 가야해요 jvm이 이렇게 만들어버림...
// 근데 공유자원이라서 다른 스레드가 run하면 문제가 생간디 -> 해결을 위해 공유자원을 소비하는 다른 스레드가 run으로 오면 sync 객체에 lock이라고 하는 변수를 하나 만들어서 
// st가 들어오면 sync라는 자원을 소비하려면 lock st라는 스레드만 하게 할꺼야 라고 하는 것 
// 다른 st2 st3가 들어와도 lock에는 st로 되어 있기 때문에 st2 st3 스레드가  sync라는 자원 사용 불가능 
// block으로 st2, st3를 보내버림 그리고 sync를 사용하는 건 st만 st가 run으로 가서 20개 찍을때까지 나머지 스레드와 경쟁안하고 run runnable 왔다갔다 하면서 다 루프 돌기
// 그러면서 st가 done으로 가면서 lock wt 가 풀리고 
// st2, st3 중에  st3가 run 되면서 sync에 lock st3 생기면
// st2가 block으로 가고 st3가 lock st3 되고  run runnable 왔다 갔다 하면서 루프를 다돌게됨
// st3가 다 돌면 st2가 lock st2되고 run runnable 왓다 갔다 함
// 이것이 동기화  -> synchronize
// 가장 중요한건 자원을 소비하려면 해다ㅓㅇ 공유자원에 lock이 걸려야함
// lock 안걸리면 block에 들어있다가 나옴
class Sync {
	// 메소드에 synchronized 붙으면 메소드가 다 실행 될때 까지 lock 이 걸림
	public synchronized void a() {
		for(int i = 0; i < 10; i++) {
			System.out.print('a');
		}
	}
	
	//동기화 블럭 
	// println 은 동기화 블럭이 이미 지정 되어 있음
	public void b() {
		synchronized(this) {
			for(int i = 0; i < 10; i++) {
				System.out.print('b');
			}
		}
	}
	public synchronized void c() {
		for(int i = 0; i < 10; i++) {
			System.out.print('c');
		}
	}
}
class SyncThread extends Thread{
	private Sync sync;
	private int type;

	public SyncThread(Sync sync, int type) {
		super();
		this.sync = sync;
		this.type = type;
	}

	@Override
	public void run() {

		switch(type) {
		case 1 :
			sync.a();
			break;
		case 2 :
			sync.b();
			break;
		case 3 :
			sync.c();
			break;
		}
	}


}

public class SyncMain {

	public static void main(String[] args) {
		// 자원 하나를 같이 사용하고 싶음
		Sync sync = new Sync();

		// 자원 하나를 같이 사용하고 싶음 st1,2,3 이 sync라는 자원을 공유
		SyncThread st = new SyncThread(sync, 1);
		SyncThread st2 = new SyncThread(sync, 2);
		SyncThread st3 = new SyncThread(sync, 3);

		st.start();
		st2.start();
		st3.start();
	}
}
