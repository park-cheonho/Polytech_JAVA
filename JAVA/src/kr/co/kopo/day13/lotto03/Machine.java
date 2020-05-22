package kr.co.kopo.day13.lotto03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {

	private List<Ball> balls = new ArrayList<>();
	
	public Machine() {
		for(int i = 1; i <= 45; i++) {
			balls.add(new Ball(i));
		}
	}
	
	public void start() {
		Collections.shuffle(balls);
	}
	
	public Ball getBall() {
		
		return balls.remove(0);
	}
}








