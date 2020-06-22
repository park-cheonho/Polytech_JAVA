package ProxyPattern;

public class main_1 {

	public static void main(String argsp[])
    {    
        proxy_1 proxy1 = new proxy_1();
        
        proxy1.set_Name("홍길동");
        System.out.println("================");
        
        proxy1.Show_Name();
        System.out.println("================");
        
        proxy1.Complicated_Work();
    }
}
