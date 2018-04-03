public class Door {
	private boolean open;
	private String RoomDoor;
	
	public Door(String door){
		this.RoomDoor = door;
	}
	
	public void open(){
		open = true;
		System.out.print("Abriendo puerta \n");
	}
	
	public void close(){
		open = false;
		System.out.print("Cerrando puerta \n");
	}
}
