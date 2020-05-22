package kr.co.ch.day06.homework;

/*
 * 사칙연산을 수행하는 Calculator 클래스 작성
정수 : 12
정수 : 5
12 + 5 = 17
12 - 5 = 7
12 * 5 = 60
12 / 5 = 2.4
12 소수체크 : false
5 소수체크 : true
 */

public class Calculator {

	int plus(int x, int y) {
		int plus_result = x + y;
		return plus_result;
	}
	
	int minus(int x , int y) {
		int minus_result = x - y;
		return minus_result;
	}
	
	int multi(int x, int y) {
		int multi_result = x*y;
		return multi_result;
	}
	
	double divide(int x, int y) {
		double divide_result = (double) x / (double) y;
		return divide_result;
	}
	
	boolean prime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
