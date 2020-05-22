package kr.ac.kopo.board.ui;

import kr.ac.kopo.board.vo.BoardVO;

public class SelectOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("조회할 게시물 번호를 입력하세요 : ");
		
		//////////////////////////////////////////////////
		// 해당 게시물을 조회하는 서비스
		BoardVO board = boardService.selectBoardByNo(no);
		//////////////////////////////////////////////////
		
		System.out.println("------------------------------------------------");
		if(board == null) {
			System.out.println("입력하신 [" + no + "]번 게시물을 존재하지 않습니다");
		} else {
			System.out.println("\t번   호 : " + board.getNo());
			System.out.println("\t제   목 : " + board.getTitle());
			System.out.println("\t작성자 : " + board.getWriter());
			System.out.println("\t등록일 : " + board.getRegDate());
		}
		System.out.println("------------------------------------------------");
	}

	
}
