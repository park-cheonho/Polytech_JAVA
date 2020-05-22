package kr.ac.kopo.board;

import kr.ac.kopo.board.ui.BoardUI;

public class BoardMain {

	public static void main(String[] args) {
		
		BoardUI ui = new BoardUI();
		try {
			ui.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
