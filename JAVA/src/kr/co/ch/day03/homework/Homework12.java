package kr.co.ch.day03.homework;

/*
12. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
 	*-------*
 	**-----**
 	***---***
 	****-****
 	*********
 	****-****
 	***---***
 	**-----**
 	*-------*
 */
public class Homework12 {

	public static void main(String[] args) {
		// 9행을 5행 4행으로 나눠서 진행 -> 수업 피드백 반영
		int star = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= star || j >= 10-star) {
					System.out.print('*');
				} else {
					System.out.print('-');
				}
			}
			System.out.println();
			
			star += (i < 5 ? 1 : -1);
		}
	} 
}
		/*
		for(int i = 1; i<=5; i++) { //처음 5행
			for(int j = 1; j<=9; j++) { // 9열
				if(i>j) {
					System.out.print("*");
				} else if(i+j<10) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			} System.out.println();
		}
		
		for(int i =1; i<=4; i++) { // 2번째 4행
			for(int j = 1; j<=9; j++) { //9열
				if(i+j<6) {
					System.out.print("*");
				} else if(j-i<=4) {
					System.out.print("-");
				}else {
					System.out.print("*");
				}
			} System.out.println();
		}
	}
}
*/

