
public class Persona {
	String Nombre;
	int Edad;
	boolean genero;
	protected HabilidadMotriz mov;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Persona p1 = new Persona("once",12,false);
	
	
	//p1.Edad = 12;
	//p1.Nombre = "once";
	p1.brincarconpie(10);
	System.out.print("La persona 1 se llama "+p1.Nombre+ " y tiene "+ p1.Edad + " años");
	
	}
	
	
	public Persona(String Nombre,int Edad, boolean genero){
		
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.genero = genero;

		
	}
	
	public String setNombre(String nomb){return this.Nombre = nomb;}
	public int setEdad(int e){return this.Edad = e;}
	public boolean setGenero(Boolean gen){return this.genero = gen;	}

	
	
	public String getNombre(){return this.Nombre;}
	public int getEdad(){return this.Edad;}
	public boolean getGenero(){return this.genero;}
	
	public void respirar(){System.out.println("Persona Respirando");}
	public void caminar(){System.out.println("Persona Caminando");}
	public void brincarconpie(int saltos){
		System.out.println("Saltandocon un pie "+ saltos + " veces");
	}
	public String hablar(){
		
		return "Persona Saludando";}
	
	


}
