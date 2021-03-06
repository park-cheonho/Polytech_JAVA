package ACCOUNT_INFO_UI;

import ACCOUNT_INFO_VO.ACCOUNT_VO;

public class ACCOUNT_Withdraw_UI extends ACCOUNT_InputOutput_UI{

	@Override
	public void execute() throws Exception {

		String bank_name = scanStr("출금하실 은행명을 입력해 주세요 : "); 

		while(true) {
			String account_number = scanStr("출금하실 계좌 번호를 입력해 주세요 : "); 

			ACCOUNT_VO account = accountService.selectAccountByNumOnlyOne(account_number);

			if(account == null) {

				System.out.println("없는 계좌 번호 입니다. 다시 확인해주세요.");

			}else {

				int withdrawBalrance  = scanInt("출금하실 금액을 입력해 주세요 : "); 

				/////////////////////////////////////////////////////
				// DB에 출금 금액을 저장하는 서비스
				ACCOUNT_VO withdraw_account = new ACCOUNT_VO();
				withdraw_account.setBank_name(bank_name);
				withdraw_account.setAccount_number(account_number);
				// 출금으로 만든 변수 입력 하기 위해
				withdraw_account.setBalance(withdrawBalrance);


				accountService.balanceWithdraw(withdraw_account);
				/////////////////////////////////////////////////////

				//System.out.println(bank_name + "의 " + account_number + "에서" + withdrawBalrance + "를 출금합니다.");
				break;
			}


		}

	}
}
