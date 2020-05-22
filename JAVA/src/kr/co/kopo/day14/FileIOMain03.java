package kr.co.kopo.day14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//iotest/hokkaido.jpg ->iotest/hokkaido3.jpg 복사
// inputStream ->>>>>>>>>>>outputStream
//
/*
 * 
 * 작업순서
 * 1. Stream open - 객체 생성 
 * 2. 작업수행 read write
 * Stream close
 */

public class FileIOMain03 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 버퍼로 빠르게 할 예정
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			// 1단계
			fis = new FileInputStream("iotest/hokkaido.jpg");
			fos = new FileOutputStream("iotest/hokkaido3.jpg"); // 조심해야함 엇하는 순간 파일 정보가 사라짐!!!!!!!
			
			//fileter class인 BufferedInputStream BufferedOutputStream 객체생성
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos); // -> 버퍼로 읽은 데이터 버퍼로 쓰기 

			long start = System.currentTimeMillis();	
			// 2단계 작업수행 (read,write) - 소요시간 측정
			while (true) {

				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			long end = System.currentTimeMillis();
			
			
			System.out.println("복사가 완료 되었습니다.");
			System.out.println("소요시간 : " + (end-start)/1000. + "초");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 3단계 stream close 클로즈는 만든 순서의 역순으로

			if(bis != null) {
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			try {
				if (fis != null) {
					fis.close(); // 외부장치 연결 해제는 check exception
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
				if (fos != null) {
			try {
					fos.close();
				}

				catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}
}
