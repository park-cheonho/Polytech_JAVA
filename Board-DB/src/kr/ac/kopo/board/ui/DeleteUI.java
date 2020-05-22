package kr.ac.kopo.board.ui;

public class DeleteUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		int no = scanInt("삭제할 게시물 번호를 입력하세요 : ");
		
		/////////////////////////////////////////////////////
		// 메모리 or file or DB에서 게시물을 삭제하는 서비스  
		boardService.deleteBoardByNo(no);
		/////////////////////////////////////////////////////
		
		System.out.println("[" + no + "]번 게시판 삭제를 완료하였습니다");
	}

}
