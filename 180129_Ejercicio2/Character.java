
public  class Character {
	String Character;
	private WeaponBehavior wb;
	
	/*public Character(String Character,WeaponBehavior wb){
		this.Character = Character;
		this.wb = wb;
		
	}
	*/
	
	public void setWeapon(WeaponBehavior wb){
		this.wb = wb;
	}

	public WeaponBehavior getWeapon(){
		return wb;
	}
	
	public void fight(){}

	public static void main(String[] args) {
		
		Knight c1 = new Knight();
		Queen c2 = new Queen();
		Troll c3 = new Troll();
		King c4 = new King();
		c1.fight();
		c2.fight();
		c3.fight();
		c4.fight();
		

	}

}
