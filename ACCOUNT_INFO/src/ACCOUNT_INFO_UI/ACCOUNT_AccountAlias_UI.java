package ACCOUNT_INFO_UI;

import ACCOUNT_INFO_VO.ACCOUNT_VO;

public class ACCOUNT_AccountAlias_UI extends ACCOUNT_InputOutput_UI{

	@Override
	public void execute() throws Exception {

		String account_number = scanStr("수정할 계좌 번호를 입력해주세요 : ");
		String nick_name = scanStr("계좌의 별칭을 입력해주세요 : ");
		
		/////////////////////////////////////////////////////
		// 계좌를 지정해서 계좌의 별칭을 수정하는 서비스
		ACCOUNT_VO account_nickname = new ACCOUNT_VO();
		
		account_nickname.setNick_name(nick_name);
		
		accountService.account_nickname_change(account_nickname);
		
		
		/////////////////////////////////////////////////////
		
		System.out.println("입력하신 계좌변호의 별칭이 수정 되었습니다. ");
	}

	
}
