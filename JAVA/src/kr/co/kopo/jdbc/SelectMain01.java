package kr.co.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.co.kopo.util.ConnectionFactory;
import kr.co.kopo.util.JDBCClose;

public class SelectMain01 {


	public static void main(String[] args) {
		
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	            
	      try {
	         conn = new ConnectionFactory().getConnection();
	      // 차이점 위는참조변수가 없는 1회용성 가비지 컬랙터가 수거해감
				//ConnectionFactory factory = new ConnectionFactory();
				//conn = factory.getConnection();
				// 이거는 factory 변수가 기억하고 있어서 다른매소드 호출 가능 블록 스코프가 끝나야 가비지 컬랙터가 수거
				
	         String sql = "select * from t_test";
	         pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery();   
	         
	         
	         // 몇개의 레코드가 있어?
	         
	         int cnt = 0;
	         System.out.println("=======SELECT========");
	         while(rs.next()) {
	            String id = rs.getString("ID");
	            String name = rs.getString("NAME");
	            
	            System.out.println("ID: " + id + " \t"+ " NAME: " + name);
	         }
	         
	         // System.out.println(rs.next());
	         
	               
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         JDBCClose.close(conn, pstmt);
	      }
		
		
	}
}
