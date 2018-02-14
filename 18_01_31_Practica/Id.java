
public class Id extends Formulario{
	
	public Id(){
		setValidar(new Validar_Num());}

		public void validar(String s){
			if(getValidacion().comprobar(s)){
				System.out.println("Validado");
			}
			else{
				System.out.println("No Validado");
			}
		}
}
