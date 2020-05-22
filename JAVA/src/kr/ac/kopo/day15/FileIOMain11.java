package kr.ac.kopo.day15;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileIOMain11 {

	public static void write() {
		
		List<UserVO> list = new ArrayList<>();
		
		list.add(new UserVO("홍길동", 25, "010-1111-2222", "서울시 서초구"));
		list.add(new UserVO("윤길동", 30, "010-3333-4444", "경기도 성남시 분당구"));
		list.add(new UserVO("강길동", 29, "010-5555-6666", "경기도 광명시"));
		list.add(new UserVO("최길동", 42, "010-7777-8888", "서울시 동작구"));
	
		FileOutputStream 	fos = null;
		ObjectOutputStream 	oos = null;
		try {
			fos = new FileOutputStream("iotest/object_userList.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			System.out.println("저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		List<UserVO> list = null;
		
		try {
			
			fis = new FileInputStream("iotest/object_userList.txt");
			ois = new ObjectInputStream(fis);
			
			list = (List<UserVO>)ois.readObject();
			
			System.out.println("로드완료...");
			
			for(UserVO user : list) {
				System.out.println(user);
			}
			
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








