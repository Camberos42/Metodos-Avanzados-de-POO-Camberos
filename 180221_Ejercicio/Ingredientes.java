public abstract class Ingredientes implements Bebida {
	
	   protected Bebida CafeIngred;
	   
	   public Ingredientes(Bebida CafeIn){
		   this.CafeIngred = CafeIn;
		   
	   }
     
	   public String getDescripcion() {
    	 return CafeIngred.getDescripcion();
    	 
	   }
	   
	   public double cost() { 
        return CafeIngred.cost();
        
	   }
}
	
