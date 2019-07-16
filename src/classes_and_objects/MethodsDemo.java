package classes_and_objects;
/*
 * Method is a block of statements which are grouped together to perform certain task
 * Method contains 3 parts
 * 1. Method declaration or Method head
 * 2. Method definition or method body
 * 3. Method Call
 * 
 * In general we have 4 types of methods based on input and output
 * 1. method without input and without output
 * 2. method without input and with output
 * 3. method with input and without output
 * 4. method with input and with output
 * 
 * syntax:
 * declaration
 * access_modifier return_type method_name(arg1, arg2, arg3 ... argN){
 * 		method definition or method body
 * 		statements;
 * 		return statement; //output
 * }
 * 
 * 
 * method call:
 * data_type_return_type var_name = method_name(para1, para2, para3 ... paraN);
 * 
 * Note: To create a static method we have to use static keyword after
 * access modifier in method declaration
 * 
 * here arguments or parameters and return type are optional
 * if a method does not have return type then specify return type as void in method
 * declaration and that method does not have return statement
 * 
 */

public class MethodsDemo {
	
	//method without input and without output
	public void methodOne() {
		System.out.println("method without input and without output");
	}
	
	
	// method with input and without output
	public void methodTwo(String name) {
		System.out.println("method with input and without output");
		System.out.println("and input to the method is "+name);
	}
	
	//method without input and with output
	public boolean methodThree() {
		System.out.println("method without input and with output");
		System.out.println("method returns a boolean value i.e,");
		return true;
	}
	
	//method with input and with output
	public int methodFour(int a, int b) {
		System.out.println("method with input and with output");
		System.out.println("method is accepting two inputs a = "+a+" b = "+b);
		System.out.println("method return sum of a and b i.e.");
		return a+b;
	}
	
	
	public static void main(String[] args) {
		//create an object of this class
		MethodsDemo obj = new MethodsDemo();
		obj.methodOne();
		obj.methodTwo("surya");
		boolean result = obj.methodThree();//use cntrl + 1 to assign statement to local variable
		System.out.println(result);
		int sum = obj.methodFour(1, 2);
		System.out.println(sum);
	}

}
