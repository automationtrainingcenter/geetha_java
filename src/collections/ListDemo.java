package collections;

import java.util.LinkedList;
import java.util.List;

/*
 * 
 * List is an interface in java an is an inbuilt data structure in Java
 * is used to store multiple values of similar type
 * List allows duplicate data also
 * List is implemented by 
 * ArrayList:
 * 	is same an array but the size is dynamic.
 * LinkedList
 * 	it won't store data in contagious memory locations
 * 	
 */
public class ListDemo {
	public static void main(String[] args) {
		//creating a list
		List<String> courses = new  LinkedList<>();
		
		
		//verify list is empty or not
		System.out.println(courses.isEmpty());
		
		//storing data to the list
		courses.add("c");
		courses.add("cpp");
		courses.add("Java");
		courses.add("Python");
		courses.add("c"); 
		courses.add("django");
//		System.out.println(courses.isEmpty());
		
		// find the number of items in your list
		System.out.println(courses.size());
		
		//print all the data of the list on the console
		System.out.println(courses);
		
		// retrieve the data from the list
		System.out.println(courses.get(2));
		
		// retrieve data using for each loop
		for(String course : courses) {
			System.out.println(course);
		}
		
		//normal for loop to retrieve the data
		for(int i = 0; i< courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		
		// insert the data
		courses.add(2, "selenium");
		System.out.println(courses);
		
		// update the data
		courses.set(5, "Flask");
		System.out.println(courses);
		
		//delete the data
		courses.remove(1);
		System.out.println(courses);
		
		courses.remove("c");
		System.out.println(courses);
		
		/* l1 = 12 13 15 23 21 26 
		 * l1.remove(26) throws IndexOutOfBoundException
		 * l1.remove(Integer.valueOf(26)) // removes the value 26
		 */
		
		//search the data in  a list
		System.out.println(courses.contains("flask"));
		
		// to remove all the content of your collection
		courses.clear();
		
		System.out.println(courses);
		
	}

}
