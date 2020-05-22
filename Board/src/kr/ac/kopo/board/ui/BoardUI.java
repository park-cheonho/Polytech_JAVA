package kr.ac.kopo.board.ui;

public class BoardUI extends BaseUI {

	private int choiceMenu() {
		System.out.println("---------------------------------");
		System.out.println("\t게시판 관리 프로그램");
		System.out.println("---------------------------------");
		System.out.println("\t1. 전체게시물 조회");
		System.out.println("\t2. 게시물번호로 조회");
		System.out.println("\t3. 게시물 등록");
		System.out.println("\t4. 게시물 수정");
		System.out.println("\t5. 게시물 삭제");
		System.out.println("\t0. 종료");
		System.out.println("---------------------------------");
		int type = scanInt("\t번호를 선택하세요 : ");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		while(true) {
			int type = choiceMenu();
			IBoardUI ui = null;
			switch (type) {
			case 1:
				ui = new SelectAllUI();
				break;
			case 2:
				ui = new SelectOneUI();
				break;
			case 3:
				ui = new AddUI();
				break;
			case 4:
				ui = new UpdateUI();
				break;
			case 5:
				ui = new DeleteUI();
				break;
			case 0:
				ui = new ExitUI();
				break;
			}
			
			if(ui != null) {
				ui.execute();
			}
		}
	}

}













