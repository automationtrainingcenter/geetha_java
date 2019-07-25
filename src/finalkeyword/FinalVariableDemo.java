package finalkeyword;

public class FinalVariableDemo {
	String norVar;
	final String FINVAR = "final variable";
	
	public static void main(String[] args) {
		FinalVariableDemo obj = new FinalVariableDemo();
		obj.norVar = "normal variable";
//		obj.finVar = "final variable";
		System.out.println(obj.norVar);
		System.out.println(obj.FINVAR);
	}

}
