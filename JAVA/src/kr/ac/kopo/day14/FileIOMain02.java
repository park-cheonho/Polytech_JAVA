package kr.ac.kopo.day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// iotest/Koala.jpg  --> iotest/Koala2.jpg 복사

/*
 	작업순서
 	1. Stream open
 	2. 작업 수행(read, write)
 	3. Stream close 
 */
public class FileIOMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 1단계 : stream open
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			long start = System.currentTimeMillis();
			
			// 2단계 : 작업수행(Read, Write)
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("복사가 완료되었습니다");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 3단계 : stream close
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}











