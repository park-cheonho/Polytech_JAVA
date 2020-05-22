package kr.co.kopo.day13.lotto03;

public class MC {

	private Machine machine;
	
	public MC() {
		machine = new Machine();
	}
	
	public void ment() throws Exception {
		
		System.out.println("안녕하세요 MC XXX입니다");
		System.out.println("제 XX회 로또 방송을 시작하겠습니다");
		
		machine.start();
		
		for(int i = 1; i <= 6; i++) {
			
			Thread.sleep(1000);
			
			Ball ball = machine.getBall();
			System.out.println(i + "번째 로또 번호는 " + ball.getNumber() + "입니다");
		}
	}
}













