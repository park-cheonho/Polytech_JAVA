package ACCOUNT_INFO_SERVICE;

import ACCOUNT_INFO_DAO.USERS_DAO;
import ACCOUNT_INFO_VO.USER_VO;

public class USERS_SERVICE {

	private USERS_DAO userDAO;
	
	public USERS_SERVICE() {
		userDAO = new USERS_DAO();
	}
	
	public USER_VO login(String id, String password) {
		
		USER_VO user = userDAO.login(id, password);
		return user;
	}
	
	public void signup(USER_VO signup) {
		
		userDAO.signup(signup);
		//return signup;
	}
	
}
