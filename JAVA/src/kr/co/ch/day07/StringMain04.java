package kr.co.ch.day07;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "";
		long start = System.currentTimeMillis();
		for(int i = 1; i < 100000; i++) {
			str = str + i;	
		}
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) / 1000.);
		
		StringBuffer sb = new StringBuffer();
		start = System.currentTimeMillis();
		for(int i = 1; i < 100000; i++) {
			sb.append(i);	
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.);
		//웹상에서 자주 변화가 일어나는것은 반드시 스트링버퍼 스트링빌더 서야함!!
}
}
