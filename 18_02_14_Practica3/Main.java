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
		
		
		
		
		
		c1.registerPackage(Fedex, "Laptop Dell");
		c2.registerPackage(DHL, "DVD");
		c3.registerPackage(Fedex, "Mochila");
		
		c1.registerPackage(correoMexico, "Libro Redes ");
		c2.registerPackage(DHL, "Gameboy");
		c1.registerPackage(correoMexico, "Ipad");
		
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
		    @Override
		    public void run() {
		    	correoMexico.checkStatus();
		    	DHL.checkStatus();
				Fedex.checkStatus();
				
		    }
		}, 0, 2000);
		
		
		
		
		
	}
}
