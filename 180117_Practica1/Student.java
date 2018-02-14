
public class Student extends Persona {

	int matricula;
	String curso;
	
	public Student(String Nombre, int Edad, boolean genero,int matricula,String curso) {
		super(Nombre, Edad, genero);
		// TODO Auto-generated constructor stub
		this.matricula = matricula;
		this.curso = curso;
		this.mov = new MoverManos();
	}
	public void brincarconpie(){
		System.out.println("\nEstudiante Brincando en un pie");
	}
	
	public int setMatricula(int m){return this.matricula = m;}
	public String setCurso(String c){return this.curso = c;}
	
	public int getMatricula(){return this.matricula;}
	public String getCurso(){return this.curso;}
	
	public void caminar(){
		System.out.println("\nEstudiante caminando");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Ana", 20, false, 20789,"Ingles");
		System.out.print("la alumna " + s1.Nombre + " Esta cursando "+ s1.curso);
		s1.caminar();
		s1.brincarconpie();
	}
	
	

}
