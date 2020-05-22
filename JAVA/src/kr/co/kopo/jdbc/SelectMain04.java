package kr.co.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.co.kopo.util.ConnectionFactory;
import kr.co.kopo.util.JDBCClose;

public class SelectMain04 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("급여를 입력하세요 : ");
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
				
		try {
			
			conn = new ConnectionFactory().getConnection();
			int salary = sc.nextInt();
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT JOB_TITLE, AVG(SALARY) ");
			sql.append("FROM ( ");
			sql.append("SELECT JOB_TITLE,SALARY ");
			sql.append("FROM EMPLOYEES E, JOBS J ");
			sql.append("WHERE E.JOB_ID=J.JOB_ID ");
			sql.append("AND SALARY >= ? ");
			sql.append(") ");
			sql.append("GROUP BY JOB_TITLE ");
			sql.append("ORDER BY AVG(SALARY) DESC ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, salary); // 물음표의 순서가 숫자
			
			ResultSet rs = pstmt.executeQuery();
			int cnt = 0;
			while(rs.next()) {
				String jobTitle = rs.getString(1); // 컬럼의 인덱스
//				String jobTitle = rs.getString(JOB_TITLE); // 컬럼의 인덱스
				int avgSalary = rs.getInt(2);
				
				System.out.printf("[%s] %d\n", jobTitle, avgSalary);
				cnt++;
			}
			System.out.println("총 " + cnt + " 개 행이 검색 되었습니다.");
							
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//step 5
			JDBCClose.close(conn, pstmt);
		
	}
	}
}
