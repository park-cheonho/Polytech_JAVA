package ACCOUNT_INFO_UI;

import ACCOUNT_INFO_VO.ACCOUNT_VO;

public class ACCOUNT_Deposit_UI extends ACCOUNT_InputOutput_UI{

	@Override
	public void execute() throws Exception {
		
		String bank_name = scanStr("입금하실 은행명을 입력해 주세요 : "); 
		String account_number = scanStr("입금하실 계좌 번호를 입력해 주세요 : "); 
		int addBalrance  = scanInt("입금하실 금액을 입력해 주세요 : "); 
		
		/////////////////////////////////////////////////////
		// DB에 입금 금액을 저장하는 서비스
		ACCOUNT_VO deposit_account = new ACCOUNT_VO();
		deposit_account.setBank_name(bank_name);
		deposit_account.setAccount_number(account_number);
		// 입금으로 만든 변수 입력 하기 위해
		deposit_account.setBalance(addBalrance);
		
		accountService.balanceDeposit(deposit_account);
		/////////////////////////////////////////////////////
		
		System.out.println(bank_name + "의 " + account_number + "로" + addBalrance + "를 입금합니다.");

	}

	
}
