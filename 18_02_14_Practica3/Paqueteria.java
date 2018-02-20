public class Paqueteria {
	private String Id_paquete;
	private Cliente userInstance;
	private String articulo;
	private String status;
	
	public Paqueteria(Cliente userInstance, String content){
		this.userInstance = userInstance;
		this.articulo = content;
		this.status = "En almacen";
	}
	
	public String getId_paquete() {return Id_paquete;}
	
	public String getArticulo(){return articulo;}

	
	public Cliente getUserInstance() {return userInstance;}
	
	public void setUserInstance(Cliente userInstance) {this.userInstance = userInstance;}
	

	public String getStatus() {return status;}

	public void setStatus(String status) {this.status = status;}

	/*
	public void update(){
	}
	*/

}
