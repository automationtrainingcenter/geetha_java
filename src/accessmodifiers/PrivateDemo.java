package accessmodifiers;

public class PrivateDemo {
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar);// private variable can't be accessed outside the class
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}
}
