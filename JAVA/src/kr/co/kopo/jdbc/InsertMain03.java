package kr.co.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//2단계
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user = "DA16";
			String password = "DA16";

			conn = DriverManager.getConnection(url,user,password);

			/*
			 * Statement - conn
			 * PreparedStatement 
			 */
			//3단계 : SQL작성 PreparedStatement

			System.out.println("등록할 아이디를 입력하세요");
			String id = sc.nextLine();

			System.out.println("등록할 이름을 입력하세요");
			String name = sc.nextLine();

			
			String sql = "insert into t_test(id,name)";
				   sql += " values(?, ?)"; // 객체 만든후 메꾸기
				   
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1, id);
		    pstmt.setString(2, name);
		    
		    //4단계 : sql문 실행
		    
		    int cnt = pstmt.executeUpdate();
		    System.out.println("총" + cnt + " 개의 행이 입력되었습니다.");
		    
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//5단계 : 연결 (stack)으로 닫아주기
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