package kr.ac.kopo.board.ui;

public class ExitUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("===================================");
		System.out.println("\n\t게시판 프로그램을 종료합니다\n");
		System.out.println("\tBYE BYE~~~");
		System.out.println("===================================");
		System.exit(0);
	}

	
}
