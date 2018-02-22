public class Leche extends Ingredientes {

   String tamaño; 
   public Leche(Bebida ingredientesCafe, String t) {
      super(ingredientesCafe);	
      this.tamaño = t;	
   }
   
   public String getDescripcion() {
       return super.getDescripcion() + ", Leche";
   }

  public double cost() { 
        return super.cost() + getSizePrice();
    }
      
    	public double getSizePrice() {
    	      
    		double ChicoP = 1;
    		double MedianoP = 5;
    		double GrandeP = 9;

    	      if(tamaño == "Grande") {return  GrandeP * 10 ;} 
    	      else if (tamaño == "Mediano" ) {return MedianoP * 10;}
    	      return ChicoP;
    	}
}

