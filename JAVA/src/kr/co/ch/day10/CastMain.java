package kr.co.ch.day10;

public class CastMain {
	
	/*
	static void print(Child01 c) {
		c.print();
	}
	
	static void print(Child02 c) {
		c.print();
	}
	
	
	
	*/
	//static Child01 -> Parent
	static Parent getInstance() {
		//return new Child01();
		//return new Child02();
		//return new Child03();
		//넷다 가능
		return new Parent();
	}
	
	//매번 이렇게 안하려면 Parent로 변수를 받기? 
//	static void print(Child03 c) {
//		c.print();
//	}
	//매게변수에서 묵시적 형변환이 일어나고 있다.
	//넘기는 객체에 대해 유연하게 대처
	static void print(Parent p) {
//		p.print();
	
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.play();
			c.sing();
		}
		
//		System.out.println("p instanceof Child01 : " + (p instanceof Child01));
//		System.out.println("p instanceof Child02 : " + (p instanceof Child02));
//		System.out.println("p instanceof Parent : " + (p instanceof Parent));
//		System.out.println("p instanceof Child01 : " + (p instanceof String));
//		이건 못씀 상속관계여야 가능		
		
		/*
		Child01 c = (Child01)p;
		c.study(); // 명시적 형변환해서 p가 child01로
		c.sleep();
		이거로는 해결 다 x
		*/
		
		/*
		switch(type) {
		case 1 : 
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
			break;
		case 2 :
			Child02 c2 = (Child02)p;
			c2.play();
			c2.sing();
		}
		*/
		
		
	}
	//매게변수가 있다 = 리턴타입도 묵시적 형변환 가능?
	
	public static void main(String[] args) {
		
//		Parent p = getInstance();
//		print(p);
		
		
		//Child03 c = new Child03();
		//print(c, 3);
		
		Child01 c01 = new Child01();
		print(c01);
		
		Child02 c02 = new Child02();
		print(c02);
		
		//Parent p = new Parent();
		//print(p);
		
		
		/*
		Parent p = new Child01(); //묵시적 형변환 가즈아!!!!
		//name이라는 맴버 변수와 print라는 메소드 = 부모
		//name이라는 맴버 변수와 print,study,sleep 메소드 = 자식
		//p가 접근하는 공간은 원래 parnet의 공간만
		p.print();
		// 교수님 근데 p.찍으면 그 팜업창같은거에 void parent라고 나오는데 
		
		Parent p2 = new Child02();
		p.print();
		Parent p2 = new Parent();
		p.print();
		*/
		
		/*
		Child02 c02 = new Child02();
		c02.print();
		c02.play();
		c02.sing();
		
		Child01 c01 = new Child01();
		c01.print();
		c01.sleep();
		c01.study();
		
		Parent p = new Parent();
		p.print();
		*/
	}
}
