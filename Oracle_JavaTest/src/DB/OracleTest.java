package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;


public class OracleTest {

   public static void main(String args[])
   {
      Connection conn = null; // DB연결된 상태(세션)을 담은 객체
      PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
      ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체
   //   Connection conn2 = null; // DB연결된 상태(세션)을 담은 객체
   //   PreparedStatement pstm2 = null;  // SQL 문을 나타내는 객체
  //    ResultSet rs2 = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체
      
      /*
      try {
         // SQL 문장을 만들고 만약 문장이 질의어(SELECT문)라면
         // 그 결과를 담을 ResulSet 객체를 준비한 후 실행시킨다.
         String quary = "SELECT EMP.ENAME, EMP.SAL*1000\r\n" + 
         		"FROM EMP\r\n" + 
         		"WHERE EMP.ENAME!='KING'\r\n" + 
         		"ORDER BY EMP.ENAME"; //쿼리문 작성!!!
                
         
         conn = DBConnection.getConnection();
         pstm = conn.prepareStatement(quary);
         rs = pstm.executeQuery();
         */
      
         try {
             // SQL 문장을 만들고 만약 문장이 질의어(SELECT문)라면
             // 그 결과를 담을 ResulSet 객체를 준비한 후 실행시킨다.
             String quary = " SELECT SUBSTR(TO_CHAR(BIRTH_DT, 'YY'), 1, 1)||'0년대 출생' AS 출생, COUNT(ID) \"고객수\", ROUND(AVG(CREDIT_LIMIT), 2) \"신용한도평균\" FROM CUSTOMER GROUP BY SUBSTR(TO_CHAR(BIRTH_DT, 'YY'), 1, 1) ORDER BY 출생 "; 
                            
             conn = DBConnection.getConnection();
             pstm = conn.prepareStatement(quary);
             rs = pstm.executeQuery();

         //String quary2 = "SELECT EMP.ENAME, COUNT(ID)\r\n" + 
         //      "FROM CUSTOMER, EMP\r\n" + 
         //      "WHERE EMP.EMPNO = CUSTOMER.ACCOUNT_MGR\r\n" + 
         //      "GROUP BY EMP.ENAME\r\n" +
         //      "ORDER BY EMP.ENAME"; //쿼리문 작성!!!

       //  conn2 = DBConnection.getConnection();
       //  pstm2 = conn2.prepareStatement(quary2);
       //  rs2 = pstm2.executeQuery();
         
         /*  EMP 테이블의 데이터 타입

                EMPNO NOT NULL NUMBER(4) -- int
                ENAME VARCHAR2(10) -- String
                JOB VARCHAR2(9) -- String
                MGR NUMBER(4) -- int
                HIREDATE DATE -- Date
                SAL NUMBER(7,2) -- float/double
                COMM NUMBER(7,2) -- float/double
                DEPTNO NUMBER(2) -- int
          */

         //System.out.println("EMPNO ENAME JOB MGR HIREDATE SAL COMM DEPTNO");
         //System.out.println("============================================");
/*
         while(rs.next()){
            int empno = rs.getInt(1);
            //int empno = rs.getInt("empno"); 숫자 대신 컬럼 이름을 적어도 된다.
            String ename = rs.getString(2);
            String job = rs.getString(3);
            int mgr = rs.getInt(4);
            java.sql.Date hiredate = rs.getDate(5); // Date 타입 처리
            int sal = rs.getInt(6);
            int comm = rs.getInt(7);
            int deptno = rs.getInt(8);

            String result = empno+" "+ename+" "+job+" "+mgr+" "+hiredate+" "+sal+" "+comm+" "+deptno;
            System.out.println(result);
         }
         */
         
         PolylineBarChart demo = new PolylineBarChart();

            JFreeChart chart = demo.getChart(rs);

            ChartFrame frame1=new ChartFrame("Bar Chart",chart);

            frame1.setSize(800,400); 

            frame1.setVisible(true);

      } catch (SQLException sqle) {
         System.out.println("SELECT문에서 예외 발생");
         sqle.printStackTrace();

      }finally{
         // DB 연결을 종료한다.
         try{
            if ( rs != null ){rs.close();}   
            if ( pstm != null ){pstm.close();}   
            if ( conn != null ){conn.close(); }
         }catch(Exception e){
            throw new RuntimeException(e.getMessage());
         }
         
         // DB 연결을 종료한다.
   //     try{
   //        if ( rs2 != null ){rs2.close();}   
   //         if ( pstm2 != null ){pstm2.close();}   
   //         if ( conn2 != null ){conn2.close(); }
   //      }catch(Exception e){
   //         throw new RuntimeException(e.getMessage());
   //               }

      }
   }



   /*   
   public static void main(String args[])
    {
        Connection conn = null; // DB연결된 상태(세션)을 담은 객체
        PreparedStatement pstm = null;  // SQL 문을 나타내는 객체
        ResultSet rs = null;  // 쿼리문을 날린것에 대한 반환값을 담을 객체

        try {
            // SQL 문장을 만들고 만약 문장이 질의어(SELECT문)라면
            // 그 결과를 담을 ResulSet 객체를 준비한 후 실행시킨다.
            String quary = "SELECT * FROM CUSTOMER";

            conn = DBConnection.getConnection();
            pstm = conn.prepareStatement(quary);
            rs = pstm.executeQuery();

            /*  CUSTOMER 테이블의 데이터 타입
    * 
             이름           널?       유형            
------------ -------- ------------- 
ID           NOT NULL VARCHAR2(20)  
PWD          NOT NULL VARCHAR2(20)  
NAME         NOT NULL VARCHAR2(20)  
ZIPCODE               VARCHAR2(7)   
ADDRESS1              VARCHAR2(100) 
ADDRESS2              VARCHAR2(100) 
MOBILE_NO             VARCHAR2(14)  
PHONE_NO              VARCHAR2(14)  
CREDIT_LIMIT          NUMBER(9,2)   
EMAIL                 VARCHAR2(20)  
ACCOUNT_MGR           NUMBER(4)     
BIRTH_DT              DATE          
ENROLL_DT             DATE          
GENDER                VARCHAR2(1)   
    */

   /*
            System.out.println("ID PWD NAME ZIPCODE ADDRESS1 ADDRESS2 MOBILE_NO PHONE_NO CREDIT_LIMIT EMAIL ACCOUNT_MGR BIRTH_DT ENROLL_DT GENDER");
            System.out.println("============================================");

            while(rs.next()){
                String ID = rs.getString(1);
                //int empno = rs.getInt("empno"); 숫자 대신 컬럼 이름을 적어도 된다.
                String PWD = rs.getString(2);
                String NAME = rs.getString(3);
                String ZIPCODE = rs.getString(4);
                String ADDRESS1 = rs.getString(5);
                String ADDRESS2 = rs.getString(6);
                String MOBILE_NO = rs.getString(7);
                String PHONE_NO = rs.getString(8);
                int CREDIT_LIMIT = rs.getInt(9);
                String EMAIL = rs.getString(10);
                int ACCOUNT_MGR = rs.getInt(11);
                java.sql.Date BIRTH_DT = rs.getDate(12); 
                java.sql.Date ENROLL_DT = rs.getDate(13); 
                String GENDER = rs.getString(14);

                String result = ID +" "+ PWD +" "+ NAME +" "+ ZIPCODE +" "+ADDRESS1+" "+ADDRESS2+" "+MOBILE_NO+" "+PHONE_NO+" "+CREDIT_LIMIT+" "+EMAIL+" "+ACCOUNT_MGR+" "+BIRTH_DT+" "+ENROLL_DT+" "+GENDER;
                System.out.println(result);
            }

        } catch (SQLException sqle) {
            System.out.println("SELECT문에서 예외 발생");
            sqle.printStackTrace();

        }finally{
            // DB 연결을 종료한다.
            try{
                if ( rs != null ){rs.close();}   
                if ( pstm != null ){pstm.close();}   
                if ( conn != null ){conn.close(); }
            }catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }

        }
    }
    */    
}