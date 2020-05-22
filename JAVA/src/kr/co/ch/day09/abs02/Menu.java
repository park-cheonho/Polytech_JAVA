package kr.co.ch.day09.abs02;

import java.util.Scanner;

public class Menu {

	
	Scanner sc = new Scanner(System.in);
	public Menu() {
	}
	
	public void execute() {
	
		System.out.println("프린터를 선택하세요v2 1.LG 2.삼성  3.HP => ");
		int type = sc.nextInt();
		sc.nextLine();
		
//		step3		
		Printer p = null;
		if(type == 1) {
			p = new LGPrinter();
		} else if(type == 2) {
			p = new SamsungPrinter();
//			sam.samPrint();
		} else if (type == 3) {
			p = new HPPrinter();
			
		}
		//step3과 step2의 차이를 알려면 객체 형변환?
		/*
		step2
		if(type == 1) {
			Printer lg = new LGPrinter();
			lg.print();
		} else if(type == 2) {
			Printer sam = new SamsungPrinter();
			sam.print();
//			sam.samPrint();
		} else if (type == 3) {
			Printer hp = new HPPrinter();
			hp.print();
		}
		*/
		
		/*
		 // step1
		if(type == 1) {
			LGPrinter lg = new LGPrinter();
			lg.print();
		} else if(type == 2) {
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
//			sam.samPrint();
		} else if(type == 3) {
			HPPrinter hp = new HPPrinter();
			hp.print();
		}
		*/
	}
}
