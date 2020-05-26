package ACCOUNT_INFO_SERVICE;

public class ACCOUNT_SERVICE_FACTORY {

	private static ACCOUNT_SERVICE service = null;

	public static ACCOUNT_SERVICE getACCOUNT_SERVICE() {
		
		if(service == null) {
			service = new ACCOUNT_SERVICE();
		}
		
		return service;
	}
}
