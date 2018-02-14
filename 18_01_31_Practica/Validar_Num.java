public class Validar_Num implements IValidar{
	
	public boolean comprobar(String cadena) {
		try{
			int i = Integer.parseInt(cadena);
			if(i > 0){
				return true;
			}
			return false;
		}catch(Exception e){
			System.out.println("Numero Equivocado");
			return false;
		}
	}

}
