public class QuesoParmessano extends DecoradorIngredientes {
	
	 Pizza pizza;
	 
	 public QuesoParmessano(Pizza pizza){
		 this.pizza = pizza;
	 }
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Quesito Parmessano ";
	}


	public int getCost() {
		// TODO Auto-generated method stub
		return 15 + pizza.getCost();
	}

}
