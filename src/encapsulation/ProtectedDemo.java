package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar);
//		System.out.println(obj.dVar);
//		System.out.println(obj.proVar);
		
		ProtectedDemo proObj = new ProtectedDemo();
		System.out.println(proObj.proVar);
		System.out.println(proObj.pVar);
	}
}
