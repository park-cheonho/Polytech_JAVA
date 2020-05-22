package practice;

import java.util.Scanner;

public class BoardArrUtill {

	private Board board = new Board();
	private Scanner sc = new Scanner(System.in);
	
	public String inputString(String msg) {
		
		System.out.println(msg);
		String str = sc.nextLine();
		
		return str;
	}
	
	public int inputCmd(String msg) {
		

		int cmd = 0;
		
		while(true) {
			try {
				System.out.print(msg);
				cmd = Integer.parseInt(sc.nextLine());
				// 예외 안나면 break;
				break;
			}  
			catch(Exception NumberFormatException) {
				System.out.println("정수의 값이 아닙니다.\n");
			}
		}
		
		return cmd;
	}
	
public void selectAll() {
		
		if(board.getBoardCnt() == 0)
			System.out.println("게시물이 없습니다.\n");
		else {
			System.out.println("< 전체 게시글 조회 >");
			System.out.printf("No\t%-15s\t%-15s%s\n", "Title", "Writer", "Date");
			System.out.println("------------------------------------------------------");
			Data data;
			for(int i = 0; i < board.getBoardCnt(); i++) {
				data = board.select(i+1);
				printData(data);
			}
			System.out.println();
		}
		
	}
	
	public void selectData() {
		
		int num = inputCmd("조회할 글번호를 입력 : ");
		
		Data data = board.select(num);
		
		if(data != null) {
			System.out.printf("No\t%-15s\t%-15s%s\n", "Title", "Writer", "Date");
			System.out.println("------------------------------------------------------");
			printData(data);
			System.out.println();
		}
		else
			System.out.println("글 번호를 잘못 입력하셨습니다.\n");
		
	}
	
	public void insertData() {
		
		String title = inputString("등록할 제목을 입력 : ");
		String writer = inputString("등록할 글쓴이를 입력 : ");
		
		boolean ret = board.insert(title, writer);
		
		if(ret)
			System.out.println("게시물이 등록되었습니다.\n");
		else
			System.out.println("게시물이 가득 찼습니다. 삭제 후 다시 진행해주세요.\n");
		
	}
	
	public void updateData() {
		
		int num = inputCmd("수정할 글 번호를 입력 : ");
		
		if(num <= board.getBoardCnt()) {
			String title = inputString("등록할 제목을 입력 : ");
			String writer = inputString("등록할 글쓴이를 입력 : ");
			
			board.update(num, title, writer);
			System.out.println("게시물이 수정되었습니다.\n");
		}	
		else
			System.out.println("글 번호를 잘못 입력하셨습니다.\n");
	}
	
	public void deleteData() {
		
		int num = inputCmd("삭제할 글 번호를 입력 : ");
		
		boolean ret = board.delete(num);
		
		if(ret)
			System.out.println("게시물이 삭제되었습니다.\n");
		else
			System.out.println("글 번호를 잘못 입력하셨습니다.\n");
		
	}
	
	public void printData(Data data) {
		
		System.out.printf("%d\t%-15s\t%-15s%s\n", data.getNum(), data.getTitle(), data.getWriter(), data.getDate());
	}
}
