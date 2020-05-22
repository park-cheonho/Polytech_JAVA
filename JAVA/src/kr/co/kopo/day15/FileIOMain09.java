package kr.co.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.co.kopo.util.FileClose;

public class FileIOMain09 {

	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 25, "경기도 광명시");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
		 fos = new FileOutputStream("iotest/object_user.txt");
		 oos = new ObjectOutputStream(fos);
		 
		 oos.writeObject(user); //묵시적 형변환 
		 
		 System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void main(String[] args) {
		
		write();
		//read();
	}
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object_user.txt");
			ois = new ObjectInputStream(fis);
			
			UserInfo user = (UserInfo)ois.readObject();//반환형이 오브젝트니까 명시적으로 형변환해줘야함 UserInfo의 리턴형인?
			
			System.out.println("로드완료");
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	}

