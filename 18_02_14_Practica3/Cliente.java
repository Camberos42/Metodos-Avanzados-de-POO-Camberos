import java.util.List;

public abstract class Cliente {
	String NombreC;
	
	public void registerPackage(String Pid,IProvedor provedor, String art){
		
		provedor.AgregarPaquete(Pid,this, art);
		provedor.AgregarC(this);
	}
	
	public Cliente(String nc){
		this.NombreC = nc;
	}


	public void Update(List<Paqueteria> packageList) {
		// TODO Auto-generated method stub
		for (Paqueteria p : packageList){
			if (p.getUserInstance() == this){
				System.out.println("Id paquete: " + p.getId_paquete());
			}
		}
		
	}
	
}
