package kr.co.ch.day03.homework;

/*
10. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
	반복문 5개, 조건문 1개 이용가능
	반복문 3개, 조건문 3개
	반복문 3개, 조건문 1개
	반복문 2개, 조건문 2개
 	*****	
	-****
	--***
	---**
	----*
	---**
	--***
	-****
 	*****
 */
/*
 i *
 1 5
 2 4
 3 3
 4 2
 5 1
 -----
 6 2
 7 3
 8 4
 9 5
 
 */
public class Homework10 {

	public static void main(String[] args) {
		// 바깥이 행 안쪽이 열
		
		for(int i =1 ; i<=9 ; i++) {
			for(int j =1 ; j<=5 ; j++) { // 9행 5열의 판 만들기
				
			// 5행까지는 -가 증가하고, 이후에는 감소하므로 조건문을 통해 두 경우 나누기
			if(i <= 5) { // - 증가부분
				
				if(i>j) { // -가 증가하는 조건 행이 열보다 크면
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			} else {
				/*
				 6행부터 
				 i   - j
				 6행  3개
				 7행  2개
				 8행  1개
				 9행  0개 
				 */
				if(j <= 9-i) { // j는 9-i
					System.out.print("-");
				}else {
					System.out.print("*");
				}
				}
			}
			System.out.print("\n"); // 이 한 줄의 의미를 잘 모르겠습니다 이게 없으면 줄이 안나눠지는데 ㅠ
		}		
	}	
}

