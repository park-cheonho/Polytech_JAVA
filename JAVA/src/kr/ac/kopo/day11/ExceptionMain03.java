package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("main start...");
		
		try {
			Random r = new Random();
			int num = r.nextInt(3);
			
			System.out.println("추출된 난수 : " + num);
			System.out.println(10 / num);
			
			String str = "hello";
			System.out.println("5번째 문자 : " + str.charAt(5));
		} catch(Exception e) {
			e.printStackTrace();
		}
		/*
		} catch( ArithmeticException | StringIndexOutOfBoundsException e ) {
			e.printStackTrace();
		}
		*/
		/*	
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException 예외발생!!!");
//			System.out.println("발생이유 : " + ae.getMessage());
			ae.printStackTrace();
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException 예외발생!!!");
			se.printStackTrace();
		}
		*/
		
		System.out.println("main end...");
	}
}









