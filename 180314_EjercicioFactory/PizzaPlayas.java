public class PizzaPlayas extends PizzaStore {
	
		Pizza createPizza(String item) {
		if (item.equals("hawaiana")) {
    	    	return new PlayasPizzaHawaiana();
    	} else if (item.equals("pepperoni")) {
        		return new PlayasPizzaPeperoni();
    	} else return null;
    	
		}
}
