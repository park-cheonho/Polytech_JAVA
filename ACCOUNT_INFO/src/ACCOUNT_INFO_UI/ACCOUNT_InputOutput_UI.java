package ACCOUNT_INFO_UI;

import java.util.Scanner;

import ACCOUNT_INFO_SERVICE.ACCOUNT_SERVICE;
import ACCOUNT_INFO_SERVICE.ACCOUNT_SERVICE_FACTORY;

public abstract class ACCOUNT_InputOutput_UI implements I_ACCOUNT_Execute_UI {

	private Scanner sc;
	protected ACCOUNT_SERVICE accountService;
	//protected String userId;
	//protected String userName;


	public ACCOUNT_InputOutput_UI() {
		sc = new Scanner(System.in);
		accountService = ACCOUNT_SERVICE_FACTORY.getACCOUNT_SERVICE();
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
