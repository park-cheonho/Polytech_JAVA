package kr.co.ch.day07.homework;
/**
 * 
 * @author cheonho
 * 1. 입력값에 따라 다음과 같은 출력이 나오도록 해당 char 의 개수를 리턴하는 checkChar 메소드를 작성하시오
 * 문자열의 각 내용들을 비교하여 입력 받는 char c 의 값과 동일한 char 의 개수를 리턴 한다
 * 대소문자 구별하여 비교한다
 * 2. 주어진 문자열에서 특정 문자를 제거하는 String removeChar 메소드 작성
 */
public class StringUtil {
	
	public static int checkChar(String strData , char ch) {
		int cnt = 0; // 몇게인지 반환하기 위한 변수
		for(int i = 0; i < strData.length(); i++) {
			if(ch == strData.charAt(i)) { //문자열의 인덱스를 문자로 반환해서 입력된 ch와 같으면 리턴할 int cnt 증가
				cnt++;
			}
		}
		return cnt;
	}

	public static String removeChar(String oriStr , char delChar) {
		String char_remove = ""; // 삭제하고 공백?아무것도 안쓰기 위한 변수
		
		for(int i = 0; i < oriStr.length(); i++) { // 문자열의 인덱스를 문자로 반환해서 제거할 문자와 같지 않으면 
			if(delChar != oriStr.charAt(i)) { // //같지 않으면 빈칸 + 원래 문자열
				char_remove += oriStr.charAt(i);
			}
		}
		return char_remove; // 
	}
}
