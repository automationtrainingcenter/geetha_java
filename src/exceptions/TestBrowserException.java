package exceptions;

public class TestBrowserException {
	
	public void launchBrowser(String browserName) throws InvalidBrowserException {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("launching chrome browser");
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.out.println("launching firefox browser");
		}else {
			throw new InvalidBrowserException();
		}
	}
	
	
	public static void main(String[] args){
		TestBrowserException obj = new TestBrowserException();
//		try {
//			obj.launchBrowser("firefojhgx");
//		} catch (InvalidBrowserException e) {
//			System.out.println(e.getMessage());
//		}
		obj.launchBrowser("browserName");
	}

}
