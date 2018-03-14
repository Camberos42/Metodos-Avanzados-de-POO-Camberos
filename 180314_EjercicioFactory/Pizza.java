import java.util.ArrayList;

public abstract class Pizza {
	String nombre;
	String salsa;
	String masa;
	ArrayList<String> Ingredientes = new ArrayList<String>();
	
	public String setName(String name){
		return this.nombre = name;
		
	}
	
	public String getName() {
		return nombre;
	}

	public void prepare() {
		System.out.println("Preparando " + nombre);
	}

	public void bake() {
		System.out.println("Cocinando " + nombre);
	}


	public String toString() {
		
		StringBuffer display = new StringBuffer();
		display.append("---- " + nombre + " ----\n");
		display.append(masa + "\n");
		display.append(salsa + "\n");
		for (String ing : Ingredientes) {
			display.append(ing + "\n");
		}
		return display.toString();
	}
	

}
