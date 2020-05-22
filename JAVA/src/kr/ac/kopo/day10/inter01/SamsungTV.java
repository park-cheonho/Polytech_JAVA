package kr.ac.kopo.day10.inter01;

public class SamsungTV {

	private boolean power;
	
	public SamsungTV() {
		System.out.println("삼성 TV를 구매했습니다");
		power = false;
	}
	
	public void togglePower() {
		power = !power;
		System.out.println(power ? "전원 ON" : "전원 OFF");
	}
	
	public void channelUp() {
		System.out.println("채널 UP");
	}
	
	public void channelDown() {
		System.out.println("채널 DOWN");
	}
	
	public void soundUp() {
		System.out.println("음량 UP");
	}
	
	public void soundDown() {
		System.out.println("음량 DOWN");
	}
}














