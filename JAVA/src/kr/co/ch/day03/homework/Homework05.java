package kr.co.ch.day03.homework;

/*
5. 다음의 설명을 보고 코드를 작성하세요.
	달팽이가 100M 깊이의 우물을 빠졌습니다
	달팽이는 1시간에 5M속도로 움직입니다
	올라온 높이가 50M미만일땐 1시간에 1M씩 미끌어지고
	50M이상일때 1시간에 2M씩 미끌어집니다
	달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.
< 출력결과 >
	[1시간후] 달팽이가 올라간 총 높이 : 4M
	[2시간후] 달팽이가 올라간 총 높이 : 8M
	...
	[XX시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M
 */
		
public class Homework05 {

	public static void main(String[] args) {
		
		int depth = 0; // 달팽이의 위치
		int hour = 0; // 걸린 시간
		System.out.println("< 출력결과 >");
		for(int i = 0; i<100; i++) {
			i = hour++; // 시간은 1씩 증가 
			i = depth += 5; // 위치는 5씩 증가
			if(depth<50) { // 50미만이면 -1
				depth -=1;
				System.out.printf("[%d시간후} 달팽이가 올라간 총 높이  : %dM \n", hour, depth);
			} else { // 50부터는 -2
				depth -=2;
				System.out.printf("[%d시간후} 달팽이가 올라간 총 높이  : %dM \n", hour, depth);
			}
			
		}

	}
}
