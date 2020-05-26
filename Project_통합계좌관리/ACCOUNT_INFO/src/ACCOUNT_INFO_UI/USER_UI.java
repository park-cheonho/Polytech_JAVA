package ACCOUNT_INFO_UI;

public class USER_UI extends USER_InputOutput_UI {

	private int choiceUserMenu() {
		System.out.println("---------------------------------");
		System.out.println("\t계좌 종합 관리 프로그램_ACCOUNT_INFO(DB)입니다. 메뉴를 선택하세요");
		System.out.println("---------------------------------");
		System.out.println("\t1. 로그인");
		System.out.println("\t2. 회원가입");
		System.out.println("\t0. 종료");
		System.out.println("---------------------------------");
		int type = scanInt("\t번호를 선택하세요 : ");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		while(true) {
			int type = choiceUserMenu();
			I_USER_Execute_UI ui = null;
			switch (type) {
			case 1:
				ui = new USER_Login_UI();
				break;
			case 2:
				ui = new USER_SignUp_UI();
				break;
			case 0:
				ui = new USER_Exit_UI();
				break;
			}
			
			if(ui != null) {
				ui.execute();
			}
		}
	}
}
