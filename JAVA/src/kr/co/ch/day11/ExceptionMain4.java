package kr.co.ch.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain4 {

public static void main(String[] args) {
		
		System.out.println("main start...");
		
		try {
			FileReader fr = new FileReader("aaa.txt"); // 컴파일일시점의 예외(checked exception)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("예외발생 유무에 상관없이 무조건 실행");
		}
		
		System.out.println("main end...");
	}
}