import java.io.*;

public class LowerInput extends FilterInputStream{
	public LowerInput(InputStream is){
		super(is);
	}
	public int read() throws IOException{

		int i = super.read();
		if(i<0){
			return i;
		}
		return (Character.toLowerCase((char) i));
	}

}