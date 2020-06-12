package kr.co.ch.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain6 {
static void a() throws NullPointerException {
		
		String str = "hello";
		
		try {
			String str2 = null;
			System.out.println(str2.substring(2));
			System.out.println("2번째 문자 : " + str.charAt(2));
			System.out.println("5번째 문자 : " + str.charAt(5));
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("예외발생... " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	static void b() throws FileNotFoundException {
		FileReader fr = new FileReader("a.txt");
	}
	
	public static void main(String[] args) /* throws Exception */ {
		
		System.out.println("main start...");
		try {
			a();
		} catch(NullPointerException ne) {
			System.out.println("main 예외발생..." + ne.getMessage());
		}
		
		try {
			b();
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		System.out.println("main end...");
		
	}
}
