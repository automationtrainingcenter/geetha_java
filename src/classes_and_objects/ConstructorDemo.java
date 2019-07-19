package classes_and_objects;

/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */
public class ConstructorDemo {
	//Studnet class
	int id;
	String name;
	String address;
	long phnum;
	String course;
	
	//default constructor
	public ConstructorDemo() {
		id = 100;
		name = "surya";
		address = "Hyderabad";
		phnum = 9912345678l;
		course = "Python";
	}
	
	//parameterized constructor
	public ConstructorDemo(int id, String name, String address, long phnum, String course) {
		this(id, name, phnum, course);
		this.address = address;
	}
	
	
	public ConstructorDemo(int id, String name, long phnum, String course) {
		this();
		this.id = id;
		this.name = name;
		this.course = course;
		this.phnum = phnum;
		
	}
	
	public void display() {
		System.out.println("####################################################");
		System.out.println("id = "+this.id+"\nname "+this.name+"\naddress = "+this.address+"\nphnum = "+this.phnum+"\ncourse = "+this.course);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj1 =new ConstructorDemo(101, "ravi", "miyapur", 8765432190l, "java");
		obj1.display();
		
		ConstructorDemo obj2 =new ConstructorDemo(102, "arun", "lingampalli", 7896543210l, "selenium");
		obj2.display();
		
		ConstructorDemo obj3 =new ConstructorDemo(103, "siva", "gachibowli", 9871112233l, "testing");
		obj3.display();
		
		ConstructorDemo obj4 =new ConstructorDemo();
		obj4.display();
		
		ConstructorDemo obj5 =new ConstructorDemo(104, "rakesh", 8765432100l, "Python");
		obj5.display();
		
		
		
	}

}
