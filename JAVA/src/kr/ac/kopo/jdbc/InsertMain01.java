package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement  stmt = null;
		
		try {
			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1단계 드라이버 로딩...");
			
			// 2단계 : DriverManager를 이용한 DB 접속, Connection 객체 얻기
			String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
			String user 	= "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("2단계 conn : " + conn);
			
			// 3단계 : SQL문 작성(Statment)
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) values('hong', '홍길동')";
			
			// 4단계 : SQL문 실행 및 결과 도출
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행 삽입...");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계 : 접속 종료
			if(stmt != null) {
				try {
					stmt.close();
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







