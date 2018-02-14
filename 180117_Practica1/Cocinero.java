
public class Cocinero extends Persona  {

	String Especialidad;
	String puesto;
	
	public Cocinero(String Nombre, int Edad, boolean genero,String Especialidad, String puesto) {
		super(Nombre, Edad, genero);
		// TODO Auto-generated constructor stub
	}
	
	public String setEspecialidad(String Esp){return this.Especialidad = Esp;}
	public String setPuesto(String p){return this.puesto = p;}
	
	public String getEspecialidad(){return this.Especialidad;}
	public String getPuesto(){return this.puesto;}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cocinero c1 = new Cocinero("Jesus", 20, true, "Ninguna", "Empleado");
		c1.brincarconpie(10);

	}


}
