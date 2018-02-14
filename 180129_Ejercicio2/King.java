
public class King extends Character {
	public  King(){
		setWeapon(new KnifeBehavior());
		
	}
	
	public void fight(){
		System.out.println("King : " + getWeapon().useWeapon());
	}
}
