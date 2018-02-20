public class Paqueteria {
	private String Id_paquete;
	private Cliente userInstance;
	private String articulo;
	private String estado;
	
	public Paqueteria(String Id_paquete,Cliente userInstance, String content){
		
		this.Id_paquete = Id_paquete;
		this.userInstance = userInstance;
		this.articulo = content;
		this.estado = "nada";
	}
	

	public String getId_paquete() {return Id_paquete;}
	
	public String getArticulo(){return articulo;}
	
	public String getStatus() {return estado;}

	public void setStatus(String status) {this.estado = status;}

	
	public Cliente getUserInstance() {return userInstance;}
	
	public void setUserInstance(Cliente userInstance) {this.userInstance = userInstance;}

	/*
	public void update(){
	}
	*/

}
