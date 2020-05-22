package kr.co.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.co.kopo.util.ConnectionFactory;
import kr.co.kopo.util.JDBCClose;

public class SelectMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = new ConnectionFactory().getConnection();
			
			String sql = "select id, name from ( select * from t_test order by id asc) where rownum = 1";
					
					
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("id"); 
				String name = rs.getString("name");
				
				System.out.println("id : " + id + ", name" + name);
			} else {
				System.out.println("등록된 id가 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}
