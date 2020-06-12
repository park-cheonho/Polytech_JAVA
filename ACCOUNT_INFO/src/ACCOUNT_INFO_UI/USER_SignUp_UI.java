package ACCOUNT_INFO_UI;

import ACCOUNT_INFO_SERVICE.USERS_SERVICE;
import ACCOUNT_INFO_VO.USER_VO;

public class USER_SignUp_UI extends USER_InputOutput_UI{

	@Override
	public void execute() throws Exception {

		while (true) {
			String id = scanStr("등록할 아이디를 입력하세요 : ");

			String munbok = usersService.checkId(id);

			if(munbok == null) {
				System.out.println("사용가능한 아이디 입니다.");

				String password = scanStr("등록할 비밀번호를 입력하세요 : ");		
				String name = scanStr("본인의 성함을 입력하세요 : ");		


				/////////////////////////////////////////////////////
				// DB에 아이디, 비밀번호, 이름을 저장하는 서비스
				USER_VO signup = new USER_VO();
				signup.setId(id);
				signup.setPwd(password);
				signup.setName(name);


				usersService.signup(signup);
				/////////////////////////////////////////////////////

				System.out.println("회원가입을 완료하였습니다.");
				break;
			}else {
				System.out.println("중복된 아이디 입니다.");
			}
		}
	}
}
