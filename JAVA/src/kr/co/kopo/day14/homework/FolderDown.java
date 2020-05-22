package kr.co.kopo.day14.homework;

import java.io.File;
import java.util.Scanner;

public class FolderDown {
// 교수님 다운이..너무 어렵습니다..하...
	public void down() {


		File downDir = new File(FolderView.path);
		if(downDir.list().length==0) {
			System.out.println("하위 폴더가 없습니다.");
			return;
		}
		//String downDir = new File(FolderView.path).getAbsolutePath();
		Scanner sc = new Scanner(System.in);
		System.out.println("입장할 폴더 이름을 입력하세요 : ");
		for(int i = 0; i < downDir.list().length; i++) {
			System.out.println((i+1)+" : " + downDir.list()[i]);
		}
		int choice =-1;
		while(true) {
			System.out.println("선택한 번호 : ");
			choice = sc.nextInt();
			sc.nextLine();
			if(choice > downDir.list().length) {
				System.out.println("없는 디렉토리 입니다.");
			}else if (choice >= 1 && choice <= downDir.list().length) {
				break;
			}
		}
		String newDir = downDir.list()[choice-1];
		FolderView.path = FolderView.path + "\\" + newDir;
		System.out.println(FolderView.path);
	}
}
