package basics;

import java.util.Scanner;

public class ReadDataDemo {
	public static void main(String[] args) {
		// create Scanner class object
		Scanner sc = new Scanner(System.in);
		// Scanner class provides several methods to read data from the console
		// read an integer
		System.out.println("enter a number");
		int i = sc.nextInt();
		System.out.println("integer value is "+i);
		
		// read a float
		System.out.println("enter a float number");
		float f = sc.nextFloat();
		System.out.println("float variable is "+f);
		
		//read a double
		System.out.println("enter a double number");
		double d = sc.nextDouble();
		System.out.println("double variable is "+d);
		
		//read a long value
		System.out.println("enter a long number");
		long l = sc.nextLong();
		System.out.println("long variable is "+l);
		
		//read a boolean value
		System.out.println("enter a boolean");
		boolean b = sc.nextBoolean();
		System.out.println("boolean variable is "+b);

		// read string with multiple words
		System.out.println("enter a string with multiple words");
		String s = sc.nextLine();
		System.out.println("string with multiple words is " + s);

		// read a string
		System.out.println("enter a string");
		String str = sc.next();
		System.out.println("string value is " + str);
		
		// read character 
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);
		System.out.println("character value is "+ch);
	}
}
