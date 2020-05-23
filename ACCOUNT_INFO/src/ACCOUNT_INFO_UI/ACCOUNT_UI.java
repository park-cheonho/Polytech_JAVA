package ACCOUNT_INFO_UI;

public class ACCOUNT_UI extends ACCOUNT_InputOutput_UI{

	private int choiceAccountMenu() {
		System.out.println("---------------------------------");
		System.out.println("\t계좌 종합 관리 프로그램_ACCOUNT_INFO(DB)입니다. 메뉴를 선택하세요");
		System.out.println("---------------------------------");
		System.out.println("\t1. 입금");
		System.out.println("\t2. 출금");
		System.out.println("\t3. 계좌이체(송금)");
		System.out.println("\t4. 내 전체 계좌 조회");
		System.out.println("\t5. 은행별 계좌조회");
		System.out.println("\t6. 내 계좌 번호로 계좌 조회");
		System.out.println("\t7. 계좌 별명 만들기");
		System.out.println("\t8. 계좌등록");
		System.out.println("\t9. 계좌삭제");
		System.out.println("\t0. 프로그램 종료");
		System.out.println("---------------------------------");
		int type = scanInt("\t번호를 선택하세요 : ");
		return type;
	}

	@Override
	public void execute() throws Exception {
		while(true) {
			int type = choiceAccountMenu();
			I_ACCOUNT_Execute_UI ui = null;
			switch (type) {
			case 1:
				ui = new ACCOUNT_Deposit_UI();
				break;
			case 2:
				ui = new ACCOUNT_Withdraw_UI();
				break;
			case 3:
				ui = new ACCOUNT_Remittance_UI();
				break;
			case 4:
				ui = new ACCOUNT_SelectAll_UI();
				break;
			case 5:
				ui = new ACCOUNT_SelectBank_UI();
				break;
			case 6:
				ui = new ACCOUNT_SelectAccountNumber_UI();
				break;
			case 7:
				ui = new ACCOUNT_AccountAlias_UI();
				break;
			case 8:
				ui = new ACCOUNT_Account_SignUp_UI();
				break;
			case 9:
				ui = new ACCOUNT_Account_Delete_UI();
				break;
			case 0:
				ui = new ACCOUNT_Exit_UI();
				break;
				
			}
			
			if(ui != null) {
				ui.execute();
			}
		
	}
	
	
}
}
