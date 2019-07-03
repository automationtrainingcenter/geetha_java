package basics;
/*
 * Variable is name of memory location where we store data. 
 *
 * if we want to make any variable as constant then use "final" keyword.
 * 
 * Types of variables
 * 
 * 1.Instance variables 
 * 		It is a variable which is declared inside the class but outside of any method. 
 * These are object level. We can access these variables directly inside the class 
 * instance methods and by creating an object of the class in same class static methods 
 * and outside the class. 
 * Variable declaration
 * 		access_modifier data_type var_name; 
 * accessing variable 
 * 		object_name.var_name = value; 
 * Initialization variable: At the time of variable declaration we are going to assign some value 
 * 		access_modifier data_type var_name = value;
 * 
 * 2.static variables 
 * 		It is a variable which declared inside the class and outside of any method 
 * but declared using 'static' keyword. These are class level i.e. object to object these 
 * variables will share the information. We can access these variables directly inside the 
 * class and by using class_name outside the class.
 * Variable declaration 
 * 		access_modifier static data_type var_name; 
 * accessing variable 
 * 		class_name.var_name = value; 
 * Initialization
 * 		access_modifier static data_type var_name = value;
 * 
 * 3.local variables 
 * 		It is variable which is declared inside any method. we can
 * access this variable inside the method only. 
 * Variable declaration 
 * 		data_type var_name; 
 * accessing variable 
 * 		var_name = value; 
 * Initialization 
 * data_type var_name = value;
 * 
 */  
public class VariablesDemo {
	
	//instance variable
	int i = 10;
	
	//static variable
	static int s = 20;
	
	
	//instance method
	public void iMethod() {
		System.out.println("instance method of the class");
		//accessing instance variable
		System.out.println("i = "+i);
		//accessing static variable
		System.out.println("s = "+s);
		
	}
	
	
	//static method
	public static void main(String[] args) {
		//local variable
		int l = 30;
		System.out.println("local variable l = "+l);
		//accessing instance variable
		// create an object of the class
		VariablesDemo obj = new VariablesDemo();
		System.out.println("i = "+obj.i);
		
		//accessing static variable
		System.out.println("s = "+VariablesDemo.s);
		
	}

}
