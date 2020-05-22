package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {

	private Data[] dataArr = new Data[100];
	private int boardCnt = 0;
	
	// 날짜 생성 메소드
	public String makeDate() {
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		
		return date;
	}
	
	public int getBoardCnt() {
		return boardCnt;
	}

	// 조회 시 있으면 데이터 반환. 없으면 null 반환
	public Data select(int num) {
		
		Data retData = null;
		
		if(num <= boardCnt)
			retData = dataArr[num-1];
		
		return retData;
	}
	
	// 데이터 삽입 메소드. 삽입하면 true, 게시판 꽉 차있으면 false 반환
	public boolean insert(String title, String writer) {
		
		boolean ret = true;
		
		if(boardCnt == 100)
			ret = false;
		
		if(ret) {
			
			// 날짜
			String date = makeDate();
			
			boardCnt++;
			Data data = new Data(boardCnt, title, writer, date);
			
			dataArr[boardCnt-1] = data;
		}
		
		return ret;	
	}
	
	// 게시물 수정 메소드. 입력받은 번호의 게시물을 입력받은 Data로 수정
	public boolean update(int num, String title, String writer) {
		
		boolean ret = true;
	
		if(num > boardCnt)
			ret = false;
		
		if(ret) {
			
			dataArr[num-1].setTitle(title);
			dataArr[num-1].setWriter(writer);
		}
		
		return ret;
	}
	
	// 게시물 삭제 메소드. 입력받은 번호의 게시물을 입력받은 Data로 수정
	public boolean delete(int num) {
			
		boolean ret = true;
		
		if(num > boardCnt)
			ret = false;
			
		if(ret) {
			for(int i = num-1; i < boardCnt; i++) {
				
				// fianl loop				
				if(i+1 == boardCnt)
					dataArr[boardCnt-1] = null;
				
				else
				{
					dataArr[i] = dataArr[i+1];
					dataArr[i].setNum(i+1);
				}
					
				
			}
			boardCnt--;
		}
			
		return ret;
	}
}
