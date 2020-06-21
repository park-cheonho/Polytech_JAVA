package ProxyPattern;

public class proxy implements Subject{

	//복잡한 업무를 하는 실제 객체
	private Subject real;
	
	public proxy(Subject real) {
		this.real = real;
	}
	
	@Override
	public void action1() {
		// TODO Auto-generated method stub
		System.out.println("간단한 업무 by 프록시");
	}

	@Override
	//프록시가 못하는 복잡한 업무
	public void action2() {
		// TODO Auto-generated method stub
		this.real.action2();
	}

	
}
