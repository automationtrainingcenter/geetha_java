package basics;
/*
 * String is collection of characters
 * In Java we can store strings in double quotes (")
 * String is a reference type but we can store String literals
 * Strings are immutable, i.e we can't change string value
 * Strings will store in separate memory location known as String constant pool
 * 
 * int i = 20
 * 
 * int j = 20
 * 
 * address of i = 1234 in the address 1234 the value is 20
 * 
 * address of j = 3564 in the address 3564 the value is 20
 * 
 * i = 30
 * 
 * in the same address 1234 now the i value is 30
 * 
 * String s1 = "sunshine"
 * 
 * address of s1 = 2897 in the address 2897 the value is sunshine
 * 
 * String s2 = "sunshine"
 * 
 * address of s2 = 2897 in the address 2897 the value is sunshine
 * 
 * both s1 and s2 are pointing same memory location
 * 
 * s1 = "Python"
 * 
 * in address 9877 the value is Python and is pointed by s1
 * now s1 is 9877 with value Python and s2 address still 2897 with value sunshine
 * 
 * 
 */

public class StringsDemo {
	
	public static void main(String[] args) {
		//String declaration
		String s1;
		//assignment
		s1 = "sunshine";
//		String s2 = new String("python");
		//Initialization
		String s2 = "python";
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
