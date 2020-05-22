package kr.ac.kopo.board.service;

public class BoardSequence {

	private static int boardNo = 1;
	
	public static int getBoardSequence() {
		return boardNo++;
	}
}
