package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];	// [0] ~ [4]
		
		System.out.println("arr : " + arr);
		
		System.out.println("1번째 정수 : " + arr[0]);
		System.out.println("2번째 정수 : " + arr[1]);
		System.out.println("3번째 정수 : " + arr[2]);
		System.out.println("4번째 정수 : " + arr[3]);
		System.out.println("5번째 정수 : " + arr[4]);

		// 5개의 변수에 10, 20, 30, 40, 50 대입
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		
		System.out.println("<대입후...> ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "번째 정수 : " + arr[i]);
		}
		
		
//		System.out.println("1번째 정수 : " + arr[0]);
//		System.out.println("2번째 정수 : " + arr[1]);
//		System.out.println("3번째 정수 : " + arr[2]);
//		System.out.println("4번째 정수 : " + arr[3]);
//		System.out.println("5번째 정수 : " + arr[4]);
		
	}
}












