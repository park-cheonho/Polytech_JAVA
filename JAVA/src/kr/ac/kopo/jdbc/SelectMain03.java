package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

/*
 * t_test에서 오름차순 기준(id) 첫번째 사용자 조회
 */
public class SelectMain03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {

			conn = new ConnectionFactory().getConnection();
			
			StringBuffer sb = new StringBuffer();
			sb.append("select id, name ");
			sb.append("  from ( ");
			sb.append("         select * ");
			sb.append("           from t_test ");
			sb.append("          order by id asc ");
			sb.append("       ) ");
			sb.append(" where rownum = 1");
			
			String sql = sb.toString();
			
			pstmt = conn.prepareStatement(sql);
			       
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				
				System.out.println("id : " + id + ", name : " + name);
			} else {
				System.out.print("등록된 id가 없습니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}






