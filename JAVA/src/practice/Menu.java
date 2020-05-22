package practice;

import java.util.Scanner;

public class Menu {

	BoardArrUtill boardArrUtill = new BoardArrUtill();
	Scanner sc = new Scanner(System.in);
	
	public void execute() {
		
		while (true) {
			printMenu();
			
			int cmd = inputCmd("메뉴 중 처리할 항목을 선택하세요");
			
			System.out.println();
			
			if (cmd == 1) 
				boardArrUtill.selectAll();
			else if (cmd == 2) 
				boardArrUtill.selectData();
			else if (cmd == 3)
				boardArrUtill.insertData();
			else if (cmd == 4)
				boardArrUtill.updateData();
			else if (cmd == 5)
				boardArrUtill.deleteData();
			
			else if (cmd == 0) {
				System.out.println("게시판 프로그램을 종료합니다.");
				System.exit(0);
			}
			else 	
				System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public int inputCmd(String msg) {
		
		int cmd = 0;
		
		while(true) {
			try {
				System.out.print(msg);
				cmd = Integer.parseInt(sc.nextLine());
				break;
			}  
			catch(Exception NumberFormatException) {
				System.out.println("정수의 값이 아닙니다.\n");
			}
		}
		
		return cmd;
	}
	
	public String inputString(String msg) {
		
		System.out.print(msg);
		String str = sc.nextLine();
		
		return str;
	}
	
	private void printMenu() {
		
		System.out.println("1. 전체게시물 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글 등록");
		System.out.println("4. 글 수정");
		System.out.println("5. 글 삭제");
		System.out.println("0. 종료");
	}
}


/*
 3. 게시판 관리 프로그램 (배열로 작성) 콜랙션 안쓰고 객체지향적으론
1.전체게시물조회
2.글번호조회
3.글등록
4.글수정
5.글삭제
0.종료
메뉴 중 처리할 항목을 선택하세요 : 3
등록할 제목을 입력 : 하하하...
등록할 글쓴이를 입력 : 닌자
게시글이 등록 되었습니다.
1.전체게시물조회
2.글번호조회
3.글등록
4.글수정
5.글삭제
0.종료
메뉴 중 처리할 항목을 선택하세요 : 1
<전체 게시글 조회 >
번호 제목 글쓴이 등록일
1 하하하 닌자  2020-04-28
메뉴 중 처리할 항목을 선택하세요 : 0 
 */
