public class CeilingFan {
	
	public static final int Alto = 3;
	public static final int Medio = 2;
	public static final int Bajo = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF; 
	}
	
	public void Bajo() {
		speed = Bajo;
		System.out.println(location + " ceiling fan BAJO"); 
		
	}
	
	public void Medio() {
		speed = Medio;
		System.out.println(location + " ceiling fan MEDIO"); 
		
	}
	
	public void Alto() {
		speed = Alto;
		System.out.println(location + " ceiling fan ALTO"); 
	}
	
	public void off() {
		speed = OFF;
		System.out.println(location + " ceiling fan OFF"); 
	}
	
	public int getSpeed() {
		return speed; 
		
	}

}
