package kr.co.ch.day04.homework;

import java.util.Scanner;

/*
2. 5개의 짝수를 입력받아 출력하는 코드를 작성
1's 정수 : 12
2's 정수 : 5
2's 정수 : 20
3's 정수 : 10
4's 정수 : 26
5's 정수 : 5
5's 정수 : 11
5's 정수 : 4
< 5개의 정수 출력 >
12 20 10 26 4
 */
public class Homework02 {
	
	public static void main(String[] args) {
		
		int [] evenArr = new int[5]; // 짝수 5개의 1차 배열  
		int even = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= evenArr.length; i++) { // 짝수 배열의 길이를 만족할 만큼 반복
			System.out.print(i + " `s 정수 : ");
			num = sc.nextInt();	
			if(num % 2 == 0) { // 짝수는 2로 나누었을떄 나머지가 없는 수
				evenArr[even++] = num; // 짝수 배열에 0,1,2,3,4의 인덱스에 입력받은 숫자를 지정한다
			}else {
				i--; // 짝수가 아니면 i를 증가하지 않는다
				//System.out.println(i + " `s 정수 : ");
			}
		}
		System.out.println();
		System.out.println("<5개의 정수 출력>");
		for(int j = 0; j < evenArr.length; j++) {
			System.out.print(evenArr[j] + " ");			
		}
	}

}
//교수님 혹시 else에서 for문 돌떄 순간 i 값을 알고싶은데 디버깅과 브레이크 포인트를 걸면 알 수 있다고 하는데 혹시 사용법을 가르쳐주실수 있을까요?