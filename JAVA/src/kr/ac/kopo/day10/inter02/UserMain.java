package kr.ac.kopo.day10.inter02;

public class UserMain {

	public static void main(String[] args) {
		
		TV tv = new LGTV();
//		tv = new SamsungTV();
		
		tv.togglePower();
		tv.channelDown();
		tv.volumeDown();
		tv.volumeUp();
		tv.mute();
		tv.channeUp();
		tv.togglePower();
		
		tv.copyright();
		
	
		
	}
}
