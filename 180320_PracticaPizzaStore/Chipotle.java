public class Chipotle extends DecoradorIngredientes{
	
	 Pizza pizza;
	 
	 public Chipotle(Pizza pizza){
		 this.pizza = pizza; 
		 }
	    
	 public int getCost(){ 
		 return 20 + pizza.getCost(); 
		 
	 }
	 
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Chipotle ";
	}

}
