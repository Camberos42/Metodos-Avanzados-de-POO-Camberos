import java.util.Arrays;
import java.util.ArrayList;
import java.util.Enumeration;

	public class ListaEnum implements Enumeration<String> {
		
		ArrayList<String> list;
		int i,end;
		
		ListaEnum(String[] s){
		list = new ArrayList<String>();
		list.addAll(Arrays.asList(s));
		i = 0;
		end = list.size();
	}
		
	public String nextElement() { return list.get(i++);}
	
	public boolean hasMoreElements() {
	
		if(i < end){ return true;}
		return false;
	}
	
}