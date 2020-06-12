package kr.co.ch.day11;

import java.util.Random;

public class ExceptionMain3 {

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
		
		
		/*
		System.out.println("main start");
		
		try {
			Random r = new Random();
			int random = r.nextInt(3);
			
			System.out.println("추출된 난수 : " + random);
			System.out.println(10 / random);
			
			String str = "hello";
			System.out.println("5번쨰 문자 : " + str.charAt(5));
			
		} catch(ArithmeticException ae) {
			System.out.println("예외발생!!!!!!");
			System.out.println("발생이유 " + ae.getMessage());
			ae.printStackTrace();
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException 예외 발생");
			se.printStackTrace();
		}
		
		
		
		System.out.println("main end");
	}
	//try catch가 무적이 아니고 무조건이 아니기 때문에 if 같은거도 충분히 활용해야함
		 */
}
