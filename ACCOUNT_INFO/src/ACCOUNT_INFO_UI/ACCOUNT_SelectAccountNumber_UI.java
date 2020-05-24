package ACCOUNT_INFO_UI;

import java.util.List;

import ACCOUNT_INFO_VO.ACCOUNT_VO;

public class ACCOUNT_SelectAccountNumber_UI extends ACCOUNT_InputOutput_UI{

	@Override
	public void execute() throws Exception {
		
		String account_number = scanStr("검색할 계좌번호를 입력하세요  : ");
		
		//////////////////////////////////////////////
		// DB에서 전체 계좌를 조회하는 서비스
		List<ACCOUNT_VO> list = accountService.selectAccountByNum(account_number);	
		//////////////////////////////////////////////

		System.out.println("--------------------------------------------------");
		System.out.println("예금주\t아이디\t계좌번호\t\t은행코드\t잔액\t은행명");
		System.out.println("--------------------------------------------------");
		if(list.isEmpty()) {
			System.out.println("\t등록된 계좌가 없습니다");
		} else {
			for(ACCOUNT_VO board : list) {
				System.out.println(board.getName() + "\t" + board.getId() + "\t"
						+ board.getAccount_number() + "\t\t" + board.getBank_code() 
						+ "\t" + (Integer.toString(board.getBalance())) + "\t" + board.getBank_name());
			}
		}
		System.out.println("--------------------------------------------------");
	}

}



