
public class Knight extends Character{
	
	public  Knight(){
		setWeapon(new SwordBehavior());
		
	}
	
	public void fight(){
		System.out.println("Caballero: " + getWeapon().useWeapon());
	}
}
