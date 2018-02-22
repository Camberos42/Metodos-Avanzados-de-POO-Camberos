public class Canela extends Ingredientes {

   String tamaño; 
   public Canela(Bebida ingredientesCafe, String t) {
      super(ingredientesCafe);	
      this.tamaño = t;	
   }

  public double cost() { 
        return super.cost() + getSizePrice();
    }
      
    	public double getSizePrice() {
    	      
    		double ChicoP = 1;
    		double MedianoP = 3;
    		double GrandeP = 5;

    	      if(tamaño == "Grande") {return  10 * GrandeP ;} 
    	      else if (tamaño == "Mediano" ) {return 10 * MedianoP;}
    	      return ChicoP;
    	   }

    public String getDescripcion() {
        return super.getDescripcion() + ", Canela";
    }
}