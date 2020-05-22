package kr.co.ch.day01;

public class PrintMain {

	public static void main(String[] args) {
	
	/*
	 컴퓨터는 알파벳도 숫자로 기억하기때문에 아스키코드르 인식
	 아스키코드 소문자 대문자 숫자문자 특수문자 공백문자 - 1byte / 한글 한자 일어 는 x
	 아스키코드는 한글자에 1바이트(256가지 - 8bit의 표현가능 저거 다더하면 256 안됨)
	 한글 한자 일어 같은 동양권 문자 표현 위해서 UNI CODE(ASCII CODE + 한글 한자....) 2byte(65000,16bit)
	 'A' ==> 65 ==> '\u0041' \w는 유니코드
	 그래서 자바는 이런 이유로 한글 표현이 가능하다
	 아스키 코드는 '가'를 "가"로 표현해야함
	 100 ==> 01100110
	 2진수 나열은 공간이 많이 필요함 -> 8진수 16진수의 압축으로 2진수를 표현
	 byte = 8 bit 
	 4형태의 16진수로 2byte -> '\u0000'
	 
	 
	 
	 'A' = 65
	 'a' = 97
	 'O' = 48	
	 */
		
		// [\n] 문자 출력원함 \\->\로 출력
		//System.out.println("[\\n]");
		// "[\n]" 출력
		//System.out.println("\"[\\n]\"");
		// % 찍고 싶으면 %%
		//System.out.println("[%]");
		//System.out.printf("[%%]\n");
		
		//M의 유니코드 값을 알고싶다
		char ch = 'M';
		System.out.printf("%d\n", (int)ch);
		System.out.println((int)ch);
		
		int code = 65;
		System.out.printf("%c\n", (char)code);
		
		System.out.println('A' + 'B' + "Hello" + 10);
		
		System.out.println('A');
		System.out.println('\u0041');
		System.out.printf("%c\n", 'A');
		System.out.printf("%c\n", '\u0041');
		System.out.printf("%c\n", 65);
		
		System.out.println(10 + "ABC");
		System.out.println(10 + 12.34);
		System.out.println('A' + "BC");
		System.out.println('A' + 'B'); // 65+66
		System.out.println(10 + 'A');  // 10+65
		
	/*
	  10   ABC
	  1234 DE
	  8    Hello
	  12345678 Hi	
	  - 외쪽 정렬
	  %10d 숫자는 칸수
	  \t 탭
	  "[%05d]\n" 앞에 0 들어가게
	  .3f 는 소수점 자리수 반올림
	  반올림 아닌 절사는?-> 요금납부  -0.05
	  절사에서 반올림 변경은?-> 
	  무조건 올림은? -> 은행이자
	 */
		System.out.printf("%-10d\t%s\n", 10, "ABC");
		System.out.printf("%-10d\t%s\n", 1234, "DE");
		System.out.printf("%-10d\t%s\n", 8, "Hello");
		System.out.printf("%-10d\t%s\n", 12345678, "Hi");
		System.out.printf("[%05d]\n", 123);
		System.out.printf("%.3f\n", 12.34567 - 0.05);
	}
}
