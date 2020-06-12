package kr.co.ch.day10.inter01;

public class UserMain {

	public static void main(String[] args) {

		// 티비가 가진 기본 속성은 하나의 리모콘으로 사용하고 싶은데 삼성엘지의 메소드가 다름...
		// 이럴때 인터페이스를 쓰자!
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
