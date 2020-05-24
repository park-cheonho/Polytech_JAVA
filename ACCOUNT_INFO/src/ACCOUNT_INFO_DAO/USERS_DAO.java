package ACCOUNT_INFO_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ACCOUNT_INFO_UTIL.ConnectionFactory;
import ACCOUNT_INFO_UTIL.JDBCClose;
import ACCOUNT_INFO_VO.USER_VO;

public class USERS_DAO {

	private Connection conn;
	private PreparedStatement pstmt;
	
	/**
	 * 새로운 아이디 비밀번호 이름 등록하는 기능
	 */
	public void signup(USER_VO signup) {
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into USERS(ID, PWD, NAME) ");
			sql.append(" values(?,?,?) ");
			
			
			pstmt = conn.prepareStatement(sql.toString());
			String id = signup.getId();
			String pwd = signup.getPwd();
			String name = signup.getName();
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	/**
	 * 로그인 하는 기능
	 */
	public USER_VO login(String id, String password) {
		
		USER_VO user = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			
			sql.append("SELECT ID, PWD, NAME, REG_DATE ");
			sql.append(" FROM USERS ");
			sql.append(" WHERE ID = ? AND PWD = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			//String id = login.getId();
			//String pwd = login.getPwd();
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				//int seq = rs.getInt("SEQ");
				String name = rs.getString("NAME");
				String reg_Date = rs.getString("REG_DATE");
				
				user = new USER_VO(name,id,password,reg_Date);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return user;
	}
		
}

