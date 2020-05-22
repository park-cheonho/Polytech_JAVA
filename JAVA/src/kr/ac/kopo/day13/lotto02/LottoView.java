package kr.ac.kopo.day13.lotto02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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
		final int LOTTO_MAX = 6;
		Random r = new Random();
		
		Set<Integer> lottoNums = new HashSet<>();
		while(lottoNums.size() < LOTTO_MAX) {
			lottoNums.add(r.nextInt(45) + 1);
		}
		
		/*
		List<Integer> lottoNums = new ArrayList<>();
		while(lottoNums.size() < LOTTO_MAX) {
			int num = r.nextInt(45) + 1;
			if(!lottoNums.contains(num)) {
				lottoNums.add(num);
			}
		}
		*/
		
		return Arrays.toString(lottoNums.toArray());

	}
}













