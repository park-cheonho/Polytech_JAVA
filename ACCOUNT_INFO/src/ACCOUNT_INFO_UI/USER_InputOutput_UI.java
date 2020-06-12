package ACCOUNT_INFO_UI;

import java.util.Scanner;

import ACCOUNT_INFO_SERVICE.USERS_SERVICE;
import ACCOUNT_INFO_SERVICE.USERS_SERVICE_FACTORY;

public abstract class USER_InputOutput_UI implements I_USER_Execute_UI{

	private Scanner sc;
	protected USERS_SERVICE usersService;

	public USER_InputOutput_UI() {
		sc = new Scanner(System.in);
		usersService = USERS_SERVICE_FACTORY.getUSERS_SERVICE();
	}
	
	protected int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
}
