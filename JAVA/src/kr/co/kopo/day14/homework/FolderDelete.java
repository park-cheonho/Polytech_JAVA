package kr.co.kopo.day14.homework;

import java.io.File;
import java.util.Scanner;

public class FolderDelete {

	public void del() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 폴더 이름을 입력하세요 : ");
		String ans = sc.nextLine();
		File delDir = new File(FolderView.path+"\\"+ans);
		System.out.println(delDir.delete() ?  ans+"가 삭제되었습니다." : "파일명을 입력을 해주세요");	
	}
}
