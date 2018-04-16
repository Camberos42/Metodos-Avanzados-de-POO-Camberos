import java.util.Iterator;

public class Test {
	public static void main (String args[]) {
		String[] Arreglo = {"1","2","3","4"};
		
			Iterator<String> Iterator = new EnumAdapter(new ListaEnum(Arreglo));
			
			while (Iterator.hasNext()) { System.out.println(Iterator.next()); }
			
	}
}