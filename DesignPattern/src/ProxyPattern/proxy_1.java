package ProxyPattern;

public class proxy_1 implements Subject_1{
	
	public real_subject_1 subject;
    public String name;
	
	  public void set_Name(String name)
	    {
	        System.out.println("proxy가 대신해서 처리 할 수 있어요.");
	        if(subject!= null)
	        {
	            subject.set_Name(name);
	        }
	        this.name =name;
	    }
	    
	    public void Show_Name()
	    {
	        System.out.println("proxy가 대신해서 처리 할 수 있어요.");
	        System.out.println("my name is"+ name);
	    }
	    public void Complicated_Work()
	    {
	        subject = new real_subject_1();
	        subject.Complicated_Work();
	    }
}
