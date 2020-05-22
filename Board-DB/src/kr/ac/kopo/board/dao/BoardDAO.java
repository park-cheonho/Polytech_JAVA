package kr.ac.kopo.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.board.vo.BoardVO;
import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class BoardDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	
	/**
	 * 새로운 게시글 등록하는 기능
	 */
	public void insertBoard(BoardVO newBoard) {
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into t_board(no, title, writer) ");
			sql.append(" values(seq_t_board_no.nextval, ?, ?) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			String title = newBoard.getTitle();
			String writer = newBoard.getWriter();
			
			pstmt.setString(1, title);
			pstmt.setString(2, writer);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	/**
	 * 전체게시글을 조회하는 기능
	 */
	public List<BoardVO> selectAllBoard() {
		
		List<BoardVO> list = new ArrayList<>();
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, writer, reg_date ");
			sql.append("  from t_board ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");
				
				BoardVO board = new BoardVO(no, title, writer, regDate);
				
				list.add(board);				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return list;
	}
	
	/**
	 * 게시물 번호에 해당하는 게시물을 조회하는 기능
	 */
	public BoardVO selectBoardByNo(int no) {
		
		return null;
	}
	
	/**
	 * 번호에 해당하는 게시물을 수정하는 기능
	 */
	public void modifyBoard(BoardVO board) {
		
	}
	
	/**
	 * 번호에 해당하는 게시물을 삭제하는 기능
	 */
	public void deleteBoardByNo(int no) {
		
	}
}









