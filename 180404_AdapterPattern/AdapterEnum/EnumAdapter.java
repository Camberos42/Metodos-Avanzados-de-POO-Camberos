import java.util.Enumeration;
import java.util.Iterator;

public class EnumAdapter implements Iterator {
	Enumeration e;
 
	public EnumAdapter(Enumeration enumeration) { this.e = enumeration;}
 
	public boolean hasNext() { return e.hasMoreElements();}
 
	public Object next() { return e.nextElement();}
 
	public void remove() { throw new UnsupportedOperationException();}

}