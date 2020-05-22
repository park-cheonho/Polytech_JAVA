package kr.co.ch.day04.homework;

import java.util.Scanner;

/*
3. 다음의 결과를 보이는 코드를 작성하시오
1번째 정수 : 10
2번째 정수 : 5
10보다 큰수가 와야합니다
2번째 정수 : 12
3번째 정수 : 36
4번째 정수 : 6
10, 12, 36보다 큰수가 와야합니다
4번째 정수 : 22
10, 12, 36보다 큰수가 와야합니다
4번째 정수 : 40
5번째 정수 : 67
< PRINT >
10 12 36 40 67
< REVERSE >
76 4 63 21 1
 */
public class Homework03 {

	public static void main(String[] args) {

		int[] aArr = new int[5]; // 정수 5개가 들어갈 배열
		int[] rArr = new int[5]; // 정수 5개가 들어갈 배열
		int num = 0;
		// 
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 정수 : ");
		aArr[0] = sc.nextInt();
		// i = 0 부터 조건문으로 다음에 오는 숫자가 크면 배열에 못들어가게 하는 쪽으로 하면 5를 입력할때 0보다 큰수가 와야합니가 나옵니 ㅠ 
		for(int i = 1; i < aArr.length; i++) {
			System.out.print(i+1 + "번째 정수 : ");
			num = sc.nextInt();
			if(aArr[i-1] < num) { //처음 입력 받은 aArr[0]의 값 10이 5보다 크니까 else
				aArr[i] = num;
			}else {
				for(int a = 0; a<=i-1; a++) { // 입력 번째 직전의 배열 값 전부 출력
					System.out.print(aArr[a] + " ");
				}
				System.out.println("보다 큰수가 와야합니다.\n");
				i--; // 다시 전단계로 되돌리기
			}
		}

		    System.out.println();
			System.out.println("< PRINT >");
			for (int j : aArr) {
				System.out.print(j + " ");
			}
			
			System.out.println();
			/*
			 숫자 뒤집는 것은 구글 검색 -> 1234의 경우 10으로 나눈 나머지 4가 rArr의 배열이 되고  목 123은 다음 반복으로 
			 4는 40이 되고 123%10 3은 43이 되고 123/10 12는 반복문으로 -> 1234->4321
			 */
				for (int i1 = 0; i1 < rArr.length; i1++) {
					while (aArr[i1] != 0) {
						rArr[i1] = rArr[i1] * 10 + aArr[i1] % 10;
						aArr[i1] /= 10;
					}
				}
				System.out.println("< REVERSE >");
				for (int i1 = 4; i1 >=0; i1--) { //출력 순서도 거꾸로 하려면 for문의 숫자를 조정
					System.out.print(rArr[i1] + " ");
				}
			}
		}
// 3시간 걸린 풀다가 눈물난 문제...

		