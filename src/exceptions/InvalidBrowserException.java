package exceptions;

public class InvalidBrowserException extends RuntimeException{

	public InvalidBrowserException() {
		super("browser name must be either chrome or firefox");
	}
	
	

}
