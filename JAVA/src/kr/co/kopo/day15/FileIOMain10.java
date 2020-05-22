package kr.co.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileIOMain10 {

	private static List<UserVo> list;
	
	public static void write() {
		
		list = new ArrayList<>();
		
		list.add(new UserVo("홍길동",25,"010-1111-2222","서울시 서초구"));
		list.add(new UserVo("윤길동",30,"010-3333-4444","경기도 성남시 분당구"));
		list.add(new UserVo("강길동",29,"010-5555-6666","경기도 광명시"));
		list.add(new UserVo("최길동",42,"010-7777-8888","서울시 동작구"));
	
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			 fos = new FileOutputStream("iotest/user_list.txt");
			 oos = new ObjectOutputStream(fos);
			 
			 for(int i =0; i < list.size(); i++) {
				 oos.writeObject(list.get(i)); //묵시적 형변환 				 
			 }
			 
			 System.out.println("저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
		
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/user_list.txt");
			ois = new ObjectInputStream(fis);
			
			for(int i =0; i < list.size(); i++) {
				UserVo user = (UserVo)ois.readObject();
				System.out.println(user);
			}
			System.out.println("로드완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void main(String[] args) {
		write();
		read();
	}
}
