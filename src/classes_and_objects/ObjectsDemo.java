package classes_and_objects;

import java.util.Objects;

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
	public void addProduct(int i, String n, double p, String c) {
		id = i;
		name = n;
		price = p;
		category = c;
	}
	
	
	//display product details
	public void displayProdutct() {
		System.out.println("id = "+id+"\nname = "+name+"\nprice = "+price+"\ncategory = "+category);
	}
	
	//apply discount
	public double applyDiscount(int discInPercentage) {
		double discount = price * discInPercentage * 0.01;
		System.out.println("total discount is "+discount);
		price -= discount;
		return price;
	}
	
	public static void main(String[] args) {
		ObjectsDemo obj1 = new ObjectsDemo();
		obj1.addProduct(101, "Mac book air", 75000.00, "laptops");
		
		ObjectsDemo obj2 = new ObjectsDemo();
		obj2.addProduct(102, "LG G8", 45000.00, "smartphones");
		
		ObjectsDemo obj3 = new ObjectsDemo();
		obj3.addProduct(103, "Canon 1500D", 28000.00, "DSLR");
		
		obj1.displayProdutct();
		obj2.displayProdutct();
		obj3.displayProdutct();
		
		double priceAfterDiscount = obj2.applyDiscount(20);
		
		System.out.println(priceAfterDiscount);
	}
	
	
	

}
