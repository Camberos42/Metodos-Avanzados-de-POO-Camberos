public class Crema extends Ingredientes {

   String tama�o; 
   
   
   	public Crema(Bebida CafeIngred, String t) {
      super(CafeIngred);	
      this.tama�o = t;	
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

      if(tama�o == "Grande") {return  GrandeP * 10 ;} 
      else if (tama�o == "Mediano" ) {return MedianoP * 10;}
      return ChicoP;
   }
}

