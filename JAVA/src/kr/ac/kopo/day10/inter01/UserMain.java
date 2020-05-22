package kr.ac.kopo.day10.inter01;

public class UserMain {

	public static void main(String[] args) {
		
		LGTV lg = new LGTV();
		
		lg.powerOn();
		lg.channelUp();
		lg.channelDown();
		lg.volumeDown();
		lg.volumeUp();
		lg.powerOff();
		
		SamsungTV sam = new SamsungTV();
		sam.togglePower();
		sam.soundUp();
		sam.soundDown();
		sam.channelDown();
		sam.channelUp();
		sam.togglePower();
		
	}
}
