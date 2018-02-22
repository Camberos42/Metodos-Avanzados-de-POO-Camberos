public class Cafe implements Bebida {

	String tamaño;

   	public Cafe(String t) {
      this.tamaño = t;	
   }

    public double cost() {
        return getSizePrice();
    }
    
    public String getDescripcion() {
        return "Cafe";
    }

    public double getSizePrice() {
      
    	double CafeChicoP = 1;
    	double CafeMedianoP = 3;
    	double CafeGrandeP = 5;

         if(tamaño == "Grande") {return  CafeGrandeP * 20 ;} 
         else if (tamaño == "Mediano" ) {return CafeMedianoP * 20;}
         return CafeChicoP;
      }
}