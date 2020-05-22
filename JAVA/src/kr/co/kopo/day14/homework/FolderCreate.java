package kr.co.kopo.day14.homework;

import java.io.File;
import java.util.Scanner;

public class FolderCreate {

	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("폴더 이름을 입력하세요 : ");
		String ans = sc.nextLine();
		File newDir = new File(FolderView.path+"\\"+ans);
		System.out.println(newDir.mkdir() ?  ans+"가 생성되었습니다." : "파일명을 입력을 해주세요");	
	}
}
