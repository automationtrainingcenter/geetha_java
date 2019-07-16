package basics;

import java.util.Scanner;

/*
 * If we want to execute a block of code for certain number of times then 
 * we are going to use loops
 * Every loop will have three parts
 * 1. initialization
 * 2. condition
 * 3. increment or decrement

 * In Java we have mainly 4 types of loops
 * Infinite loop: A loop which will run forever
 * 
 * 1. while loop
 * 		initialization;
 * 		while(expression){
 * 			statements;
 * 			increment/decrement;
 * 		}
 *  While will verify the condition first then only it'll execute the statements. 
 * 	i.e If the while condition is true then the statements inside the while block will be executed
 * 	The minimum iteration count is 0
 * 	
 * 2. do while loop
 * 		initialization;
 * 		do{
 * 			statements;
 * 			increment/decrement;
 * 		}while(expression);
 *  do-while loop will execute the statement inside the do block for first time then it will verify 
 *  the condition of while . If it is true then the statements inside do block will repeat execution 
 *  else do-while block will be terminated.
 *  The minimum iteration count is 1
 * 
 * 3. for loop
 * 		for(initialization; expression; increment/decrement){
 * 			statements;
 * 		}
 * The minimum iteration count is 0
 * 
 * 4. for-each loop
 * 		It is used iterate over an array or collection
 * 		for(array_type var_name : array_var_name){
 * 			statements;
 * 		}
 * 
 * 
 * we can terminate the loop based on some expression using "break" statement
 * we can skip the current iteration of the loop based on some condition using "continue" statement
 */

public class LoopsDemo {
	public static void main(String[] args) {
		// print numbers from 10 to 20
		// while loop
		// initialization
		int i = 10;
		// condition
		while (i <= 20) {
			System.out.println(i);
			// increment
			i++;
		}

		// print even numbers from 20 to 0 using do while loop
		// initialization
		int j = 20;
		do {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			// decrement
			j--;
		} while (j >= 0);

		// read strings from the console until length of the entered string is less than
		// 7
		Scanner sc = new Scanner(System.in);
//		String str;
//		do {
//			System.out.println("enter some string");
//			str = sc.next();
//		} while (str.length() < 7);

		// for loop to print multiples of 3 from 1 to 10
		for (int k = 1; k < 11; k++) {
			System.out.println(k * 3);
		}

		// break statement
		for (int k = 0; k < 10; k++) {
			if (k == 5) {
//				break;
				continue;
			}
			System.out.println(k);
		}

		// gmail scenario
//		String username = "";
//		boolean isValidPassword = false;
//		do {
//			System.out.println("enter username");
//			username = sc.next();
//			if (username.equalsIgnoreCase("surya")) {
//				for (int k = 0; k < 3; k++) {
//					System.out.println("enter password");
//					String password = sc.next();
//					if (password.equals("sunshine")) {
//						System.out.println("welcome surya");
//						isValidPassword = true;
//						break; // for loop
//					} else {
//						System.out.println("invalid password");
//					}
//				}
//				if (isValidPassword) {
//					break; // while loop
//				} else {
//					System.out.println("account blocked");
//					break; // while loop
//				}
//			} else {
//				System.out.println("invalid username");
//			}
//		} while (true);

		// string reverse
		String str = "python is fun to learn!";
		String rstr = "";
		for (int k = str.length(); k > 0; k--) {
			rstr += str.charAt(k - 1);
		}
		System.out.println(rstr);

		// x= {1,2,3,4,5} and y = {2,3,4} then result array = {1, 5}
		int[] x = { 1, 2, 3, 4, 5, 8, 10,11 };
		int[] y = { 2, 3, 4, 8 };
		int[] r = new int[x.length - y.length];
		int l = 0;

		for (int m = 0; m < x.length; m++) {
			boolean isMatchFound = false;
			for (int n = 0; n < y.length; n++) {
				if (x[m] == y[n]) {
					isMatchFound = true;
					break;
				}
			}
			if (!isMatchFound) {
				r[l] = x[m];
				l++;
			}
		}
		for (int k = 0; k < r.length; k++) {
			System.out.println(r[k]);
		}

	}
}
