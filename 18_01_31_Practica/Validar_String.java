
public class Validar_String {
	
	public boolean comprobacion(String string) {
		char[] chars = string.toCharArray();
		
		for(char s : chars){
			if(!Character.isLetter(s)) {
				return false;
			}
		}
		return true;
	}

}
