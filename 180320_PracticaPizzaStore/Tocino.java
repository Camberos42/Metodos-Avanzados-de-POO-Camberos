public class Tocino extends DecoradorIngredientes {
	
	 Pizza pizza;
	 
	 public Tocino(Pizza pizza){
		 this.pizza = pizza; 
	 }

	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Tocinito ";
	}
	
	public int getCost(){ 
		 return 30 + pizza.getCost(); 
		 
	 }

}
