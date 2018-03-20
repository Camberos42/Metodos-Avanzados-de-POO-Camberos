
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create new Mexicana pizza
        Pizza pizza = new Mexicana();
        System.out.println( pizza.getDescription() +
                         " Cost :" + pizza.getCost());
 
        // create new Pepperoni pizza
        Pizza pizza2 = new Pepperoni();
 
        // decorate it with Chipotle 
        pizza2 = new Chipotle(pizza2);
 
        //decorate it with tocino
        pizza2 = new Tocino(pizza2);
 
        System.out.println( pizza2.getDescription() +
                         " Cost :" + pizza2.getCost());

	}

}
