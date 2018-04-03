public class LowHornCommand implements Command {
	
	Horn horn;
	
	public LowHornCommand(Horn horn){
		this.horn = horn;
	}
	
	public void execute() {
		
		horn.bajar();
	}

	public void undo() {
		
		horn.subir();
	}

}
