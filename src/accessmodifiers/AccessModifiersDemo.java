package accessmodifiers;

/*
 * Access modifiers defines the scope of variables, methods and classes
 * We have 4 Types of access modifiers in Java
 * public : We can use public access modifier variables, methods, or classes anywhere in Java world.
 * private : we can access them inside the class only
 * default : we can access them inside the package only
 * protected : same as default, outside the package, child class objects can access protected variables or methods.
 */

public class AccessModifiersDemo {
	public String pVar = "public";
	private String prVar = "private";
	String dVar = "default";
	protected String proVar = "protected";
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
		System.out.println(obj.prVar);
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}
	

}
