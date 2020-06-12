package kr.co.ch.day14.homework;

import java.io.File;
import java.util.Scanner;

public class FolderRename {

	public void re() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 수정할 폴더 이름을 입력하세요 : ");
		String ans = sc.nextLine();
		File reDir = new File(FolderView.path+"\\"+ans);
		System.out.println(reDir.renameTo(reDir) ?  ans+"가 수정되었습니다." : "파일명을 입력을 해주세요");	
	}
}
