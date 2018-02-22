public class Test {
   public static void main(String[] args) {

      Bebida cafe = new Cafe("Chico");
      cafe = new Crema(cafe,"Chico");
      Bebida CafeCLeche = new Leche(new Cafe("Chico"),"Chico");
      
      Bebida cafe2 = new Cafe("Grande");
      cafe2 = new Canela(cafe2,"Grande");
      Bebida CafeCCanela = new Leche(new Cafe("Grande"),"Grande");
      

     
      
      System.out.println("Los ingredientes que contiene el cafe son: "+ cafe.getDescripcion() + " y cuesta "+cafe.cost()+" $");

      System.out.println("Los ingredientes que contiene el cafe son: "+ CafeCLeche.getDescripcion() + " y cuesta "+ CafeCLeche.cost()+" $");
      
      
      System.out.println("Los ingredientes que contiene el cafe2 son: "+ CafeCCanela.getDescripcion() + " y cuesta "+ CafeCLeche.cost()+" $");
      
      

   }
}