
public class Queen extends Character {
	
	public  Queen(){
		setWeapon(new BowAndArrow());
		
	}
	
	public void fight(){
		System.out.println("Dama: " + getWeapon().useWeapon());
	}
}
