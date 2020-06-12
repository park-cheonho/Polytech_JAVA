package kr.co.ch.day10.inter02;

public class UserMain {

	public static void main(String[] args) {
		
		TV tv = new LGTV();
		tv = new SamsumgTV();
		
		tv.togglePower();
		tv.channelDown();
		tv.volumDown();
		tv.volumUp();
		tv.mute();
		tv.channelUp();
		tv.togglePower();
		
		tv.copyright();
		
		
	}
}
