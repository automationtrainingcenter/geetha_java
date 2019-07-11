package basics;

import java.util.Scanner;

/*These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		// simple if statement
		if (num >= 0) {
			System.out.println("given number is positive");
		}

		// if else statement
		if (num % 2 == 0) {
			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");
		}

		// facebook scenario
		System.out.println("enter username:");
		String username = sc.next();
		System.out.println("enter password");
		String password = sc.next();
		
		if(username.equalsIgnoreCase("surya") && password.equals("sunshine")) {
			System.out.println("welcome "+username);
		}else {
			System.out.println("invalid credentials");
		}

		// nested if
		// gmail scenario
		System.out.println("enter username:");
		String gusername = sc.next();
		if(gusername.equalsIgnoreCase("surya")) {
			System.out.println("enter password");
			String pass = sc.next();
			if(pass.equals("sunshine")) {
				System.out.println("welcome "+gusername);
			}else {
				System.out.println("invalid password");
			}
		}else {
			System.out.println("please enter valid username");
		}

		// else if ladder
		System.out.println("enter your browser name");
		String brname = sc.next();
		
		brname = brname.toLowerCase();
		if(brname.equals("chrome")) {
			System.out.println("launching chrome browser");
		}else if(brname.equals("firefox")) {
			System.out.println("launhing firefox browser");
		}else if(brname.equals("opera")) {
			System.out.println("launching opera browser");
		}else if(brname.equals("edge")) {
			System.out.println("launching edge browser");
		}else {
			System.out.println("launching IE browser");
		}
		
		System.out.println("enter your marks");
		int marks = sc.nextInt();
		if (marks >= 0 && marks < 40) {
			System.out.println("Failed...");
		} else if (marks >= 40 && marks < 50) {
			System.out.println("Just passed");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("second class");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("first class");
		} else if (marks >= 70 && marks <= 100) {
			System.out.println("distinction");
		} else {
			System.out.println("invalid marks");
		}

		// switch case
		System.out.println("select your level 1. begginer 2. modern 3. Advanced");
		String level = sc.next();
		switch (level.toLowerCase()) {
		case "begginer":
			System.out.println("Begginer level");
			break;
		case "modern":
			System.out.println("Modern level");
			break;
		case "advanced":
			System.out.println("Advanced level");
			break;
		default:
			System.out.println("invalid level");
		}
	}
}
