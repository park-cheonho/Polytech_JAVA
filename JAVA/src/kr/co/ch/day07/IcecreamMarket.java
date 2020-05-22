package kr.co.ch.day07;
// 관리하는클래스 제어 클래스 컨트롤 클래스
import java.util.Scanner;

public class IcecreamMarket {

	Icecream[] iceArr; // 고객 한 명이 왔을때 그 고객에 대한 판매정보
	Scanner sc;
	
	public IcecreamMarket() {
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
		
		int cnt = getInt("아이스크림 몇개 구입할래? : ");
		iceArr = new Icecream[cnt];
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i + 1) + "번째 구매정보 입력 ***");
			String name = getStr("아이스크림 명 : "); 
			int price = getInt("아이스크림 가격 : ");
			
			iceArr[i] = new Icecream(name, price);
		}
		
	}
	
	void print() {
		System.out.println("<총 " + iceArr.length + "개의 판매정보 입력>");
		System.out.println("번호\t아이스크림명\t+가격\t");
		for(int i = 0; i < iceArr.length; i++) {
			Icecream ice = iceArr[i];
			System.out.printf("%3d\t%-10s\t%5d\n", i+1, ice.getName(),ice.getPrice());
		}
	}
}
