package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		
		try {
			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");
			
			/*
			Connection conn = DriverManager.getConnection(
									"jdbc:oracle:thin:@172.16.88.120:1521:dink",
									"scott",
									"tiger");
			*/
			
			// 실행컴퓨터에서 오라클설치된 경우...
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"hr",
					"hr");
			
			System.out.println("db 접속 성공 : " + conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}









