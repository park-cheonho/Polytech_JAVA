package kr.ac.kopo.board.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;

/*
       --->         ---> 
	UI      SERVICE      DAO
	   <---         <---
*/
public class BoardService {
	private BoardDAO boardDAO;

	public BoardService() {
		boardDAO = new BoardDAO();
	}
	
	public void insertBoard(BoardVO newBoard) {
		
		boardDAO.insertBoard(newBoard);
	}
	
	public List<BoardVO> selectAllBoard() {
		
		List<BoardVO> list = boardDAO.selectAllBoard();
		
		return list;
	}
	
	public BoardVO selectBoardByNo(int no) {
		
		BoardVO board = boardDAO.selectBoardByNo(no);
		return board;
		
	}
	
	public void modifyBoard(BoardVO board) {
		boardDAO.modifyBoard(board);
	}
	
	public void deleteBoardByNo(int no) {
		boardDAO.deleteBoardByNo(no);
	}
}










