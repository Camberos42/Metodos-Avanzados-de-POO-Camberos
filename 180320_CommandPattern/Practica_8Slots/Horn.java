public class Horn {
	
	private boolean volumen;
	private String name;
	
	public Horn(String name){
		this.name = name;
	}
	
	public void subir(){
		volumen = true;
		System.out.print("Subiendo Volumen \n");
	}
	
	public void bajar(){
		volumen = false;
		System.out.print("Bajando Volumen \n");
	}

}
