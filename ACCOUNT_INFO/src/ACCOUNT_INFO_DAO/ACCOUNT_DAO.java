package ACCOUNT_INFO_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import ACCOUNT_INFO_UI.USER_Login_UI;
import ACCOUNT_INFO_UTIL.ConnectionFactory;
import ACCOUNT_INFO_UTIL.JDBCClose;
import ACCOUNT_INFO_VO.ACCOUNT_VO;



public class ACCOUNT_DAO {

	private Connection conn;
	private PreparedStatement pstmt;

	/**
	 * 새로운 은행과 계좌번호이름 등록하는 기능
	 */
	public void account_signup(ACCOUNT_VO account_signup) {

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("insert into ACCOUNT(BANK_NAME, ACCOUNT_NUMBER, NAME, ID, BALANCE, BANK_CODE, NICKNAME) ");
			sql.append(" values(?,?,?,?,?,?,?) ");


			pstmt = conn.prepareStatement(sql.toString());
			String bank_name = account_signup.getBank_name();
			String account_number = account_signup.getAccount_number();
			String name = account_signup.getName();
			String id = account_signup.getId();
			int balance = account_signup.getBalance();
			String bank_code = account_signup.getBank_code();
			String nick_name = account_signup.getNick_name();

			//String name = signup.getName();
			pstmt.setString(1, bank_name);
			pstmt.setString(2, account_number);
			pstmt.setString(3, name);
			pstmt.setString(4, id);
			pstmt.setInt(5, balance);
			pstmt.setString(6, bank_code);
			pstmt.setString(7, nick_name);
			//pstmt.setString(3, a);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	/**
	 * 계좌번호를 삭제하는 기능
	 */
	public void delete(ACCOUNT_VO del) {

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("delete from  ACCOUNT ");
			sql.append(" where ACCOUNT_NUMBER = ? and ID = ? ");


			pstmt = conn.prepareStatement(sql.toString());

			String account_number = del.getAccount_number();
			String id = USER_Login_UI.loginUserId;

			//String name = signup.getName();
			pstmt.setString(1, account_number);
			pstmt.setString(2, id);


			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

	}
	/**
	 * 내 전체계좌를 조회하는 기능
	 */
	public List<ACCOUNT_VO> selectAllAccount() {

		List<ACCOUNT_VO> list = new ArrayList<>();

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("select * ");
			sql.append("  from ACCOUNT ");
			sql.append("  where name = ? ");

			pstmt = conn.prepareStatement(sql.toString());
			String name = USER_Login_UI.loginUserName;
			pstmt.setString(1, name);

			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {

				int balance = rs.getInt("balance");
				String id = rs.getString("id");
				name = rs.getString("name");
				String account_number = rs.getString("account_number");
				String bank_code = rs.getString("bank_code");
				String bank_name = rs.getString("bank_name");
				String nick_name = rs.getString("nickname");

				ACCOUNT_VO board = new ACCOUNT_VO(name, id, account_number, balance, bank_code, bank_name, nick_name );

				list.add(board);		

			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

		return list;
	}


	/**
	 * 입력한 계좌번호로 계좌를 조회하는 기능
	 */

	public List<ACCOUNT_VO> selectAccountByNum(String account_number) {
		List<ACCOUNT_VO> list = new ArrayList<>();

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("select * ");
			sql.append("  from ACCOUNT ");
			sql.append("  where account_number = ? and name = ?");

			pstmt = conn.prepareStatement(sql.toString());
			String name = USER_Login_UI.loginUserName;
			pstmt.setString(1, account_number);
			pstmt.setString(2, name);

			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {

				int balance = rs.getInt("balance");
				String id = rs.getString("id");
				name = rs.getString("name");
				account_number = rs.getString("account_number");
				String bank_code = rs.getString("bank_code");
				String bank_name = rs.getString("bank_name");
				String nick_name = rs.getString("nickname");

				ACCOUNT_VO board = new ACCOUNT_VO(name, id, account_number, balance, bank_code, bank_name, nick_name );

				list.add(board);		

			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

		return list;
	}

	/**
	 * 입력한 은행의  계좌를 조회하는 기능
	 */

	public List<ACCOUNT_VO> selectAccountByBank(String bank_name) {
		List<ACCOUNT_VO> list = new ArrayList<>();

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("select * ");
			sql.append("  from ACCOUNT ");
			sql.append("  where bank_name = ? and name = ?");

			pstmt = conn.prepareStatement(sql.toString());
			String name = USER_Login_UI.loginUserName;
			pstmt.setString(1, bank_name);
			pstmt.setString(2, name);

			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {

				int balance = rs.getInt("balance");
				String id = rs.getString("id");
				name = rs.getString("name");
				String account_number = rs.getString("account_number");
				String bank_code = rs.getString("bank_code");
				bank_name = rs.getString("bank_name");
				String nick_name = rs.getString("nickname");

				ACCOUNT_VO board = new ACCOUNT_VO(name, id, account_number, balance, bank_code, bank_name, nick_name );

				list.add(board);		

			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

		return list;
	}

	/**
	 * 계좌 번호로 계좌를 선택하여 계좌 별명 수정하기
	 */

	public void account_nickname_change(ACCOUNT_VO account_nickname) {

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("update ACCOUNT ");
			sql.append(" set NICKNAME = ?  ");
			sql.append(" where ID = ? and ACCOUNT_NUMBER = ? ");


			pstmt = conn.prepareStatement(sql.toString());

			String nick_name = account_nickname.getNick_name();
			String id = USER_Login_UI.loginUserId;
			String account_number = account_nickname.getAccount_number();

			//String name = signup.getName();
			pstmt.setString(1, nick_name);
			pstmt.setString(2, id);
			pstmt.setString(3, account_number);


			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}

	/**
	 * 계좌에 입금하는 기능
	 */
	public void balanceDeposit(ACCOUNT_VO deposit_account) {
		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append(" UPDATE ACCOUNT SET ");
			sql.append(" BALANCE = BALANCE + ?  ");
			sql.append(" WHERE ACCOUNT_NUMBER = ? and BANK_NAME = ? ");


			pstmt = conn.prepareStatement(sql.toString());

			int addBalance = deposit_account.getBalance();
			String account_number = deposit_account.getAccount_number();
			String bank_name = deposit_account.getBank_name();


			//String name = signup.getName();
			pstmt.setInt(1, addBalance);
			pstmt.setString(2, account_number);
			pstmt.setString(3, bank_name);


			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

	}

	/**
	 * 계좌에서 출금하는 기능
	 */

	public void balanceWithdraw(ACCOUNT_VO withdraw_account) {

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append(" UPDATE ACCOUNT SET ");
			sql.append(" BALANCE = BALANCE - ?  ");
			sql.append(" WHERE ACCOUNT_NUMBER = ? and BANK_NAME = ? ");


			pstmt = conn.prepareStatement(sql.toString());

			int withdrawBalrance = withdraw_account.getBalance();
			String account_number = withdraw_account.getAccount_number();
			String bank_name = withdraw_account.getBank_name();


			//String name = signup.getName();
			pstmt.setInt(1, withdrawBalrance);
			pstmt.setString(2, account_number);
			pstmt.setString(3, bank_name);


			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}	

	}

	/**
	 * 다른 계좌로 송금하는 기능
	 */
	public void accountTransfer(String withdraw_where, int money, String deposit_where) {

		try {
			conn = new ConnectionFactory().getConnection();
			conn.setAutoCommit(false);
			//이체는 트랜잭션이다 그래서 우리가 기본 세팅인 
			// true값을 false로 바꾸자 그래야 중간에 사고가 나도 commit이 안된다.

			StringBuilder sql = new StringBuilder();

			sql.append("UPDATE ACCOUNT SET BALANCE = BALANCE - ? WHERE ACCOUNT_NUMBER = ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, money);
			pstmt.setString(2, withdraw_where);

			pstmt.executeUpdate();
			//출금을 먼저 진행 합시다.

			pstmt.clearParameters(); // pstmt 객체를 다시 사용하기 위한 작업
			sql.setLength(0);		// sql을 다시 사용하기 위한 작업

			sql.append("UPDATE ACCOUNT SET BALANCE = BALANCE + ? WHERE ACCOUNT_NUMBER = ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, money);
			pstmt.setString(2, deposit_where);

			pstmt.executeUpdate();

			conn.commit();
			System.out.println("계좌이체를 완료했습니다");
		} catch(SQLIntegrityConstraintViolationException se) {
			System.out.println("잔액이 부족합니다");
		} catch(Exception e) {
			//conn.rollback();
		} finally {
			//conn.setAutoCommit(false);
			JDBCClose.close(conn, pstmt);

		}
	}

}








