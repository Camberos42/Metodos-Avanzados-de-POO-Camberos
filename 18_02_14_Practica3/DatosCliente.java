import java.util.List;

public class DatosCliente extends Cliente {
	public DatosCliente(String name){
		super(name);
	}
	
	public void Update(List<Paqueteria> packageList){
		for (Paqueteria p : packageList){
			if (p.getUserInstance() == this){
				System.out.println("El id del paquete: " + p.getId_paquete()+ 
								   " , propietario : " + p.getUserInstance().NombreC + 
								   " articulo: " + p.getArticulo());
			}
		}
	}

}
