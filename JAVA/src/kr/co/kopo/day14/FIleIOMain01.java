package kr.co.kopo.day14;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FIleIOMain01 {

	public static void main(String[] args) {
		
		System.out.println("입력하세여. 종료는 ctrl + z 입니다."); // 일반적 상식 입니다.
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is); //-> 바이트 비이트 로 들어온거 캐릭터 캐릭터로 반환하려함
		try {
			while(true) {
				int c = isr.read();
				if(c == -1) break;
			System.out.print((char)c);
			}
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
}
		
/*
 * //안녕하세요가 짤리는 이유 -> 10바이트를 1바이트씩 짤라서 해석한 후 출력 //1바이트+1바이트를 하나의 문자로 인식하게 해야함
 * //바이트 두개 모아서 1글자로 인식하도록 -> 필터클래스 -> InputStreamReader InputStream is =
 * System.in; try { while(true) { int c = is.read(); if(c == -1) break; // -1은
 * contrl z System.out.print((char)c); // 아스키 코드값 반환 1310=엔터 윈도우는 \r\n=1310 } //
 * end of String 을 뭘로 할지 문서파일 보고 알아야함 } catch (Exception e) {
 * e.printStackTrace(); } } }
 */
