public class Crema extends Ingredientes {

   String tamaño; 
   
   
   	public Crema(Bebida CafeIngred, String t) {
      super(CafeIngred);	
      this.tamaño = t;	
   	}
   
   	public String getDescripcion() {
	   
	   return super.getDescripcion() + ",crema";
	}
   
   public double cost() { 
	   
        return super.cost() + getSizePrice();
    }

  public double getSizePrice() {
      
	  double ChicoP = 1;
	  double MedianoP = 3;
	  double GrandeP = 5;

      if(tamaño == "Grande") {return  GrandeP * 10 ;} 
      else if (tamaño == "Mediano" ) {return MedianoP * 10;}
      return ChicoP;
   }
}

