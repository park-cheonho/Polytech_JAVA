package ACCOUNT_INFO_UI;

import ACCOUNT_INFO_VO.ACCOUNT_VO;
import ACCOUNT_INFO_VO.USER_VO;

public class ACCOUNT_Account_SignUp_UI extends ACCOUNT_InputOutput_UI{

	@Override
	public void execute() throws Exception {
		int balance = 0;
		String bank_name = scanStr("등록할 은행을 입력하세요  : ");
		String bank_code = scanStr("은행 코드를 입력해주세요(현재 서비스 제공은행 : 하나은행 081, 신한은행088, 기업은행003, 국민은행004, 우리은행020) : ");
		String account_number = scanStr("등록할 계좌번호를 입력하세요 : ");
		String nick_name = scanStr("등록할 계좌 별칭을 입력하세요 : ");
		while (!(balance >= 1000)) {
			balance = scanInt("입금할 금액을 입력하세요(최소 1000원 이상) : ");
		}
		//String bank_code = scanStr("등록할 계좌번호를 입력하세요 : ");
		
		
		/////////////////////////////////////////////////////
		// DB에 계좌 정보를 저장하는 서비스
		
		ACCOUNT_VO account_signup = new ACCOUNT_VO();
		account_signup.setAccount_number(account_number);
		account_signup.setBank_code(bank_code);
		account_signup.setBank_name(bank_name);
		account_signup.setName(USER_Login_UI.loginUserName);
		account_signup.setId(USER_Login_UI.loginUserId);
		account_signup.setBalance(balance);
		account_signup.setNick_name(nick_name);
		
		accountService.account_signup(account_signup);
		/////////////////////////////////////////////////////

		System.out.println("계좌등록을 완료하였습니다.");

	}

	
}
