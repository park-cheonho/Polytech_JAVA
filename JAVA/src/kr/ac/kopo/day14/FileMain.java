package kr.ac.kopo.day14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		
		boolean bool = dirObj.exists();
		System.out.println(bool ? "유효한 디렉토리입니다" : "유효하지 않는 디렉토리입니다");
		
		String[] list = dirObj.list();
		System.out.println("-----------------------------------");
		System.out.println("\t" + dirObj.getName() + " 디렉토리 정보");
		System.out.println("-----------------------------------");
		for(String element : list) {
			System.out.println(element);
		}
		System.out.println("-----------------------------------");
		
		File newDirObj = new File("iotest/하마");
		System.out.println(newDirObj.mkdir() ? "dir 생성 성공" : "dir 생성 실패");
		
		newDirObj = new File("iotest/새폴더/오리");
		System.out.println(newDirObj.mkdirs() ? "dir 생성 성공" : "dir 생성 실패");
		
//		newDirObj = new File("iotest/새폴더");
		bool = newDirObj.delete();
		System.out.println(bool ? "삭제성공" : "삭제실패");
		
		/*
		File fileObj = new File("iotest\\aaa.txt");
//		File fileObj = new File("C:\\Lecture\\java-workspace\\java\\iotest\\aaa.txt");
		
		String name = fileObj.getName();
		
		System.out.println("파일명 : " + name);
		System.out.println("parent : " + fileObj.getParent());
		System.out.println("path : " + fileObj.getPath());
		System.out.println("절대경로 : " + fileObj.getAbsolutePath());
		
		boolean bool = fileObj.isFile();
		System.out.println("isFile() : " + (bool ? "파일입니다" : "디렉토리입니다"));
		
		bool = fileObj.isDirectory();
		System.out.println("isDirectory() : " + (bool ? "디렉토리입니다" : "파일입니다"));
		
		bool = fileObj.exists();
		System.out.println(name + (bool ? " : 존재합니다" : " : 존재하지 않습니다"));
		
		long length = fileObj.length();
		System.out.println("파일 크기 : " + length + "byte(s)");
		
		long lastTime = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));
		
		bool = fileObj.canWrite();
		System.out.println(bool ? "쓰기 가능" : "쓰기 불가능");
		
		bool = fileObj.canRead();
		System.out.println(bool ? "읽기 가능" : "읽기 불가능");
		*/
	}
}












