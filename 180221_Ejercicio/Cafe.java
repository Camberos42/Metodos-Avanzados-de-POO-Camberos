public class Cafe implements Bebida {

	String tama�o;

   	public Cafe(String t) {
      this.tama�o = t;	
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

         if(tama�o == "Grande") {return  CafeGrandeP * 20 ;} 
         else if (tama�o == "Mediano" ) {return CafeMedianoP * 20;}
         return CafeChicoP;
      }
}