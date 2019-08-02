package exceptions;

import java.io.FileInputStream;

/*
 * Exceptions are interruptions to the normal flow of execution
 * There are two types of exceptions
 * 1. compile time exceptions also known as Checked exceptions
 * 2. Runtime exceptions also known as unchecked exceptions
 * 
 * interface Throwable{ ... }
 * class Exception implements Throwable{ ... }
 * compile time exceptions are child classes of Exception class like FileNotFoundException,
 * InterruptedException, IOException, SQLException ..etc
 * 
 * class RunTimeException extends Exception { ... }
 * 
 * All runtime exceptions are child classes of RuntimeException class like
 * StringIndexOutOfBoundException, ArrayIndexOutofBoundException, ArthimaticException ..etc
 * 
 * To handle the exceptions Java provides try and catch blocks
 * try block contains the code which will throw the exception
 * catch block contains the code to handle the exception thrown by try block
 * 
 * the catch block always follows try block, for one try block we can write as
 * many catch blocks as we want
 * 
 * finally block will execute either exception occurred or not
 * 
 * throws keyword is used postpone the exception handling and throws keyword throws the 
 * exception to method declaration
 * 
 * throw keyword is used throw a new exception
 * 
 */

public class ExceptionsDemo {
	public static void main(String[] args) {
		String s = "sunshine";
		System.out.println("first print statement");
		try {
			System.out.println(s.charAt(1));
			System.out.println(9/3);
			FileInputStream fis = new FileInputStream(".\\anyfile.txt");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("max lenght of string is "+s.length()+" please check your index number to get character");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getClass().getName());
		}
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("second print statement");
	}

}
