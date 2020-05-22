package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계
			stmt = conn.createStatement();
			
			System.out.print("등록할 아이디를 입력하세요 : ");
			String id = sc.nextLine();
			
			System.out.print("등록할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			String sql  = "insert into t_test(id, name) ";
				   sql += " values(\'" + id + "\', \'" + name + "\') ";
				   
//		    String sql  = "insert into t_test(id, name) ";
//			       sql += " values('park', '박길동') ";
				   
			// 4단계
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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












