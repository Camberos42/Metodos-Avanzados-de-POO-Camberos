public class CloseDoorCommand implements Command{

	Door door;
	
	public CloseDoorCommand(Door door){
		this.door = door;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.close();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		door.open();
		
	}

}
