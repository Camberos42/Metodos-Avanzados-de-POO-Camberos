public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoker control = new Invoker();
		
	    Light light = new Light();
	    Door door = new Door();
	    
	    Command lightOn = new LightOnCommand(light);
	    Command lightOff = new LightOffCommand(light);
	    
	    
	    Command OpenDoor = new OpenDoorCommand(door);
	    Command CloseDoor = new CloseDoorCommand(door);
	    
	    
	    //Turn on
	    control.setCommand(lightOn);
	    control.pressButton();
	    //Turn off
	    control.setCommand(lightOff);
	    control.pressButton();
	    
	    //Open Door
	    control.setCommand(OpenDoor);
	    control.pressButton();
	    
	    //Close Door
	    control.setCommand(CloseDoor);
	    control.pressButton();

	}

}
