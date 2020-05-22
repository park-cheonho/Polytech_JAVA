package kr.co.ch.day03.homework;
/*
11. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
 	*********
	-*******
	--*****
	---***
	----* 
 */
public class Homework11 {

	public static void main(String[] args) {
		//행 5개 열?을 9에서 5로 줄어듦

		for(int i = 1; i<=5;i++) { //5행
			for(int j = 1; j<=9; j++) { //9열
				
				if(i>j) {
					System.out.print("-"); //행이 열보다 큰 경우 - 나옴
				}else if(j>=i && i + j < 11) { //* 나오는 부분
					System.out.print("*");
				}else {
					System.out.print(" "); //빈부분운 공백으로
				}
			}System.out.print("\n");
			}
		
	}
}
