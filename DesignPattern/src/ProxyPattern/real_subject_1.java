package ProxyPattern;

public class real_subject_1 implements Subject_1{

	 private String name;
	    
	    public void set_Name(String name)
	    {
	        this.name = name;
	    }
	    
	    public void Show_Name()
	    {
	        System.out.println("my name is "+ name);
	    }
	    
	    public void Complicated_Work()
	    {
	        System.out.println("proxy가 처리 못하는 작업을 수행합니다.");
	    }
}
