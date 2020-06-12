package kr.co.ch.day11.homework;

import java.util.Random;
import java.util.Scanner;

public class LottoMain {
	
	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 로또번호를 입력하세요 : ");
		int like = sc.nextInt();
		sc.nextLine();
		
		if(like > 45) {
			throw new LottoException("1 - 45 사이만 가능합니다. "+ like +"은 올바르지 않습니다.");
		}
		
		System.out.println("선택하신 번호 " + like + "를 포함해서 6개의 로또번호를 추출하겠습니다.");
		System.out.println(like + " ");
		randomNum();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void randomNum() {
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random()*45 + 1);
			System.out.println(arr[i] + " ");
		}
	}

}

