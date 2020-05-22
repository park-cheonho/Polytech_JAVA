package kr.co.ch.day04.homework;

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

public class HomeworkMain04 {

	public static void main(String[] args) {

		// 바깥쪽이 행 안쪽이 열
		// 2단 3단 4단
		// 5단 6단 7단
		// 8단
		int step = 3;
		for (int i = 2; i <= 9; i = i + step) { // 2,5,8의 차이 3 그래서 i+=3
			// System.out.println("*** " + i + " 단 ***");
			for (int j = 1; j <= 9; j++) {
				for(int k = i; k <= 9 && k < i+step; k++) {
					System.out.printf("%d * %d = %d\t ", k, j, k * j);
				}
			}
		}
	}
}
				/*
					System.out.printf("%d * %d = %d\t ", i, j, i * j);
					System.out.printf("%d * %d = %d\t", i + 1, j, (i + 1) * j);
					if(i + 2 <= 9) {
					System.out.printf("%d * %d = %d\t", i + 2, j, (i + 2) * j);
					}
					System.out.println();
					
					// System.out.println(i + "*" + j + "=" + i * j);
				}
			}
		}
	}

*/

/*
 
 int step = 3;
		for(int dan = 2; dan <= 9; dan = dan + step) {
		
			for(int i = 0; i <= 9; i++) {
				for(int j = dan; j <= 9 && j < dan+step; j++) {
					if(i == 0)
						System.out.printf("*** %d단 ***\t", j);
					else
						System.out.printf("%d * %d = %d\t", j, i, j * i);
				}
				System.out.println();
			}
			System.out.println();
		}
		// 방법2
		/*
		for(int dan = 2; dan <= 9; dan = dan + 3) {
			
			for(int i = 1; i <= 9; i++) {
				for(int j = dan; j <= 9 && j < dan+3; j++) {
					System.out.printf("%d * %d = %d\t", j, i, j * i);
				}
				System.out.println();
			}
			System.out.println();
		}
		*/

		// 방법1
		/*
		for(int dan = 2; dan <= 9; dan = dan + 3) {
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\t", dan, i, dan * i);                                    
				System.out.printf("%d * %d = %d\t", dan+1, i, (dan+1) * i);                                    
				if(dan + 2 <= 9) {
					System.out.printf("%d * %d = %d\t", dan+2, i, (dan+2) * i);
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
 
