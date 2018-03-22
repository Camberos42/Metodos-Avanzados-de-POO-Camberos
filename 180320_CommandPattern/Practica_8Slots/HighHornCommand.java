public class HighHornCommand implements Command {
	
	Horn horn;
	
	public HighHornCommand(Horn horn){
		this.horn = horn;
	}

	public void execute() {
		horn.subir();
	}

	public void undo() {
		horn.bajar();	
	}

}
