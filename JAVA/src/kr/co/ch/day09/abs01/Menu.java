package kr.co.ch.day09.abs01;

import java.util.Scanner;

public class Menu {

	
	Scanner sc = new Scanner(System.in);
	public Menu() {
	}
	
	public void execute() {
	
		System.out.println("프린터를 선택하세요 1.LG 2.삼성 => ");
		int type = sc.nextInt();
		sc.nextLine();
		
		if(type == 1) {
			LGPrinter lg = new LGPrinter();
			lg.print();
		} else if(type == 2) {
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
//			sam.samPrint();
		}
	}
}
