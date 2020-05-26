package ACCOUNT_INFO_SERVICE;

public class USERS_SEQ_SERVICE {

	private static int boardNo = 1;
	
	public static int getBoardSequence() {
		return boardNo++;
	}
}
