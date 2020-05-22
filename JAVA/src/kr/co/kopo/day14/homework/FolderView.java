package kr.co.kopo.day14.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
// 연속적으로 사용하고 싶은데 역량이...차마 거기까진 못미치네요.. 생성하고 다시 실행 안하고 삭제도 하고 수정도 하게 하고 싶은데...ㅠㅠ 방법이 궁금합니다.
public class FolderView {
	static String path;
	private File MainDir = null;
	private List<File> files = new ArrayList<File>();

	public FolderView() {

		MainDir = new File("C:\\Lecture\\java-workspace\\java");
		if (!MainDir.exists()) {
			MainDir.mkdir();
		}
		path = MainDir.getAbsolutePath();
	}

	public void start() {
		File[] f = MainDir.listFiles();
		System.out.println("----------------------------------------");
		System.out.println("\t" + MainDir.getName() + " 폴더 정보");
		System.out.println("----------------------------------------");
		System.out.println("이름\t\t종류\t크기\t마지막 수정 일자");
		//		boolean isDir = MainDir.isDirectory();
		//		if(isDir == true) {
		//			System.out.println("Dir");
		//		}else System.out.println("File");
		//		long length = MainDir.length();
		long lastTime = MainDir.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		sdf.format(new Date(lastTime));

		for(int i = 0; i < f.length; i++) {
			System.out.println(f[i].getName()+"\t\t"+(f[i].isDirectory()? "Dir":"File")+"\t"+f[i].length()+"\t"+sdf.format(new Date(f[i].lastModified())));

		}
		System.out.println("[C] 폴더생성   [R] 이름수정   [D] 삭제   [..]  상위폴더이동  [M] 하위폴더이동 [Q] 종료");
		System.out.print("선택 : ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		if(choice.equals ("c") || choice.equals("C")) {
			FolderCreate create = new FolderCreate();
			create.make();
		}else if(choice.equals ("d") || choice.equals("D")) {
			FolderDelete delete = new FolderDelete();
			delete.del();
		}else if(choice.equals ("r") || choice.equals("R")) {
			FolderRename rename = new FolderRename();
			rename.re();
		}else if(choice.equals ("..")) {
			FolderUp upstep = new FolderUp();
			upstep.up();
		}else if(choice.equals ("m") || choice.equals("M")) {
			FolderDown downstep = new FolderDown();
			downstep.down();
		}else if(choice.equals ("q") || choice.equals("Q")) {
			FolderQuit quit = new FolderQuit();
			quit.q();
		}
	}
}


