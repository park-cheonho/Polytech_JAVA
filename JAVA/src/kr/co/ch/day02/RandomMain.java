package kr.co.ch.day02;

/*
 * import java.ytil.*; 전부 import하는것
 */
import java.util.Random;


public class RandomMain {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int random = r.nextInt();  // 임의의 정수 추출, 음수 가능
		System.out.println("추출된 정수 : " + random);
		
		// 0 ~ 9 사이의 난수를 추출
		int num = r.nextInt(10); // 나온 큰 숫자를 10으로 나누고 나머지 값을 표현 하는 방식 => 음수 x 양의 정수 10 미만으로
		System.out.println("num : " + num);
		
		// 1 ~ 10 사이의 난수 추출 
		int num2 = r.nextInt(10) + 1; // 0+1 ~ 9+1 => 1 ~ 10
		System.out.println("num2 : " + num2);
		
	}

}
