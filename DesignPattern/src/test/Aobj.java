package test;

public class Aobj {

	Ainterface ainterface;
	
	public void funAA() {
		
		ainterface = new AinterfaceImpl();
		
		//위임한다
		ainterface.funA();
		ainterface.funA();

		//System.out.println("AAA");
		//System.out.println("AAA");
	
		/// ~기능 필요합니다. 개발해주세요.
	}
}
