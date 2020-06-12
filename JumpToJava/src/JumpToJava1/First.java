package JumpToJava1;

public class First {

	int a;
	String b;
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");	
	
		int age = 10;
		long customerOfStar = 8764827384923849L;
		float pi = 3.14F;
		double morePi = 3.141592;
		int octal = 023;
		int hex = 0xC;
		System.out.println(octal);
		System.out.println(0xC);
	
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		
		System.out.println(z);
		
		int s = 85;
		String result = (!(s>90))?"가":"나";
		System.out.println(result);
	
		int idx = 0;
		char[] charArray = new char[10];
		charArray[idx++] = '0';
		charArray[idx++] = 65;
		charArray[idx++] = 'A' + 1;
		System.out.println(charArray);
		System.out.println(idx++);
		
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('a' + 'b');
		System.out.println('1' +2);
		System.out.println('1' + '2');
		System.out.println('C' + '2');
		System.out.println('J' + "ava");
		System.out.println();
		System.out.println('c');
		System.out.println(('0' + '2'));
		
		int q = 1;
		while(q<100) {
			if(q==10) break;
			System.out.println(q);
			q++;
		}
		
		int k, l ;
		for(k=1;k<=5;k++) {
			for(l=1;l<=3;l++) {
				if(l>3)break;
				System.out.println("*");
			}
			System.out.println();
		}
		
		
		}
	}
