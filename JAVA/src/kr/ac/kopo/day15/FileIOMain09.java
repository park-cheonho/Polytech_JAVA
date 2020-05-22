package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIOMain09 {

	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 25, "경기도 광명시");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("iotest/object_user.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			
			System.out.println("저장완료...");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object_user.txt");
			ois = new ObjectInputStream(fis);
			
			UserInfo user = (UserInfo)ois.readObject();
			
			System.out.println("로드 완료...");
			System.out.println(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public static void main(String[] args) {
	
//		write();
		read();
		
	}
}










