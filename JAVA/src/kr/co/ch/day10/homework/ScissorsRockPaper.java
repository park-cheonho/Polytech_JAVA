package kr.co.ch.day10.homework;

import java.util.Random;

public class ScissorsRockPaper implements Game  {

	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	
	int result;
	//결과를 받는 변수 result
	@Override
	public int startGame(int you) {
		
		Random r = new Random();
		int me = (r.nextInt(3)+1);
		
		if (me == 1 && you ==1) {
			System.out.println("비겼습니다.");
		}
		if (me == 2 && you == 2) {
			System.out.println("비겼습니다.");
		}
		if (me == 3 && you == 3) {
			System.out.println("비겼습니다.");
		}
		if (me == 1 && you == 3) {
			System.out.println("you lose!");
			result--;
		}
		if (me == 1 && you == 2) {
			System.out.println("you win!");
			result++;
		}
		if (me == 2 && you == 3) {
			System.out.println("you win!");
			result++;
		}
		if (me == 2 && you == 1) {
			System.out.println("you lose!");
			result--;
		}
		if (me == 3 && you == 1) {
			System.out.println("you win!");
			result++;
		}
		if (me == 3 && you == 2) {
			System.out.println("you lose!");
			result--;
		}
		
		return result;
	}
	
	
}
