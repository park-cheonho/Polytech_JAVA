package kr.co.kopo.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.co.kopo.util.FileClose;

public class FileIOMain06 {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03-1.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(fw);
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				pw.println(str);
			}
			pw.flush();
/*			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				bw.newLine(); //엔터문제 해결 <- bw.write(str);
			}
			bw.flush();
*/			
			/*
			while(true) {
				int c = br.read();
				if(c == -1) break;
				bw.write(c);
			}
			bw.flush();
			*/
			System.out.println("복사완료...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, bw);
			FileClose.close(fr, fw);
			FileClose.close(pw);
			
//			FileClose.close(br, fr);
//			FileClose.close(bw, fw);
			
//			FileClose.close(br);
//			FileClose.close(bw);
//			FileClose.close(fr);
//			FileClose.close(fw);
		}
	}
}
