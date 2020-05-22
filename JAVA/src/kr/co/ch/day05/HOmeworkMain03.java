package kr.co.ch.day05;


public class HOmeworkMain03 {
	//문제 5번
	public static void main(String[] args) {
		
		int[] nums = new int[99];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 2;		
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				for(int j = i+1; j < nums.length; j++) {
					if(nums[j] % nums[i] == 0) {
						nums[j] = 0;
					}
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				System.out.printf("%5d", nums[i]);
			}
		}
		System.out.println();
	}

}
