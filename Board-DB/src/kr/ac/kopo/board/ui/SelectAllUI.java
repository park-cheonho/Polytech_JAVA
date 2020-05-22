package kr.ac.kopo.board.ui;

import java.util.List;

import kr.ac.kopo.board.vo.BoardVO;

public class SelectAllUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		//////////////////////////////////////////////
		// 메모리 or file or db에서 전체게시물을 조회 서비스
		List<BoardVO> list = boardService.selectAllBoard();	
		//////////////////////////////////////////////
		
		System.out.println("--------------------------------------------------");
		System.out.println("번호\t작성자\t등록일\t제목");
		System.out.println("--------------------------------------------------");
		if(list.isEmpty()) {
			System.out.println("\t등록된 게시물을 없습니다");
		} else {
			for(BoardVO board : list) {
				System.out.println(board.getNo() + "\t" + board.getWriter() + "\t"
							+ board.getRegDate() + "\t" + board.getTitle());
			}
		}
		System.out.println("--------------------------------------------------");
	}

}










