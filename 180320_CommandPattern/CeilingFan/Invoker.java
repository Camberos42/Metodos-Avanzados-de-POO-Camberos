public class Invoker {
	
	private Command[] onCommands;
	private Command[] offCommands;
	Command undoCommand;
	
	public Invoker(){
		
		onCommands = new Command[8];
		offCommands = new Command[8]; 
		
		Command NoCommand = new NoCommand();
		
		for (int i = 0; i < 8; i++) {
			
		onCommands[i] = NoCommand;
		offCommands[i] = NoCommand;
		
		undoCommand = NoCommand;
		}
	}
	
		
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
		}
	
	public void onButtonPressed (int slot) {
		
		if (onCommands[slot] != null ){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
		}
		
	}
	
	public void offButtonPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void undoButtonPressed() {
		undoCommand.undo();
	}

}
