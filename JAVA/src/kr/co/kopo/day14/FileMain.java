package kr.co.kopo.day14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {
	
	public static void main(String[] args) {
		
		File dirObj = new File("C:\\Lecture\\java-workspace\\java\\iotest");
		
		boolean bool = dirObj.exists();
		System.out.println(bool ? " 유효한 디렉토리 입니다." : "유효하지 않는 디렉토리 입니다");
		
		String[] list = dirObj.list();
		System.out.println("------------------------");
		System.out.println("\t" + dirObj.getName() + " 디렉토리 정보");
		System.out.println("------------------------");
		for(String element : list) {
			System.out.println(element);
		}
		System.out.println("------------------------");
		
		File newDirObj = new File("iotest/하마");
		System.out.println(newDirObj.mkdir() ? "dir성공" : "dir 실패"); // 실시간 연동 x f5
		
		
		//newDirObj = new File("iotest/새폴더/오리");
		//System.out.println(newDirObj.mkdir() ? "dir 생성 성공" : "dir 생성 실패"); // 이상황에서는 중간 경로는 못만듦
		
		newDirObj = new File("iotest/새폴더/오리");
		System.out.println(newDirObj.mkdirs() ? "dir 생성 성공" : "dir 생성 실패");
		
		newDirObj = new File("iotest/새폴더");
		bool = newDirObj.delete();
		System.out.println(bool ? "삭제 성공" : "삭제 실패");
		
		
		
		
		/*
		File fileObj = new File("iotest\\aaa.txt"); // 위치 현재 속한 프로젝트의 최상위 iotest\\aaa.txtdp 접근하려해
		//File fileObj = new File("C:\\Lecture\\java-workspace\\java\\iotest\\aaa.txt"); // 위치 현재 속한 프로젝트의 최상위 iotest\\aaa.txtdp 접근하려해
		
		String name = fileObj.getName();
		
		System.out.println("name : " + fileObj.getName());
		System.out.println("parent : " + fileObj.getParent());
		System.out.println("parent : " + fileObj.getPath());
		System.out.println("Ab parent : " + fileObj.getAbsolutePath());
		
		boolean bool = fileObj.isFile();
		System.out.println(bool ? "파일입니다" : "디렉토리입니다");
		
		bool = fileObj.isDirectory();
		System.out.println(bool ? "디렉토리입니다" : "파일입니다");
		
		bool = fileObj.exists();
		System.out.println(name + (bool ? " : 존재합니다 " : " : 존재하지 않습니다"));
		
		long length = fileObj.length();
		System.out.println("파일크기 : " + length + "byte(s)");
		
		long lastTime = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));
		
		bool = fileObj.canWrite();
		System.out.println(bool ? "쓰기가능" : "쓰기 불가능");
		
		bool = fileObj.canRead();
		System.out.println(bool ? "읽.가" : "읽불가");
		*/
		
	}

}
