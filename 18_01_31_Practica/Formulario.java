public abstract class Formulario {
	IValidar validar;
	String texto;
	
	public Formulario(){}
	
	public void validar(String str){}

	public void setValidar(IValidar validar){
		this.validar = validar;
	}
	
	public IValidar getValidacion(){
		return this.validar;
	}
	
	
}
