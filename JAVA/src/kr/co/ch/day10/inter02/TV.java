package kr.co.ch.day10.inter02;

public interface TV {
	
	int MAX_VOLUME = 30;
	
	void togglePower();
	void channelUp();
	void channelDown();
	void mute();
	void volumUp();
	void volumDown();
	
	/**
	 * @since JDK1.8추가
	 * 
	 */
	
	//이 방식은 원래 구현 ,설계 방식이 아님 
	//default방식을 통해서 설계하는 것도 좋은 방법은 아님
	default void copyright() {
		System.out.println("저작권은 티비협회에 있음");
		System.out.println("임의로 수정 배포하실 수 없습니다.");
	}

}
