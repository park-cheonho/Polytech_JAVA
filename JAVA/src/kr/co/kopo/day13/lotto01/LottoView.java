package kr.co.kopo.day13.lotto01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoView {

	private Scanner sc;
	
	public LottoView() {
		sc = new Scanner(System.in);
	}

	public void start() {
		System.out.print("게임수를 입력 : ");
		int gameCount = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= gameCount; i++) {
			System.out.println("게임 " + i + " : " + getLottoNums());
		}
	}
	
	private String getLottoNums() {
		
		Random r = new Random();
		int[] lottoNums = new int[6];
		
		// 방법2
		int[] nums = new int[45];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		
		for(int i = 0; i < lottoNums.length; i++) {
			int idx = r.nextInt(45-i);	// 0 ~ 44
			int lottoNum = nums[idx];
			lottoNums[i] = lottoNum;
			
			int temp = nums[idx];
			nums[idx] = nums[nums.length-1-i];
			nums[nums.length-1-i] = temp;
			
		}
		
		/*
		// 방법1
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					i--;
					break;
				}
			}
		}
		*/

//		Arrays.sort(lottoNums);
		return Arrays.toString(lottoNums);
	}
}
