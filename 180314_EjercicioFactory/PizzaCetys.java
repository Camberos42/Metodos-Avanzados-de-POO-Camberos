public class PizzaCetys extends PizzaStore {
	
	Pizza createPizza(String item) {
    	if (item.equals("queso")) {
        		return new PizzaCetysQueso();
    	} else if (item.equals("hawaiana")) {
    	    	return new PizzaCetysHawaiana();
    	} else if (item.equals("pepperoni")) {
        		return new PizzaCetysPeperoni();
    	} else return null;
}
	
		
}
		
