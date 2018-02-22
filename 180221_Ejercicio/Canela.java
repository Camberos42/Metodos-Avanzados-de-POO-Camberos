public class Canela extends Ingredientes {

   String tama�o; 
   public Canela(Bebida ingredientesCafe, String t) {
      super(ingredientesCafe);	
      this.tama�o = t;	
   }

  public double cost() { 
        return super.cost() + getSizePrice();
    }
      
    	public double getSizePrice() {
    	      
    		double ChicoP = 1;
    		double MedianoP = 3;
    		double GrandeP = 5;

    	      if(tama�o == "Grande") {return  10 * GrandeP ;} 
    	      else if (tama�o == "Mediano" ) {return 10 * MedianoP;}
    	      return ChicoP;
    	   }

    public String getDescripcion() {
        return super.getDescripcion() + ", Canela";
    }
}