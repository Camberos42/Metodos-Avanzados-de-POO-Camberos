package facade;

public class Test {
	
	public static void main(String[] args) {
	
	DVDplayer dvd = new DVDplayer();
	CDplayer cd = new CDplayer();
	lights light = new lights();
	Projector pro = new Projector();
	Screen screen = new Screen();
	Popcorns popcorn = new Popcorns();
	

	Home facade = new Home(dvd,cd,light,pro,screen, popcorn);

	
	System.out.println("Empezar pelicula");
	
	facade.watchMovie();
	System.out.println(" ");

	System.out.println("Pelicula Finalizada");
	facade.endMovie();

	
	
	}

}
