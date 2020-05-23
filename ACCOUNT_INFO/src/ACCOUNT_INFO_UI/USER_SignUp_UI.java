package ACCOUNT_INFO_UI;

import ACCOUNT_INFO_SERVICE.USERS_SERVICE;
import ACCOUNT_INFO_VO.USER_VO;

public class USER_SignUp_UI extends USER_InputOutput_UI{

	@Override
	public void execute() throws Exception {
		
		String id = scanStr("등록할 아이디를 입력하세요 : ");
		String password = scanStr("등록할 비밀번호를 입력하세요 : ");		
	
		/////////////////////////////////////////////////////
		// 메모리 or file or DB에 게시물을 저장하는 서비스
		USER_VO signup = new USER_VO();
		signup.setId(id);
		signup.setPwd(password);

		usersService.signup(signup);
		/////////////////////////////////////////////////////
	
		System.out.println("회원가입을 완료하였습니다.");
	}

	
}
