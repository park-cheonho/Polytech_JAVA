package Study;

public class Study01 {

	public int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		Study01 myStudy = new Study01();
		int c= myStudy.sum(a, b);
		System.out.println(c);		
	
	}
}
