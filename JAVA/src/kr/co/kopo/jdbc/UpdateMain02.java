package kr.co.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.co.kopo.util.ConnectionFactory;
import kr.co.kopo.util.JDBCClose;

public class UpdateMain02 {

/*
 *  아이디를 입력 하세요 : lee
 *  변경할 이름을 입력하세요 : 이길동
 *  1개의 행이 변경 되었습니다. :  	
 */
	public static void main(String[] args)  {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			
			// step 3
			Scanner sc = new Scanner(System.in);
			
			System.out.println("id를 입력하세요 : ");
			String id = sc.nextLine();
			
			System.out.println("변경할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			String sql = "update t_test";
					sql += " set name = ?";
					sql += " where id = ?";
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			// step 4
			int cnt = pstmt.executeUpdate();
			System.out.println("총" + cnt + "개의 행이 실향되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			//step 5
			JDBCClose.close(conn, pstmt);
			
			/*
			//step 5
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}	if(pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			 */
	}
}
	}
