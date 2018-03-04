import java.io.*;
public class main {
	public static void main(String[] args) {	
	   	int c;
			try{
				InputStream in = new LowerInput(new BufferedInputStream(new FileInputStream("C:\\JavaProyects\\DecoradorIO\\src\\prueba.txt")));
				
				while((c=in.read()) >= 0){

					System.out.print((char)c);
				}
				in.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}

}
