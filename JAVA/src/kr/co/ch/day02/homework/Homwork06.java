package kr.co.ch.day02.homework;

public class Homwork06 {

/*	 
 알파벳이 모두 몇 자 인지 화면에 출력하시오
 개수 ? 52
*/
	
	public static void main(String[] args) {
	
		int small = 'z' - 'a' +1;
		int big = 'Z' - 'A' + 1;
		
		System.out.printf("개수 ? %d", small + big); 
		//값이 50이 나와서 생각해보니 자기 자신 포함 해줘야함 
	}
}
