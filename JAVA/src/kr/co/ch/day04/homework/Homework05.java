package kr.co.ch.day04.homework;
/*
 2 ~ 100사이의 소수를 출력하는 코드를 작성
< 2 ~ 100사이의 소수 출력 >
2 3 5 7 11 13 17 … 97

<위대하신 교수님 설명>
 1) 2부터 100까지 숫자 배열 저장
 2) 2를 제외하고 2의 배수를 찾아 0으로 만든다. (소수일 수 없는 애)
 3) 0으로 안바뀐애는 이 자체가 소수
 4) 3을 제외하고 3의 배수를 0으로 만든다.
 5) 0은 소수가 아님 숫자로 남은 것은 소수이므로 이를 출력
 */
public class Homework05 {

	public static void main(String[] args) {

		int[] decimalArr = new int[99]; // 100-2+1 = 99
		// int[] decimalArr = new int[25];

		for (int i = 0; i < decimalArr.length; i++) {
			decimalArr[i] = i + 2; // 2~100까지의 숫자를 가진 배열 만들기
		}

		// 소수를 구하기 구글 참고했습니다. 이해가 잘 안됨니다.
		System.out.println("< 2 ~ 100사이의 소수 출력 >");
		for (int i = 0; i <= 98; i++) { // 0부터 98이니까 99번
			for (int j = i + 1; j < 99; j++) { // 
				if (decimalArr[i] != 0 && (decimalArr[j] % decimalArr[i]) == 0) {

					decimalArr[j] = 0;
				}
			}
			if (decimalArr[i] != 0) { // 0이 아닌 값 출력
				System.out.print(decimalArr[i] + " ");
			}
		}

	}

}
