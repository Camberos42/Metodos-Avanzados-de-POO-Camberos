
public class Email extends Formulario{
	
	public Email(){
		setValidar(new Validar_Email());
	}
	
	@Override
	public void validar(String s){
		if(getValidacion().comprobar(s)){
			System.out.println("Validado");
		}
		else{
			System.out.println("No validado");
		}
	}

}
