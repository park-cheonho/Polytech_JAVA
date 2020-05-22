package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class IcecreamMarket {

	Icecream[] iceArr;
	Scanner sc;
	
	IcecreamMarket() {
		sc = new Scanner(System.in);
	}
	
	int getInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	String getStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		
		return str;
	}
	
	void open() {
				
		int cnt = getInt("아이스크림 몇개 입력할래? : ");
		iceArr = new Icecream[cnt];
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i+1) + "번째 구매정보 입력 ***");
			String name = getStr("아이스크림명 : ");
			int price   = getInt("아이스크림가격 : ");
			
			iceArr[i] = new Icecream(name, price);
		}
		
		print();
	}
	
	void print() {
		System.out.println("< 총 " + iceArr.length + "개 판매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		for(int i = 0; i < iceArr.length; i++) {
			Icecream ice = iceArr[i];
			System.out.printf("%3d\t%-10s\t%5d\n", i+1, ice.getName(), ice.getPrice());
		}
	}
}











