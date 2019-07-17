package classes_and_objects;

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
		address = "lingampalli";
		phnum = 9912345678l;
		course = "Python";
	}
	
	//parameterized constructor
	public ConstructorDemo(int id, String name, String address, long phnum, String course) {
		id = id;
		name = name;
		address = address;
		phnum = phnum;
		course = course;
	}
	
	public void display() {
		System.out.println("####################################################");
		System.out.println("id = "+id+"\nname "+name+"\naddress = "+address+"\nphnum = "+phnum+"\ncourse = "+course);
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
		
	}

}
