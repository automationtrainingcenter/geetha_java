package inheritance;
/*
 * Inheritance means acquiring the properties and behavior (methods) of one class (parent or super or base)in 
 * another class (child or sub). The main advantage of Inheritance is code re-usability
 * 
 * There are 5 types of inheritance in OOP
 * 
 * single: single parent and single child. A -> B
 * multilevel: parent and child and sub child. A->B->C
 * Hierarchical: single parent and multiple child. A->B A->C
 * multiple: multiple parent and single child. A->C B->C
 * Hybrid: combination hierarchical and multiple. 
 * 
 * 
 * multiple and hybrid inheritance is not possible directly in Java.
 * 
 * Inside the child class we can access Parent class properties and methods directly and outside the child class
 * By creating a child class object we can access parent class properties and methods
 * 
 * To achieve inheritance we have to use extends keyword
 * 
 * child class extends parent class
 * 
 * super keyword always represents the parent class instance. 
 * 
 * if a Parent class have a parameterized constructor only then child class must 
 * contain a parameterized constructor which will call the Parent class constructor
 */

public class InheritanceDemo {
	public static void main(String[] args) {
		Parent pObj = new Parent();
		pObj.methodOne();
		
		// single inheritance Parent - ChildOne
		ChildOne c1Obj = new ChildOne();
		c1Obj.methodTwo(); // ChildOne class method
		c1Obj.methodOne(); // Parent class method
		
		//multi level inheritance Parent - ChildOne - SubChild
		SubChild scObj = new SubChild();
		scObj.methodThree(); // SubChild class method
		scObj.methodTwo(); // ChildOne class method 
		scObj.methodOne(); // Parent class method
		
		
		// hierarchical inheritance Parent - ChildOne and Parent - ChildTwo
		ChildTwo c2Obj = new ChildTwo();
		c2Obj.methodFour(); // ChildTwo method 
		c2Obj.methodOne(); // Parent method
//		c2Obj.methodTwo();
		
		// object creation to the child class and object reference to the Parent class
		Parent pc1Obj = new ChildOne();
		pc1Obj.methodOne(); // Parent class method
		// to call child class methods using Parent class reference type cast the 
		// Parent class object to Child Class
//		ChildOne c1 = (ChildOne) pc1Obj;
//		c1.methodTwo(); // ChildOne class method
		((ChildOne)pc1Obj).methodTwo();
		
		
		
	}
}
