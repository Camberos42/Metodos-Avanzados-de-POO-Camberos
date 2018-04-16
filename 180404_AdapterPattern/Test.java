public class Test {
	
	public static void main(String args[]){
		
		Turkey soypavo = new AdapterTurkeyCat();
		soypavo.gluglutear();
		soypavo.picotear();
		
		Turkey soypavo1 = new AdapterTurkeyDog();
		soypavo1.gluglutear();
		soypavo1.picotear();
		
		
		

		
		/*
		 Cat gato = new Cat();
	
	public void ladrar() {gato.Maullar();}
	
	public void morder() {gato.Rasguñar();}

	//////////////////////////////////////////////
 	
 	Turkey pavo = new Turkey();

	public void morder() {pavo.gobble();}

	public void ladrar() {pavo.peck();}
		 
		 */
	}

}
