package ACCOUNT_INFO_UI;

import ACCOUNT_INFO_VO.USER_VO;

public class USER_Login_UI extends USER_InputOutput_UI {

	public static String loginUserName;
	public static String loginUserId;
	
	@Override
	public void execute() throws Exception {
		
		String id = scanStr("ID를 입력하세요 : ");
		String pwd = scanStr("비밀번호를 입력하세요 : ");
		
		//////////////////////////////////////////////////
		// 해당 게시물을 조회하는 서비스
		USER_VO login = usersService.login(id,pwd);
		//////////////////////////////////////////////////
		
		System.out.println("------------------------------------------------");
		//false
		if(login == null) {
			System.out.println("입력하신 [" + id + "와" + pwd + "] 를 확인해 주세요 ");
		} else {
			System.out.println("*********************************");
			System.out.println("\t"+login.getName()+"님 로그인 되었습니다.");
			System.out.println("*********************************");
			loginUserName = login.getName();
			loginUserId = login.getId();
			//System.out.println("\t아이디 : " + login.getId());
			//System.out.println("\t비밀번호 : " + login.getPwd());
			
			// 메인에서 ui 불러오듯 !! 여기서도
			ACCOUNT_UI ui = new ACCOUNT_UI();
			try {
				ui.execute();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("------------------------------------------------");
	}

	

	
}
