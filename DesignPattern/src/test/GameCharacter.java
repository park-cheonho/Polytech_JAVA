package test;

public class GameCharacter {

	//접근점
	private Weapon weapon;

	
	//교환가능
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if (weapon == null) {
			System.out.println("맨손 공격");
		}else {
			//델리케이트
			weapon.attck();
		}
		
	}
	
}
