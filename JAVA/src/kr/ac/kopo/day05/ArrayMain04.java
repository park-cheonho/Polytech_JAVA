package kr.ac.kopo.day05;

public class ArrayMain04 {

	public static void main(String[] args) {
		
//		int [][] ar = new int[3][4];
		
		int[] [] ar = new int [3][];
		for(int i = 0; i < ar.length; i++) {
			ar[i] = new int[i+2];
		}
		
		System.out.println("ar.length : " + ar.length);
		for(int i = 0; i < ar.length; i++) {
			System.out.println("ar[" + i + "].length : " + ar[i].length);
		}
		
		System.out.println("< PRINT >");
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}
	}
}






