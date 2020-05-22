package kr.ac.kopo.day08.abs02;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	
	public Menu() {
		sc = new Scanner(System.in);
	}

	public void execute() {
		
		System.out.print("프린터를 선택하세요v2(1. LG  2. 삼성  3. HP) => ");
		int type = sc.nextInt();
		sc.nextLine();
		
		// step3
		Printer p = null;
		if(type == 1) {
			p = new LGPrinter();
		} else if(type == 2) {
			p = new SamsungPrinter();
		} else if(type == 3) {
			p = new HPPrinter();
		}
		p.print();
		
		/*
		// step2
		if(type == 1) {
			Printer lg = new LGPrinter();
			lg.print();
		} else if(type == 2) {
			Printer sam = new SamsungPrinter();
			sam.print();
//			sam.samPrint();
		} else if(type == 3) {
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















