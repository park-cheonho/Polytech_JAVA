package ACCOUNT_INFO_UI;

public class ACCOUNT_Account_Delete_UI extends ACCOUNT_InputOutput_UI{

	@Override
	public void execute() throws Exception {

		String no = scanStr("삭제할 계좌 번호를 입력하세요 : ");
		
		/////////////////////////////////////////////////////
		// DB에서 계좌를 삭제하는 서비스  
		
		/////////////////////////////////////////////////////
		
		System.out.println("계좌번호 [" + no + "]를 삭제 하였습니다");
	}

	
}
