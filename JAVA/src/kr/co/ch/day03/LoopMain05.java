package kr.co.ch.day03;

public class LoopMain05 {
	
public static void main(String[] args) {
		
		/*
		 	  j 12345
		i = 1   *****
		i = 2    ****
		i = 3     ***
		i = 4      **
		i = 5       *
		 */
		
	// 방법 1	
		/*
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print('-');
			}
			for(int j = 1; j <= 6 -i; j++) {
				System.out.print('*');
			}	
				System.out.print('\n');	
		}	
		*/
	
	// 방법 2
	
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (j < i) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}

			}

			System.out.print('\n');
		}
}

}