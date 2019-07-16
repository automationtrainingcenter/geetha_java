package classes_and_objects;
/*
 * Class is a blueprint or template to create an object
 * it is logical entity which does not exist physically.
 * class can be used to create any number of objects.
 * Class contains properties and methods. Properties are combination of data types 
 * and variables. Methods are actions or behavior of the object
 * To create a class syntax is 
 * 
 * access_modifiers class <ClassName>{
 * 	properties;
 * 
 * 	methods(){ ... }
 * 
 * }
 * 
 * Object is an instance of the class. Object is a real time entity 
 * or run time entity which exists physically. Without an object there is 
 * no value for the class. To create the object use the following syntax
 * 
 * ClassName obj_name = new ClassName();
 * 
 * Note: To access instance properties and methods of a class we have to use
 * obj_name (i.e. object of the class) using . operator
 * eg: obj_name.property_name and obj_name.method_name();
 * 
 * To access static properties and methods of a class we have to use Class name
 * using . operator
 * eg: ClassName.property_name and Class_name.method_name();
 * 
 * 
 */

public class ObjectsDemo {
	
	//properties
	int id;
	String name;
	double price;
	String category;
	
	//store the data in instance variables
	public void addProduct() {
		
	}

}
