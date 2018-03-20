public class Peppers extends DecoradorIngredientes{
	
	 Pizza pizza;
	 
	 public Peppers(Pizza pizza){
		 this.pizza = pizza;
	 }
	 
	 public int getCost(){ 
		 return 25 + pizza.getCost();
		 
	 }

	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Peppers ";
	}

}
