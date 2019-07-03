package basics;

public class TestVariables {
	public static void main(String[] args) {
		//accessing instance variables of VariablesDemo class
		//create an object of class
		VariablesDemo obj = new VariablesDemo();
		System.out.println("i = "+obj.i);
		
		//accessing static variables of VariablesDemo class
		System.out.println("s = "+VariablesDemo.s);
	}

}
