package kr.co.ch.day03.homework;

/*
9. 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다.
	반복문은 최대 3개만 사용합니다.
	2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
	2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
	...
	5 * 1 = 5 6 7
	...
	8 9
	for(int dan = 2; dan <= 9; ) {}
 */
public class Homework09 {

	public static void main(String[] args) {

		// 바깥쪽이 행 안쪽이 열
		// 2단 3단 4단
		// 5단 6단 7단
		// 8단
		for (int i = 2; i <= 8; i += 3) { // 2,5,8의 차이 3 그래서 i+=3
			// System.out.println("*** " + i + " 단 ***");
			for (int j = 1; j <= 9; j++) {
				if (i < 8) {
					System.out.printf("%d * %d = %d ", i, j, i * j);
					System.out.printf("%d * %d = %d ", i + 1, j, (i + 1) * j);
					System.out.printf("%d * %d = %d \n", i + 2, j, (i + 2) * j);
				} else {
					System.out.printf("%d * %d = %d \n", i, j, i * j);

					// System.out.println(i + "*" + j + "=" + i * j);
				}
			}
		}
	}
}