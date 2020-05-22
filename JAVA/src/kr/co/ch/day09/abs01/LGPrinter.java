package kr.co.ch.day09.abs01;

public class LGPrinter extends Printer {
	
	private String modelName;
	
	public LGPrinter() {
		modelName = "LG프린터";
	}
	
	
	@Override
	public void print() {
		System.out.println("LG프린터에서 출력중...");
	}
	
	/*
	public void lgPrinter() {
		System.out.println(modelName + " 에서 출력중...");
	}
	*/
}
