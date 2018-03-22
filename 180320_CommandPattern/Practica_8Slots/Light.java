public class Light {
	
		  private boolean on;
		  private String room;
		  
		  public Light(String room){
			  this.room = room;
		  }
		  
		  public void TurnOn(){
		    on = true;
		    System.out.print("Prendiendo luces \n");
		  }
		  public void TurnOff(){
		    on = false;
		    System.out.print("Apagando luces \n");
		  }

}
