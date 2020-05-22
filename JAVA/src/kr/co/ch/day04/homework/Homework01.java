package kr.co.ch.day04.homework;
import java.util.Arrays;
/*
1. 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
1's num : 12
2's num : 5
3's num : 8
4's num : 30
5's num : 22
6's num : 87
7's num : 9
8's num : 4
9's num : 15
10's num : 22
< 짝수 >
12 8 30 22 4 22
짝수의 총합 : XXX
< 홀수 >
5 87 9 15
홀수의 총합 : XXX

 */
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		int[] evenArr = new int[10]; //짝수 배열 10개 전부 일수 있으니 10개 크기
		int[] oddArr = new int[10]; //홀수 배열 10개 전부 일수 있으니 10개 크기
		int evenindex = 0; //짝수 배열의 갯수
		int oddindex = 0; //홀수 배열의 갯수
		int num = 0; //스캐너로 입력 받을 숫자
		int evensum = 0; //짝수 배열의 합
		int oddsum = 0; //홀수 배열의 합
			
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 10; i++) { //숫자 10개 입력 받기 for문
			System.out.print(i + "`s num : ");
			num = sc.nextInt();
			if(num % 2 == 0) { // 짝수는 2로 나눠서 나머지 없는 것
				evenArr[evenindex++] = num; // evenindex가 5까지 있다는 사실이 ㅇ해가 바로 안되어서 밑에 짝수 홀수 for문 돌릴때 너무 어려웠습니다. ㅠㅠ
			}else { // 홀수는 2로 나눠서 나머지 있는애들
				oddArr[oddindex++] =num;
			}
		}
		sc.close(); // 입력 받는것 닫기 
			System.out.println("< 짝수 >"); 
			for(int j = 0; j <= evenindex-1; j ++) { // 처음에 <=evenindex로 해서 0이 자꾸 나오는 것 발생 < evenindex 혹은  < evenArr.length로 하는것도 가능 // 그러나 5개가 있어고 index 5번째는 0이니까
				System.out.print(evenArr[j] + " "); // 숫자와 숫자 사이에 띄어쓰기 주의
				evensum += evenArr[j]; //<=evenindex로 해도 +0이라 문제가 안생겨서 원인 찾는데 헷갈려짐
			}
			System.out.println();
			System.out.print("짝수의 총합 : " +  evensum);		
			System.out.println();
			
			
			System.out.println("< 홀수 >");
			for(int k = 0; k <= oddindex-1; k++) {
				System.out.print(oddArr[k] + " ");
				oddsum += oddArr[k];
			}
			System.out.println();
			System.out.print("홀수의 총합 : " + oddsum);

		}
}

