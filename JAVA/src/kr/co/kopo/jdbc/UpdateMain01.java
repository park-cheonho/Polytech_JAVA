package kr.co.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateMain01 {

/*
 *  아이디를 입력 하세요 : lee
 *  변경할 이름을 입력하세요 : 이길동
 *  1개의 행이 변경 되었습니다. :  	
 */
	public static void main(String[] args)  {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			
			// step 1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// step 2
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user = "DA16";
			String password = "DA16";
			
			conn = DriverManager.getConnection(url,user,password);
			
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
		
	}
}
}
