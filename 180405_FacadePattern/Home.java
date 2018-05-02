package facade;

public class Home {
	
	DVDplayer dvd;
	CDplayer cd;
	lights light;
	Projector proyector;
	Screen screen;
	Popcorns popcorn;


	public Home(DVDplayer dvd, CDplayer cd, lights light, Projector pro,Screen screen,Popcorns popcorn){
		
		this.dvd = dvd;
		this.cd = cd;
		this.light = light;
		this.proyector= pro;
		this.screen = screen;
		this.popcorn = popcorn;
	}

	

	public void watchMovie(){
		dvd.On();
		dvd.Insert();
		dvd.Play();
		proyector.On();
		screen.Down();
		popcorn.On();
		light.Off();
	}

	public void endMovie(){
		light.On();
		proyector.Off();
		popcorn.Off();
		dvd.Eject();
		dvd.Off();
		screen.Up();
	}


}
