
public class Troll extends Character {
	public  Troll(){
		setWeapon(new KnifeBehavior());
		
	}
	
	public void fight(){
		System.out.println("Troll: " + getWeapon().useWeapon());
	}
}
