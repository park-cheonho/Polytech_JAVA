package ACCOUNT_INFO_SERVICE;

import ACCOUNT_INFO_DAO.ACCOUNT_DAO;
import ACCOUNT_INFO_VO.ACCOUNT_VO;
import ACCOUNT_INFO_VO.USER_VO;

public class ACCOUNT_SERVICE {

	
	private ACCOUNT_DAO accountDAO;
	
	public ACCOUNT_SERVICE() {
		accountDAO = new ACCOUNT_DAO();
	}
	
	public ACCOUNT_VO a(String id, String password) {
		
		ACCOUNT_VO a = accountDAO.abc(id, password);
		return a;
	}
		
}
