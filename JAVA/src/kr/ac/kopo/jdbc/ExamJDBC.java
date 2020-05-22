package kr.ac.kopo.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class ExamJDBC {

	public static void main(String[] args) throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("급여를 입력하세요 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("select job_title, avg(salary) ");
			sql.append("  from ( ");
			sql.append("          select job_title, salary ");
			sql.append("            from jobs inner join employees ");
			sql.append("              on jobs.job_id = employees.job_id ");
			sql.append("           where salary >= ? ");
			sql.append("       ) ");
			sql.append(" group by job_title ");
			sql.append(" order by avg(salary) desc ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, salary);
			
			ResultSet rs = pstmt.executeQuery();
			int cnt = 0;
			while(rs.next()) {
				String jobTitle = rs.getString(1);
				int avgSalary = rs.getInt(2);
				
				System.out.printf("[%s] %d\n", jobTitle, avgSalary);
				cnt++;
			}
			System.out.println("총 [" + cnt + "]개 행이 검색되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
	}
}








