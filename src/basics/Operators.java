package basics;

import java.util.Scanner;

public class Operators {
	/*
	 * There are mainly 5 types of operators in Java 1. Arithmetic operators + adds
	 * two operands - subtracts left operand with right operand * multiplies two
	 * operands / divides left operand with right operand and gives quotient %
	 * (Modular division) divides left operand with right operand and gives
	 * remainder
	 */
	static Scanner s;

	public void arithmatic() {
		System.out.println("ARITHMATIC OPERATORS");
		// create two local variables
		int a, b, r;
		System.out.println("please enter a and b values");
		a = s.nextInt();
		b = s.nextInt();

		// addition(+)
		r = a + b;
		System.out.println("sum of a and b is " + r);
		// subtraction(-)
		r = a - b;
		System.out.println("subtraction of a and b is " + r);
		// multiplication
		r = a * b;
		System.out.println("muliplication of a and b is " + r);
		// division(/)
		r = a / b;
		System.out.println("division of a and b is " + r);
		// modular division(%)
		r = a % b;
		System.out.println("modular division of a and b is " + r);
	}

	/*
	 * 2. Logical operators && (AND) returns true if both the operands are true else
	 * returns false || (OR) returns false if both the operands are false else
	 * return true ! (NOT) return true if given operand is false
	 */
	public void logical() {
		System.out.println("LOGICAL OPERATORS");
		boolean a, b;
		System.out.println("enter a and b values");
		a = s.nextBoolean();//true
		b = s.nextBoolean();//false
		// && (AND)
		System.out.println("a AND b is: " + (a && b));//true
		// ||(OR)
		System.out.println("a OR b is: " + (a || b));//false
		// ! (NOT)
		System.out.println("NOT A is: " + (!a));
	}

	/*
	 * 3. Relational or Conditional operators == (equals to) returns true if both
	 * the operands are equal else returns false != (not equal to) returns true if
	 * both the operands are not equal else returns false > returns true if left
	 * operand is greater than right operand else false < returns true if left
	 * operand is less than right operand else false >= returns true if left operand
	 * is greater than or equal to right operand else false <= returns true if left
	 * operand is less than or equal to right operand else false instanceOf()
	 * returns true if given object is instance of a given class else return false
	 */
	public void relational() {
		System.out.println("RELATIONAL OPERATORS");
		int a, b;
		System.out.println("please enter a and b values");
		a = s.nextInt();
		b = s.nextInt();

		// ==
		System.out.println("a == b is " + (a == b));
		// !=
		System.out.println("a != b is " + (a != b));
		// >
		System.out.println("a > b is " + (a > b));
		// <
		System.out.println("a < b is " + (a < b));
		// >=
		System.out.println("a >= b is " + (a >= b));
		// <=
		System.out.println("a <= b is " + (a <= b));
		// instanceof
		if (s instanceof Scanner) {
			System.out.println("s is instanceof Scanner");
		}else {
			System.out.println("s is not instance of Scnner");
		}

	}

	/*
	 * 4. Assignment operators = assigns right operand value to left operand += add
	 * left operand with right operand and assign value to left operand -+ subtracts
	 * left operand with right operand and assign value to left operand *=
	 * multiplies left operand with right operand and assign value to left operand
	 * /= divides left operand with right operand and assign quotient to left
	 * operand %= divides left operand with right operand and assign reminder to
	 * left operand ++ increment operand value by 1 -- decrement operand value by 1
	 */
	public void assignment() {
		System.out.println("ASSIGNMENT OPERATIONS");
		int a, b;
		System.out.println("please enter a and b values");
		a = s.nextInt();
		// =
		b = a;
		System.out.println("b value is " + b);
		// += > a += b > a = a+b
		b += a;
		System.out.println("b value is " + b);
		// -= > a -= b > a = a-b
		b -= a;
		System.out.println("b value is " + b);
		// *= > a *= b > a = a*b
		b *= a;
		System.out.println("b value is " + b);
		// /= > a /= b > a = a/b
		b /= a;
		System.out.println("b value is " + b);
		// %= > a %= b > a = a%b
		b %= a;
		System.out.println("b value is " + b);
		/*
		 * post increment: a = b++ > a = b and b = b+1 assign right operand value to the
		 * left operand then increase right operand value by 1
		 */
		b = a++;
		System.out.println("a : " + a + "\tb : " + b);
		/*
		 * pre increment: a = ++b > a = b+1 and b = b+1 increase right operand value by
		 * 1 and assign that value to left operand
		 */
		b = ++a;
		System.out.println("a : " + a + "\tb : " + b);
		/*
		 * post decrement: a = b-- > a = b and b = b-1 assign right operand value to the
		 * left operand then decrease right operand value by 1
		 */
		b = a--;
		System.out.println("a : " + a + "\tb : " + b);
		/*
		 * pre decrement: a = --b > a = b-1 and b = b-1 decrease right operand value by
		 * 1 and assign that value to left operand
		 */
		b = --a;
		System.out.println("a : " + a + "\tb : " + b);

	}

	/*
	 * 5. Bitwise operators & performs bit wise AND operation | performs bit wise OR
	 * operation
	 */

	public void bitwise() {
		System.out.println("BITWISE OPERATIONS");
		int a, b;
		System.out.println("please enter a and b values");
		a = s.nextInt();//5 = 0101
		b = s.nextInt();//3 = 0011
		// &
		System.out.printf("a & b is " + (a & b));//0001 = 1
		// |
		System.out.printf("a | b is " + (a | b));//0111 = 7
        
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		Operators obj = new Operators();
		obj.arithmatic();
		obj.logical();
		obj.relational();
		obj.assignment();
		obj.bitwise();
		s.close();

	}
}
