package kr.co.ch.day10.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		//베팅이나 코인 시스템을 해보려고 했는데 구현이 생각보다 너무 어렵네요..ㅜ
		int win = 0;
		int draw = 0;
		int lose = 0;
		// 승무패를 변수로 지정해서 마지막에 세주기
		while (true) {
			
			System.out.println("게임을 선택하세요");
			System.out.println("A. 가위바위보");
			System.out.println("B. 주사위 값  맞추기");
			System.out.println("C. 종료");
			
			while (true) {

				Scanner sc = new Scanner(System.in);
				String input = sc.next();
				sc.nextLine();
				
				if (input.equals("A") || input.equals("가위바위보") || input.equals("a")) {
					
					System.out.println("가위바위보 게임입니다.");
					System.out.println("가위바위보중 하나를 선택하세요.");
					System.out.println("(1:가위, 2:바위, 3:보)");
					int you = Integer.parseInt(sc.nextLine()); 
					//유저가 입력한 값
					ScissorsRockPaper srp = new ScissorsRockPaper();
					//가위바위보 메소드? 객체? 생성
					int result = srp.startGame(you);
					//결과를 result로
					if (result == 1) {
						win++;
					}
					if (result == 0) {
						draw++;
					}
					else if (result == -1) {
						lose++;
					}
					break;
				} else if (input.equals("B") || input.equals("주사위 값 맞추기") || input.equals("b")) {
					System.out.println("주사위 값 맞추기 게임입니다.");
					System.out.println("주사위 숫자를 선택하세요.(1~6 중 하나)");
					int you = Integer.parseInt(sc.nextLine());
					//유저의 입력값
					Dice dice = new Dice();
					// 새로운 객체 생성
					int result = dice.startGame(you);
					// 결과를 result에 저장
					if (result == 1) {
						win++;
					}
					if (result == 0) {
						draw++;
					}
					else if (result == -1) {
						lose++;
					}
					break;
				} else if (input.equals("C") || input.equals("종료") || input.equals("c")) {
					System.out.println("게임을 종료합니다.");
					System.out.println("당신의 게임 전적은 " + win + " 승" + draw + " 무" + lose + " 패 입니다.");
				} else { 
					//잘못 입력 할 경우
					System.out.println("게임을 다시 입력하세요.");
					break;
				}
			}
			
		}
	}
}
