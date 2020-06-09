package kr.ac.kopo.day17.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import kr.ac.kopo.util.FileClose;

class AAA implements AutoCloseable {

	@Override
	public void close() throws Exception {
	System.out.println("AAA클래스의 객체 close() 호출....");
		
	}
	
}

public class URLConnectionMain {

	public static void main(String[] args) {
		
//		FileOutputStream fos = null;
//		OutputStreamWriter osw = null;
//		BufferedWriter bw = null;
		
		try (
				FileOutputStream fos = new FileOutputStream("iotest/naver.html");
				OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
				BufferedWriter bw = new BufferedWriter(osw);
//				fos = new FileOutputStream("iotest/naver.html");
//				osw = new OutputStreamWriter(fos, "utf-8");
//				bw = new BufferedWriter(osw);
				//AAA는 내가 만든 클래스 이라서 autocloseable이 없지만 추상클래스 상속 받고 close 메소드 오버라이딩해서 사용하도록 1.7버전 이상의 try문에서 해줌
				AAA a = new AAA();
				)
		
		{
			
//			fos = new FileOutputStream("iotest/naver.html");
//			osw = new OutputStreamWriter(fos, "utf-8");
//			bw = new BufferedWriter(osw);
			
			URL urlObj = new URL("https://www.naver.com");
			//URLConnection자체로도 정보 받아오기 가능
			URLConnection uc = urlObj.openConnection();
			
//			System.out.println(uc.getContentType());
			// 파일이 크기 보기 수월 교수님꺼에는 파일 위치 찍혀있음
//			System.out.println(uc.getContentLength());
			//System.out.println(uc.getContent());
	
			
			// URL 객체의 전송정보를 iotest/naver.html에 저장 
			InputStream is = uc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String data = br.readLine(); // 리턴값 null
				if(data == null) break;
				System.out.println(data);
				bw.write(data);
				bw.newLine();
			}
			
			System.out.println("naver.html 저장 하였습니다.");
			
			FileClose.close(br);
			FileClose.close(is);
			FileClose.close(isr);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			FileClose.close(bw);
//			FileClose.close(osw);
//			FileClose.close(fos);
		}
		
	}
}

/*
try(
		괄호 안에서 생성한 객체는 try catch finally 에서도 사용 가능하고 
		close 메소드를 해준다. 
		생성가능한 객체는 = 오직 class선언되어있는 autocloseable이라는 인터페이스 상속 받은 녀셕들만 인스턴스 객체를 만들어줌
		선언 및 대입 초기화 해야함 괄호 안에서
		FileOutPutStream fos = new FileOutPutStream
		) {
} catch(
		) {
}
}
*/