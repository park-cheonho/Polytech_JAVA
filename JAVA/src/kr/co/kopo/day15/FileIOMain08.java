package kr.co.kopo.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

import kr.co.kopo.util.FileClose;

public class FileIOMain08 {

	public static void write() {
		UserInfo user = new UserInfo("홍길동",25,"경기도 광명시");
		System.out.println(user);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("iotest/userInfo.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(user.getName()+":"+user.getAge()+":"+user.getAddr());
			bw.newLine();
			bw.flush();
			
			System.out.println("userInfo.txt에 저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bw, fw);
		}
	}
	public static void read() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			UserInfo user = null;
			fr = new FileReader("iotest/userInfo.txt");
			br = new BufferedReader(fr);
			
			String data = br.readLine();
			String[] dataArr = data.split(":");
			
			//System.out.println(Arrays.toString(dataArr));
			String name = dataArr[0];
			int age = Integer.parseInt(dataArr[1]);
			String addr = dataArr[0];
			user = new UserInfo(name, age, addr);
			
			System.out.println("userInfo.txt 로드완료");
			
			System.out.println(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br,fr);
		}
	}
	
	public static void main(String[] args) {
		
		//write();
		read();
	}
}
