
public class Edad extends Formulario{
	
	public Edad(){
		setValidar(new Validar_Num());}

		public void validar(String str){
			if(getValidacion().comprobar(str)){
				System.out.println("Validado");
			}
			else{
				System.out.println("No Validado");
			}
		}
		
}
