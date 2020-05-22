package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 *		ID를 입력하세요 : lee
 *		변경할 이름을 입력하세요 : 이길동
 *		1개의 행이 변경되었습니다
 */

public class UpdateMain01 {

	public static void main(String[] args) {
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계
			String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
			String user 	= "hr";
			String password = "hr";
			
			conn =  DriverManager.getConnection(url, user, password);
			
			// 3단계
			Scanner sc = new Scanner(System.in);
			
			System.out.print("ID를 입력하세요 : ");
			String id = sc.nextLine();
			
			System.out.print("변경할 이름을 입력하세요 :  ");
			String name = sc.nextLine();
			
			String sql  = "update t_test ";
				   sql += "   set name = ? ";
				   sql += " where id = ? ";
				   
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			// 4단계
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 행이 수정되었습니다");
			
			sc.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// 5단계
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}




















