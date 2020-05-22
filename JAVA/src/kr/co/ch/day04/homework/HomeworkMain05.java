package kr.co.ch.day04.homework;

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
/*
 i	''	*
 1	7	1
 2	5	2
 3	3	3
 4	1	4
 5	0	5
 6	1	4
 7	3	3
 8	5	2
 9	7	1
 if i <= 4
 else if i == 5
 else 
 
 */


//접으면 데칼코마니 앞에 별 찍은 만큼 뒤에 별찍고 중간에는 공백
/*
 i	*
 1	1
 2	2
 3	3
 4	4
 5	5
 6	4
 7	3
 8	2
 9	1
 */

public class HomeworkMain05 {

	public static void main(String[] args) {
		int start = 1;
		for(int i = 1; i <= 9; i++) {
			//System.out.print("start :" + start);
			for(int j =1; j <= 9; j++) {		
				if(j <= start || j >= 10-start ) {
					System.out.print('*');
				} else {
					System.out.print('-');
				}
			}
				System.out.println();
				start += (i < 5 ? 1 : -1);
			}
			
			// 1<=5아닌 이유는 이미 1~5열은 찍고 여기까지 온거고 6열 부터 찍어야해서
			// 별 5개 찍고 싶으면 1~5열까지
		}
}
/*
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
 */
