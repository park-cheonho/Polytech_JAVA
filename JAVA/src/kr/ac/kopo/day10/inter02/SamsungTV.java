package kr.ac.kopo.day10.inter02;

public class SamsungTV implements TV {

	private boolean power;
	
	@Override
	public void togglePower() {
		power = !power;
		System.out.println("전원 " + (power ? "ON" : "OFF"));
	}

	@Override
	public void channeUp() {
		System.out.println("Channel Up");

	}

	@Override
	public void channelDown() {
		System.out.println("Channel Down");

	}

	@Override
	public void volumeUp() {
		System.out.println("Volume Up");

	}

	@Override
	public void volumeDown() {
		System.out.println("Volume Down");

	}

	@Override
	public void mute() {
		System.out.println("mute...");

	}

}
