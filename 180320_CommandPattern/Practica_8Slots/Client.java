public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoker control = new Invoker();
		
		Light GarageLight = new Light("Garage");
		Light KitchenLight = new Light("Kitchen");
		Light MyRoom = new Light("MyRoom");
		Light LivingRoom = new Light("LivingRoom");
		Door Garagedoor = new Door("Garage Door");
		Door SecurityDoor = new Door("Security Door");
		Door MyHouse = new Door("My House");
		Horn Bocina = new Horn("Bose");
		
		
	    LightOnCommand GarageLightOn = new LightOnCommand(GarageLight);
	    LightOffCommand GarageLightOff = new LightOffCommand(GarageLight);
	    
	    LightOnCommand KitchenLightOn = new LightOnCommand(KitchenLight);
	    LightOffCommand KitchenLightOff = new LightOffCommand(KitchenLight);
	    
	    LightOnCommand MyRoomOn = new LightOnCommand(MyRoom);
	    LightOffCommand MyRoomOff = new LightOffCommand(MyRoom);
	    
	    LightOnCommand LivingRoomOn = new LightOnCommand(LivingRoom);
	    LightOffCommand LivingRoomOff = new LightOffCommand(LivingRoom);
	    
	    OpenDoorCommand OpenGarageDoor = new OpenDoorCommand(Garagedoor);
	    CloseDoorCommand CloseGarageDoor = new CloseDoorCommand(Garagedoor);
	    
	    HighHornCommand VolumenAltoBocina = new HighHornCommand(Bocina);
	    LowHornCommand VolumenBajoBocina = new LowHornCommand(Bocina);
	    
	    OpenDoorCommand SecurityDoorOn = new OpenDoorCommand(SecurityDoor);
	    CloseDoorCommand SecurityDoorOff = new CloseDoorCommand(SecurityDoor);
	    
	    OpenDoorCommand MyHouseOn = new OpenDoorCommand(MyHouse);
	    CloseDoorCommand MyHouseOff = new CloseDoorCommand(MyHouse);
	    

	    control.setCommand(0, GarageLightOn, GarageLightOff);
	    control.setCommand(1, KitchenLightOn, KitchenLightOff);
	    control.setCommand(2, OpenGarageDoor, CloseGarageDoor);
	    control.setCommand(3, SecurityDoorOn, SecurityDoorOff);
	    control.setCommand(4, VolumenAltoBocina, VolumenBajoBocina);
	    control.setCommand(5, MyRoomOn, MyRoomOff);
	    control.setCommand(6, LivingRoomOn, LivingRoomOff);
	    control.setCommand(7, MyHouseOn, MyHouseOff);
	    
	    
	    System.out.println("Garage: ");
	    control.onButtonPressed(0);
	    System.out.println("Garage: ");
	    control.offButtonPressed(0);
	    
	    System.out.println("Kitchen: ");
	    control.onButtonPressed(1);
	    System.out.println("Kitchen: ");
	    control.offButtonPressed(1);
	    
	    System.out.println("Garage Door: ");
	    control.onButtonPressed(2);
	    System.out.println("Garage Door: ");
	    control.offButtonPressed(2);
	    
	    System.out.println("Security Door: ");
	    control.onButtonPressed(3);
	    System.out.println("Security Door: ");
	    control.offButtonPressed(3);
	    
	    System.out.println("Bocina: ");
	    control.onButtonPressed(4);
	    System.out.println("Bocina: ");
	    control.offButtonPressed(4);
	    
	    System.out.println("My Room: ");
	    control.onButtonPressed(5);
	    System.out.println("My Room: ");
	    control.offButtonPressed(5);
	    
	    System.out.println("LivingRoom: ");
	    control.onButtonPressed(6);
	    System.out.println("LivingRoom: ");
	    control.offButtonPressed(6);
	    
	    System.out.println("My House: ");
	    control.onButtonPressed(7);
	    System.out.println("My House: ");
	    control.offButtonPressed(7);
	    
	}

}
