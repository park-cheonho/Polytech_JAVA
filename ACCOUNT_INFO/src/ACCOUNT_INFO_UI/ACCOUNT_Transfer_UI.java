package ACCOUNT_INFO_UI;

import java.util.Scanner;

import ACCOUNT_INFO_VO.ACCOUNT_VO;

public class ACCOUNT_Transfer_UI extends ACCOUNT_InputOutput_UI{

	@Override
	public void execute() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출금할 계좌번호를 입력하세요 : ");
		String withdraw_where = sc.nextLine();
		
		System.out.println("출금할 금액를 입력하세요 : ");
		int money = sc.nextInt();
		sc.nextLine();

		System.out.println("입금할 계좌번호를 입력하세요 : ");
		String deposit_where = sc.nextLine();
		
		/*
		/////////////////////////////////////////////////////
		// DB에 계좌이체 내역을 저장하는 서비스
		ACCOUNT_VO Transfer = new ACCOUNT_VO();
		Transfer.setAccount_number(withdraw_where);
		Transfer.setBalance(move);
		//입금할 계좌 번호가 스트링형이다 놀고 있는 스트링형을 사용한다. 출금계좌번호가 
		// set계좌번호를 잡아 있어서
		Transfer.setBank_code(deposit_where);
		*/
		
		accountService.accountTransfer(withdraw_where,money,deposit_where);
		
		System.out.println("");
	}

	
}
