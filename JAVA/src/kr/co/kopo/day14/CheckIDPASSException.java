package kr.co.kopo.day14;

public class CheckIDPASSException extends Exception {

	private static String [] errMsg = {"", "아이디가 올바르지 않습니다", "패스워스가 잘못되었습니다"};
	
	public CheckIDPASSException() {
	}

	public CheckIDPASSException(String message) {
		super(message);
	}

	public CheckIDPASSException(int errorCode) {
		this(errMsg[errorCode]);
	}

}
