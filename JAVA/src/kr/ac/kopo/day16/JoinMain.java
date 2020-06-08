package kr.ac.kopo.day16;



class BoyFriendThread extends Thread{

	@Override
	public void run() {
		System.out.println("(남자친구) : 나는 남자친구 스레드 입니다.");
		System.out.println("(남자친구) : 오늘 여자친구 스레드와 영화를 보기로 했습니다.");
		System.out.println("(남자친구) : 예매한 영화시간이 얼마남지 않았습니다.");
		System.out.println("(남자친구) : 여자친구를 기다립니다. 제 인내심은 5초 까지 입니다.");
		//System.out.println("(남자친구) : 여자친구가 올때까지 기다리겠습니다.");
		
		GirlFriendThread gt = new GirlFriendThread();
		gt.start();
		
		//gt 스레드가 다 끝날때까지 bf가 기다리게 하는 메소드
		try {
			
			gt.join(5000);
			//gt.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("(남자친구) : 5초동안 여자친구가 안왔습니다. 집에 갑니다.");
		//System.out.println("(남자친구) : 드디어 여자친구가 왔습니다. 영화보러 갑니다.");
	}
	
}

class GirlFriendThread extends Thread{

	@Override
	public void run() {
		System.out.println("(여자친구) : 나는 여차친구 스레드 입니다.");
		System.out.println("(여자친구) : 오늘 남자친구의 애정도를 테스트 하겠습니다.");
		System.out.println("(여자친구) : 10초도 못기다리는 남지친구는 나를 좋아하는게 아니겠죠?");
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("(여자친구) : " + i + "초가 지났습니다. 남자친구가 계속 기다리고 있을까요?");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("(여자친구) : 남자친구가 없어요... 헤어져....!!!");
		//System.out.println("(여자친구) : 남자친구가 10초를 기다려줬어요.... 저를 좋아하나봐요....");
	}
	
}

public class JoinMain {

	public static void main(String[] args) {
		
		
		
		BoyFriendThread bt = new BoyFriendThread();
		bt.start();
	}
}
