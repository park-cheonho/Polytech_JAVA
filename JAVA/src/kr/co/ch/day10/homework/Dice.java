package kr.co.ch.day10.homework;

import java.util.Random;

public class Dice implements Game {

	int result; // 결과값을 받기 위한 변수
	
	@Override
	public int startGame(int you) {
		
		Random r = new Random();
		int me = (r.nextInt(6)+1);
		
		if (me == you) {	
			System.out.println("you win!");
			result++;
		} else {
			System.out.println("you lose!");
			result--;
		}
		return result;
	}
	
}
