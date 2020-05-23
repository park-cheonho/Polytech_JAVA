package ACCOUNT_INFO;

import ACCOUNT_INFO_UI.USER_UI;

public class ACCOUNT_INFO_MAIN {

	
	public static void main(String[] args) {
	
		USER_UI ui = new USER_UI();
		try {
			ui.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
