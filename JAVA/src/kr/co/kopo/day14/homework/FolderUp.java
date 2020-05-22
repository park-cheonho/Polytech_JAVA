package kr.co.kopo.day14.homework;

import java.io.File;
import java.util.Scanner;

public class FolderUp {

	public void up() {
		
		
		String upDir = new File(FolderView.path).getParentFile().getAbsolutePath();
		FolderView.path = upDir;
		System.out.println(upDir);	
	}

}
