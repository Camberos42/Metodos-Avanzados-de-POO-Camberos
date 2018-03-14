public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaStore cetys = new PizzaCetys();
 
		Pizza pizza = cetys.orderPizza("queso");
		System.out.println("Jesus ordeno una " + pizza.getName() + "\n");
 
		pizza = cetys.orderPizza("hawaiana");
		System.out.println("Edgar ordeno una " + pizza.getName() + "\n");

		pizza = cetys.orderPizza("pepperoni");
		System.out.println("Miguel ordeno una " + pizza.getName() + "\n");

	}

}
