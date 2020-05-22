package kr.co.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMain01 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			//1단계  JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1단계 드라이버 로딩");

			//2단계 : JDBC드라이버를 이용한 db 접속, Connection객체 얻기
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user = "DA16";
			String password = "DA16";
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("2단계 conn :" + conn);

			//3단계 : SQL문 실행 (Statement) - create
			stmt = conn.createStatement();
			String sql = "insert into t_test(id,name) values('hong', '홍길동')";

			//4단계 : SQL문 실행 및 결과 도출
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총"+cnt+"개의 행 삽입");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//5단계 : 연결 (stack)으로 닫아주기
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
