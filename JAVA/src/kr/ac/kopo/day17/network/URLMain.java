package kr.ac.kopo.day17.network;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) {
		try {
			URL urlObj = new URL("https://www.naver.com");			
//			URL urlObj = new URL("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%84%9C%EB%B8%8C%EC%9B%A8%EC%9D%B4");			
		
			System.out.println("프로토콜 : " + urlObj.getProtocol());
			System.out.println("호스트 이름 : " + urlObj.getHost());
			System.out.println("포트 이름 : " + urlObj.getPort());
			System.out.println("경로 : " + urlObj.getPath());
			System.out.println("쿼리 : " + urlObj.getQuery());
			// 쿼리는 ? 뒤에 있는 주소
			
			
			System.out.println("-------------------------------------------------------------");
			
			InputStream is = urlObj.openStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			// 현재는 자주 안씀 
			//InputStreamReader isr = new InputStreamReader(is, "euc-kr");
			// 네이버
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
