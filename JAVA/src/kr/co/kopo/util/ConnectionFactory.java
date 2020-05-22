package kr.co.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		
		Connection conn = null;
		// 방법 1개 더 있음! 교수님 코드 참조!!
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@172.16.88.129:1521:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url,user,password);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return conn;
	}
}
