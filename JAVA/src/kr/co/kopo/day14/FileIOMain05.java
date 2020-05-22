package kr.co.kopo.day14;

import java.io.FileReader;
import java.io.FileWriter;

import kr.co.kopo.util.FileClose;

public class FileIOMain05 {

	
	//iotest/FileIOMain03.java --> iotest/FileIOMain03.java.txt 복사
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03.java.txt");
			
		while(true) {
			int c = fr.read();
			if(c == -1) break;
			fw.write(c);
			System.out.print((char)c);
		}
		fw.flush(); // 단방향 통신 속도 예츨 못함 동기화는 println
		
		System.out.println("복사가 완료되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(fr); // 파일리더 타입 한개
			FileClose.close(fw); // 파일라이터 타입 한개
			
			/*
			if(fr != null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		if(fw != null) {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			*/
	}
}
}
