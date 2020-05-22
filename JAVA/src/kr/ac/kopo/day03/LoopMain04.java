package kr.ac.kopo.day03;

public class LoopMain04 {

	public static void main(String[] args) {
		/*
	 	12345
	 	12345
	 	12345
	 	12345
	 	12345
	 */

		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				System.out.printf("%d", j);
			}
			System.out.print('\n');
		}

	}
}
