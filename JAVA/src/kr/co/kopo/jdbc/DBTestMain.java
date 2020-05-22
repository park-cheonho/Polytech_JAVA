package kr.co.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {

		try {
			// 1단계 : jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");

			Connection conn = DriverManager.getConnection
		    ("jdbc:oracle:thin:@172.16.88.120:1521:dink", "DA16","DA16");
		
			System.out.println("db접속성공 : " + conn);
		} catch (Exception e) {
		e.printStackTrace();
	
	 }
	}
}
