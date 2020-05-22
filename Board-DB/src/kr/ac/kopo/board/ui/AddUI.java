package kr.ac.kopo.board.ui;

import kr.ac.kopo.board.vo.BoardVO;

public class AddUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		String title = scanStr("등록할 제목을 입력하세요 : ");
		String writer = scanStr("등록할 작성자를 입력하세요 : ");
		
		/////////////////////////////////////////////////////
		// 메모리 or file or DB에 게시물을 저장하는 서비스
		BoardVO newBoard = new BoardVO();
		newBoard.setTitle(title);
		newBoard.setWriter(writer);
		
		boardService.insertBoard(newBoard);
		/////////////////////////////////////////////////////
		
		System.out.println("게시판 등록을 완료하였습니다");
	}

}
