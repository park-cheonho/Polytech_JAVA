package kr.co.kopo.jdbc;

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
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//2단계
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user = "DA16";
			String password = "DA16";

			conn = DriverManager.getConnection(url,user,password);

			//3단계
			stmt = conn.createStatement();
			System.out.println("등록할 아이디를 입력하세요");
			String id = sc.nextLine();

			System.out.println("등록할 이름을 입력하세요");
			String name = sc.nextLine();

			//라인 바뀌면 들여쓰기
			String sql = "insert into t_test(id,name)";
			sql += " values(\'" + id + "\', \'" + name + "\') ";
			//values앞에 공백, 박길동 뒤에 공백
			//''잊지말고 입력!! 정수는 필요 x 날짜나 문자 일때는 
			//String sql = "insert into t_test(id,name)";
			//sql += " values('park','박천호') ";	   


			//4단계
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총" + cnt + " 개의 행이 입력되었습니다.");


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
