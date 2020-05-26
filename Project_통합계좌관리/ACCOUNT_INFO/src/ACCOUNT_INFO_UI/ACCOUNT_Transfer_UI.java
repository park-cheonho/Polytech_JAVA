package ACCOUNT_INFO_UI;

import java.util.Scanner;

import ACCOUNT_INFO_VO.ACCOUNT_VO;

public class ACCOUNT_Transfer_UI extends ACCOUNT_InputOutput_UI{

	@Override
	public void execute() throws Exception {

		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("출금할 계좌번호를 입력하세요 : ");
			String withdraw_where = sc.nextLine();

			ACCOUNT_VO withdraw_where_num = accountService.selectAccountByNumOnlyOne(withdraw_where);  

			if(withdraw_where_num == null) {
				System.out.println("출금할 계좌번호가 올바르지 않습니다.");
			} else {

				System.out.println("출금할 금액를 입력하세요 : ");
				int money = 0;
				while(true) {
					money = sc.nextInt();
					sc.nextLine();
					if(money>0) {
						break;			
					}
					System.out.println("0원 이하의 금액은 보낼수 없습니다.");
				}

				while(true) {
					System.out.println("입금할 계좌번호를 입력하세요 : ");
					String deposit_where = sc.nextLine();

					ACCOUNT_VO deposit_where_num = accountService.selectAccountByNumOnlyOne(deposit_where);  
					if(deposit_where_num == null) {
						System.out.println("입금할 계좌 확인");
					} else {
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
						break;
					}

				}
				break;
			}
		}
	}
}