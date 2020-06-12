package ACCOUNT_INFO_SERVICE;

public class USERS_SERVICE_FACTORY {

	private static USERS_SERVICE service = null;

	public static USERS_SERVICE getUSERS_SERVICE() {
		
		if(service == null) {
			service = new USERS_SERVICE();
		}
		
		return service;
	}
	
	
}
