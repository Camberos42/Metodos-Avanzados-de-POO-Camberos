public class Nombre extends Formulario{

	public Nombre(){
			setValidar(new Validar_String());
	}
	
	public void validar(String str){
		if(getValidacion().comprobar(str)){
			System.out.println("Validado");
		}
		else{
			System.out.println("No validado");
		}
	}

	
}
