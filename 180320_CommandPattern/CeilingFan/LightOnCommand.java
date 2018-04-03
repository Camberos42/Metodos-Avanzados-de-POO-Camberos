public class LightOnCommand implements Command {
	
	  Light light;
	  public LightOnCommand(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.TurnOn();
	  }
	  
	  public void undo(){
		  light.TurnOff();
	  }

}
