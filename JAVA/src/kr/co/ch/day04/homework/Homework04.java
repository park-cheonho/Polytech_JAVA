package kr.co.ch.day04.homework;

import java.util.Scanner;

/*
 4. 다음의 결과를 보이는 프로그램을 작성하시오.
1 – 100사이의 정수를 입력하시오 : 64
64의 약수의 개수 : 7개
< 64의 7개 약수 출력 >
1 2 4 8 16 32 64
1 – 100사이의 정수를 입력하시오 : 79
79의 약수의 개수 : 2개
< 79의 2개 약수 출력 >
1 79
 */
public class Homework04 {

	public static void main(String[] args) {
		
		int[] factorArr = new int [30]; 
				
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100사이의 정수를 입력하시오 : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++) { //i=1 i<= num // 0은 나눌수 없기에 1부터 시작 해서 입력된 수까지 num나누기
			if(num%i==0) { // num % i != 0  // num = factorArr[]
				factorArr[count] = i; //약수는 나누었을때 나머지가 0
				count++;
			}
		}
				
		System.out.println(num + "의 약수의 개수 : " + count);
		
		System.out.println("< " + num + count + "개 의 약수 출력 >" );
		
		for(int i = 0; i < count; i++) { // i를 1 ; i <= count로 하면 왜 1이 안나오고 마지막에 0이 나오는지 모르겠습니다.
			System.out.printf("%d ", factorArr[i]); //i개 까지의 배열 출력
		}
	}
}
