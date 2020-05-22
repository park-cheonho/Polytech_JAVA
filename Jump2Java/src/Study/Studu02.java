package Study;

public class Studu02 {

    int a;  // 객체변수 a

    public void vartest() {
        this.a++;
    }

    public static void main(String[] args) {
    	Studu02 myTest = new Studu02();
        myTest.a = 1;
        myTest.vartest();
        System.out.println(myTest.a);
    System.out.printf("오늘은 날씨가 %s%d%s", "구지다",100,"만큼");
    }
    
}
