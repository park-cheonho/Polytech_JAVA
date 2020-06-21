package StrategyPattern;

public class Main {

	public static void main(String[] args) {
		/*
		Ainterface ainterface = new AinterfaceImpl();
		
		//통로
		ainterface.funA();
		
		Aobj aobj = new Aobj();
		aobj.funAA();
		*/
		
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Ax());
		character.attack();
	}
}
