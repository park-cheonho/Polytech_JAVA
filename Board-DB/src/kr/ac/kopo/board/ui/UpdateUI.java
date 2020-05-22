package kr.ac.kopo.board.ui;

import kr.ac.kopo.board.vo.BoardVO;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("수정할 게시물 번호를 입력하세요 : ");
		String title = scanStr("수정할 제목을 입력하세요 : ");
		
		/////////////////////////////////////////////////////
		// 메모리 or file or DB에서 게시물을 수정하는 서비스  
		BoardVO board = new BoardVO();
		board.setNo(no);
		board.setTitle(title);
		boardService.modifyBoard(board);
		/////////////////////////////////////////////////////
		
		System.out.println("[" + no + "]번 게시판 수정을 완료하였습니다");
	}

}
