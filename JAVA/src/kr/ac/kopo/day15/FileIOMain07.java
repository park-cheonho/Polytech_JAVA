package kr.ac.kopo.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

/*
 	콘솔에서 명령어를 입력하여 원본파일을 대상파일에 저장하는 프로그램
 	$ java  FileIOMain07   aaa.txt   bbb.txt
 */

public class FileIOMain07 {

	public static void main(String[] args) {
		
		if(args.length < 2) {
			
			System.out.println("명령구문이 잘못되었습니다");
			System.out.println("사용법 : java FileIOMain07  원본파일명   대상파일명");
			System.exit(0);
		}
		
//		System.out.println(Arrays.toString(args));
		
		File oriFile = new File(args[0]);
		if(!oriFile.exists()) {
			System.out.println("[" + args[0] + "]파일이 존재하지 않습니다");
			System.exit(0);
		}
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
//			fr = new FileReader(args[0]);
			fr = new FileReader(oriFile);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(args[1]);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			bw.flush();
			
			System.out.printf("[%s] -> [%s] 복사완료\n", args[0], args[1]);
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("[" + args[0] + "]파일이 존재하지 않습니다");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
			FileClose.close(bw, fw);
		}
	}
}

















