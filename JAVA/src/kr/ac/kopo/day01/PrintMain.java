package kr.ac.kopo.day01;

public class PrintMain {

	public static void main(String[] args) {
		
		// "[\n]" 문자를 출력
		System.out.println("\"[\\n]\"");
		System.out.println("[%]");
		System.out.printf("[%%\\n]\n");
		
		// 'M'의 유니코드 값을 알고싶다면????
		char ch = 'M';
		System.out.printf("%d\n", (int)ch);
		System.out.println((int)ch);
		
		int code = 65;
		System.out.printf("%c\n", (char)code);
		
		
		System.out.println('A' + 'B' + "hello" + true + 10);
		
		System.out.println('A');
		System.out.println('\u0041');
		System.out.printf("%c\n", 'A');
		System.out.printf("%c\n", '\u0041');
		System.out.printf("%c\n",  65);
		
		System.out.println(10 + "ABC");
		System.out.println(10 + 12.34);
		System.out.println('A' + "BC");
		System.out.println('A' + 'B');		// 65 + 66
		System.out.println(10 + 'A');		// 10 + 65
		
		/*
		 	10		 ABC
		 	1234	 DE
		 	8		 Hello
		 	12345678 Hi
		 */
		System.out.printf("%-10d\t%s\n", 10, "ABC");
		System.out.printf("%-10d\t%s\n", 1234, "DE");
		System.out.printf("%-10d\t%s\n", 8, "Hello");
		System.out.printf("%-10d\t%s\n", 12345678, "Hi");
		System.out.printf("[%05d]\n", 123);
		System.out.printf("%.1f\n", 12.46 - 0.05);		// 12.4
		System.out.printf("%.1f\n", 12.43 - 0.05);		// 12.4
	}
}
