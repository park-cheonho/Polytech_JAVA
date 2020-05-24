package ACCOUNT_INFO_UI;

import ACCOUNT_INFO_VO.ACCOUNT_VO;

public class ACCOUNT_Account_Delete_UI extends ACCOUNT_InputOutput_UI{

	@Override
	public void execute() throws Exception {

		String account_number = scanStr("삭제하실 계좌번호를 입력하세요 : ");
		
		/////////////////////////////////////////////////////
		// DB에서 계좌를 삭제하는 서비스  
		ACCOUNT_VO del = new ACCOUNT_VO();
		del.setAccount_number(account_number);
		accountService.delete(del);
		/////////////////////////////////////////////////////
		
		System.out.println("계좌번호 [" + account_number + "]를 삭제 하였습니다");
	}

	
}
