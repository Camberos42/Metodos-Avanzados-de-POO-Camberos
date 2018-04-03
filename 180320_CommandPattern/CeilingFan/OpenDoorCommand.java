public class OpenDoorCommand implements Command {
	
	Door door;
	
	public OpenDoorCommand(Door door){
		this.door = door;
	}

	
	public void execute() {
		// TODO Auto-generated method stub
		door.open();

	}

	
	public void undo() {
		// TODO Auto-generated method stub
		door.close();
		
	}

}
