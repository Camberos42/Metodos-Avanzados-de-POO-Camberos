import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static void main(String[] args){
		
		DatosCliente c1 = new DatosCliente("Hector");
		DatosCliente c2 = new DatosCliente("Rodrigo");
		DatosCliente c3 = new DatosCliente("Oscar");
		Provedor correoMexico = new Provedor("cmex",4);
		Provedor DHL = new Provedor("dhl",1);
		Provedor Fedex = new Provedor("fedex",3);
	
		c1.RegistrarPaquete("Fedex001",Fedex,"Laptop Dell");
		c2.RegistrarPaquete("dhl001",DHL, "DVD");
		c3.RegistrarPaquete("fedex002",Fedex, "Mochila");
		c1.RegistrarPaquete("cm001",correoMexico, "Libro Redes ");
		c2.RegistrarPaquete("dhl002",DHL, "Gameboy");
		c1.RegistrarPaquete("cm003",correoMexico, "Ipad");
		
		//Tiempo
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
		    @Override
		    public void run() {
		    	correoMexico.VerificarStatus();
		    	DHL.VerificarStatus();
				Fedex.VerificarStatus();
				}
		    }, 0, 2000);
		}
}
