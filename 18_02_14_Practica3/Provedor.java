import java.util.ArrayList;
import java.util.List;

public class Provedor implements IProvedor {
	
	List<Paqueteria> ListaPaquetes;
	List<Cliente> ListaClientes;
	String Prov;
	int secsForNotif; 
	int currentSecs;
	
	public Provedor(String prov, int seconds){
		this.Prov = prov;
		ListaPaquetes = new ArrayList<Paqueteria>();
		ListaClientes = new ArrayList<Cliente>();
		this.secsForNotif = seconds;
		currentSecs = 0;
	}
	
	public void checkStatus(){
		if(currentSecs >= secsForNotif){
			notifyUsers();
			currentSecs = 0;
		}
		currentSecs++;
	}
	
	public void AgregarPaquete(Cliente c, String art){
		Paqueteria pNueva = new Paqueteria(c, art);
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
