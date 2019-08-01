package abstraction;

import abstraction.Outer.Inner;

/*
 * Abstraction means a plan or template to create a class
 * Abstraction means hiding the implementation details
 * we have two to implement abstraction
 * 1. abstract classes
 * 		It is class which contains at least one abstract method and declared using "abstract" keyword. 
 * Abstract method is a method with declaration only. 
 * A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
 * If in case this normal Java class failed to provide implementation to any one abstract method then that
 * normal Java class also becomes abstract class.
 * An abstract class can extends another abstract class or normal java class and it can implement an interface
 * Abstract class can contain both abstract methods and concrete methods.
 * 
 * 
 * 2. Interfaces
 * 		In interface all the methods are public and abstract by default. A normal Java class "implements" 
 * interface and provides implementation to the abstract methods.
 * By default all the methods in Interface are public and abstract
 * By default all the variables of interface are public, static and final
 * An interface can extends multiple interfaces and it can't implement another interface
 * 
 * From Java 8 onwards interface allows concrete methods
 * These concrete methods are either static methods or "default" methods
 * We can access default method using interface reference and static method using interface name
 * static methods are final methods in interface we can't override static methods in 
 * implementation classes
 * default methods are not final methods we can override these default methods in
 * implementation classes only
 * 
 * 
 * we can't create an instance of either abstract class or interface but we can create object reference,
 * 
 * Type of interfaces
 * Marker or tagged interface
 * 	it is an interface without any abstract methods like Serializable, Clonable .etc
 * 	Generally these interfaces provides special instructions to the JVM
 * 	we can have common parent to the multiple classes or interfaces
 * 
 * Functional interfaces
 * 	it is an interface with only one abstract method.
 * A class can implement this functional interface or we can write a lambda expression which will implement 
 * the abstract method of functional interface
 */

public class AbstractionDemo {
	public static void main(String[] args) {
		AbstractClassDemo acObj = new AbstractClassImpl();
		acObj.methodOne();
		acObj.methodTwo();
		acObj.methodThree();
		
		InterfaceDemo inObj = new InterfaceImpl();
		inObj.methodOne();
		inObj.methodTwo();
		inObj.methodThree();
		//accessing static method of the interface using interface name
		InterfaceDemo.staticMethod();
		//accessing default methods of the interface using object reference
		inObj.defaultMethod();
		
		//multi interface implemented by single class
		InterfaceOne i1Obj = new MultiInterfaceImpl();
		i1Obj.methodOne();
//		((MultiInterfaceImpl)i1Obj).methodTwo();
//		((InterfaceTwo)i1Obj).methodTwo();
		
		InterfaceTwo i2Obj = (InterfaceTwo)i1Obj;
		i2Obj.methodTwo();
		
		//INNER INTERFACES
		Outer oObj = new OuterInnerImpl();
		oObj.methodOne();
//		((Outer.Inner)oObj).imethod();
//		Inner innObj = oObj.method();
//		innObj.imethod();
		oObj.method().imethod();
		
//		Outer.Inner iObj = new OuterInnerImpl();
		Outer.Inner iObj = (Outer.Inner)oObj;
		iObj.imethod();
		((Outer) iObj).methodOne();
		
		
//		Functional interface implementation using normal Java class
		FuncInterface1 f1Obj = new FuncInterfaceImpl();
		f1Obj.methodOne();
		
		
//		Functional interface implementation using Anonymous class
		FuncInterface1 fAnon = new FuncInterface1() {
			
			@Override
			public void methodOne() {
				System.out.println("functional interface implementaion in anonymous class");
			}
		};
		
		fAnon.methodOne();
		
//		Functional interface implementation using lambda expressions
		FuncInterface1 flam = () -> System.out.println("functional interface implementation using lambda expression");
		flam.methodOne();
		
		FuncInterface1 flam1 = () -> System.out.println("methodone implementation using lambda expression");
		flam1.methodOne();
		
	}
}
