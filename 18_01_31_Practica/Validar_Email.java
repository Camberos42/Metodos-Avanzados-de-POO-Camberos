import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar_Email implements IValidar {
	
	public boolean comprobacion(String str) {
		// TODO Auto-generated method stub
		if (str == null) 
			return false;        
		 
		Matcher m = email.matcher(str);
		return m.matches();
	}
	
	private final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
			"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	private final Pattern email = Pattern.compile(EMAIL_REGEX);
}
