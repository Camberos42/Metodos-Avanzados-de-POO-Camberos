import java.util.ArrayList;
import java.util.List;

public class Provedor implements IProvedor {
	
	List<Paqueteria> ListaPaquetes;
	List<Cliente> ListaClientes;
	String Prov;
	int segundosNot; 
	int tiempoActual;
	
	public Provedor(String prov, int seconds){
		this.Prov = prov;
		ListaPaquetes = new ArrayList<Paqueteria>();
		ListaClientes = new ArrayList<Cliente>();
		this.segundosNot = seconds;
		tiempoActual = 0;
	}
	
	public void VerificarStatus(){
		if(tiempoActual >= segundosNot){
			notifyUsers();
			tiempoActual = 0;
		}
		tiempoActual++;
	}
	
	public void AgregarPaquete(String id, Cliente c, String art){
		Paqueteria pNueva = new Paqueteria(id,c, art);
		ListaPaquetes.add(pNueva);
	}
	
	
	@Override
	public void notifyUsers() {
		for (Cliente user : ListaClientes){
			user.Update(ListaPaquetes);
		}
		
	}

	@Override
	public void AgregarC(Cliente c) {
		// TODO Auto-generated method stub
		ListaClientes.add(c);
	}

	@Override
	public void Removerc(Cliente c) {
		// TODO Auto-generated method stub
		ListaClientes.remove(c);
		
	}

	

}
