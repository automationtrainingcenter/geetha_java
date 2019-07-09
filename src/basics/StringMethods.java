package basics;

public class StringMethods {
	
	public static void main(String[] args) {
		String s1 = "sunshine";
		String s2 = "GEETHA";
		String s3 = "Sunshine";
		String s4 = "Welcome to Java programming course by Surya at Sunshine";
		String s5 = "                 actual data                    ";
		String s6 = "";
		
		// isEmpty() returns true if given string empty else false
		System.out.println(s1.isEmpty()); // false
		System.out.println(s6.isEmpty()); // true
		
		// length() returns number of characters in a given string
		System.out.println(s1.length());
		System.out.println(s3.length());
		
		// equals() returns true if given two strings have equals data and case
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equals("sunshine")); // true
		System.out.println(s1.equals(s2)); // false 
		
		
		// equalsIgnoreCase() returns true if given two strings have equal data it does not consider case
		System.out.println(s1.equalsIgnoreCase(s3)); // true
		System.out.println(s1.equalsIgnoreCase("sunshine")); // true
		System.out.println(s1.equalsIgnoreCase(s2)); // false
		
		// contains(String sub_string) returns true if given substring is present in a given string
		System.out.println(s4.contains(s3)); //true
		System.out.println(s4.contains(s1)); // false
		System.out.println(s4.contains("python")); // false
		
		// toLowerCase() returns a string with all lower case characters
		System.out.println(s2.toLowerCase()); // geetha 
		System.out.println(s3.toLowerCase()); // sunshine
		
		// toUpperCase() return a string with all uppercase characters
		System.out.println(s1.toUpperCase()); // SUNSHINE
		System.out.println(s3.toUpperCase()); // SUNSHINE

		// startsWith(String sub_string) returns true if given string starts with  given sub string
		System.out.println(s1.startsWith("sun")); // true
		System.out.println(s4.startsWith("welcome")); // false
		
		// endsWith(String sub_string) returns true if given string ends with given sub string
		System.out.println(s1.endsWith("shine")); // true
		System.out.println(s4.endsWith(s3)); // true
		System.out.println(s3.endsWith("the")); // false
		
		// replace(old, new) replaces old character or string with new character or string
		System.out.println(s1.replace('s', 'S'));
		s4 = s4.replace("Java", "Python");
		System.out.println(s4);
		
		// toCharArray() returns an array of characters which are characters in my string
		char[] chars = s1.toCharArray();
		System.out.println(chars[3]);
		
		// split() returns an array of sub string of given string which were spilt based on given expression
		String[] words = s4.split(" ");
		for(String word : words) {
			System.out.println(word);
		}
		
		// trim() returns a string after removing extra spaces from a given string
		System.out.println(s5);
		System.out.println(s5.trim());
	}

}
