package collections;
/*
 * Set is an inbuilt data structure in Java.
 * Set is a collection to store similar type of data
 * Set is an interface and implemented by 
 * HashSet: will not maintain any order
 * LinkedHashSet: will maintain insertion order
 * TreeSet: will maintain ascending order for numeric data and alphabatical order
 * for character data
 * 
 * Set is not index based and Set doesn't store duplicate data
 * 
 */

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//create  a set
		Set<String> courses = new TreeSet<>();
		
		// verify set is empty or not
		System.out.println(courses.isEmpty());
		
		// adding the data to the set
		courses.add("c");
		courses.add("cpp");
		courses.add("Java");
		courses.add("Python");
		courses.add("Selenium");
		courses.add("testing");
		courses.add("c"); 
		courses.add("django");
		courses.add("Flask");
		
		//get the number of items in your set
		System.out.println(courses.size());

		// print the data on the console
		System.out.println(courses);
		
		// retrieving data using for each loop
		for(String course : courses) {
			System.out.println(course);
		}
		
		System.out.println("***************ITERATOR*******************");
		// retrieving data using Iterator interface
		Iterator<String> it = courses.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// delete data from the set
		courses.remove("c");
		System.out.println(courses);
		
		// search for some data
		System.out.println(courses.contains("django"));
		
		// remove all the content
		courses.clear();
		System.out.println(courses);
		
		
	}
}
