package kr.ac.kopo.day10.inter02;

public interface TV {

	int MAX_VOLUME = 30;
	
	void togglePower();
	void channeUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
	/**
	 * @since JDK1.8추가
	 */
	default void copyright() {
		System.out.println("저작권은 TV협회에 있습니다");
		System.out.println("임의로 수정, 배포하실 수 없습니다");
	}
}
