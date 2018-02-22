public class Leche extends Ingredientes {

   String tama�o; 
   public Leche(Bebida ingredientesCafe, String t) {
      super(ingredientesCafe);	
      this.tama�o = t;	
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

    	      if(tama�o == "Grande") {return  GrandeP * 10 ;} 
    	      else if (tama�o == "Mediano" ) {return MedianoP * 10;}
    	      return ChicoP;
    	}
}

