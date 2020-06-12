package kr.co.ch.day10.inter02;

public class SamsumgTV implements TV {
	
	private boolean power;

	@Override
	public void togglePower() {
		power = !power;
		System.out.println("전원 " + (power ? "ON" : "OFF"));

	}

	@Override
	public void channelUp() {
		System.out.println("Channel Up");


	}

	@Override
	public void channelDown() {
		System.out.println("Channel Down");


	}

	@Override
	public void mute() {
		System.out.println("mute...");
	}

	@Override
	public void volumUp() {
		System.out.println("Volume Up");


	}

	@Override
	public void volumDown() {
		System.out.println("Volume Down");

	}

}
