package kr.ac.kopo.board.ui;

import java.util.Scanner;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.service.BoardServiceFactory;

public abstract class BaseUI implements IBoardUI {

	private Scanner sc;
	protected BoardService boardService;

	public BaseUI() {
		sc = new Scanner(System.in);
		boardService = BoardServiceFactory.getBoardService();
	}
	
	protected int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
}











