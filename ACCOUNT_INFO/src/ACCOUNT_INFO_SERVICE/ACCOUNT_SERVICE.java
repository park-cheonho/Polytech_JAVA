package ACCOUNT_INFO_SERVICE;

import java.util.List;

import ACCOUNT_INFO_DAO.ACCOUNT_DAO;
import ACCOUNT_INFO_VO.ACCOUNT_VO;
import ACCOUNT_INFO_VO.USER_VO;

public class ACCOUNT_SERVICE {


	private ACCOUNT_DAO accountDAO;

	public ACCOUNT_SERVICE() {
		accountDAO = new ACCOUNT_DAO();
	}

	public void account_signup(ACCOUNT_VO account_signup) {
		// 반환형 ACCOUNT_VO 필요 없음	
		accountDAO.account_signup(account_signup);
		//return account_signup;
	}
	public void delete(ACCOUNT_VO del) {
	// 반환형 ACCOUNT_VO 필요 없음	
		accountDAO.delete(del);
	}
	public List<ACCOUNT_VO> selectAllAccount() {
		// 반환형 List<ACCOUNT_VO>
		List<ACCOUNT_VO> list = accountDAO.selectAllAccount();
			return list;
		}
	public List<ACCOUNT_VO> selectAccountByNum(String account_number) {
		// 반환형 List<ACCOUNT_VO>
		List<ACCOUNT_VO> list = accountDAO.selectAccountByNum(account_number);
			return list;
		}
	public List<ACCOUNT_VO> selectAccountByBank(String bank_name) {
		// 반환형 List<ACCOUNT_VO>
		List<ACCOUNT_VO> list = accountDAO.selectAccountByBank(bank_name);
			return list;
		}
	public void account_nickname_change(ACCOUNT_VO account_nickname) {
		accountDAO.account_nickname_change(account_nickname);
	}
	
	public void balanceDeposit(ACCOUNT_VO deposit_account) {
		accountDAO.balanceDeposit(deposit_account);
		
	}

	public void balanceWithdraw(ACCOUNT_VO withdraw_account) {
		accountDAO.balanceWithdraw(withdraw_account);
		
	}

	//public void accountTransfer(ACCOUNT_VO transfer) {
	//	accountDAO.accountTransfer(transfer);
		
	//}

	public void accountTransfer(String withdraw_where, int money, String deposit_where) {
		accountDAO.accountTransfer(withdraw_where,money,deposit_where);
		
	}
	public void selectAccountOne(String deposit_where, String account_number) {
		accountDAO.selectAccountOne(deposit_where,account_number);
	}
	
	public ACCOUNT_VO selectAccountByNumOnlyOne(String account_number) {
			return accountDAO.selectAccountByNumOnlyOne(account_number);

	}


}



