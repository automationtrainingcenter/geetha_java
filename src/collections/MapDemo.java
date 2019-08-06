package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map is used to store the data in key and value pairs
 * here key can be of any type and value can be any type
 * Map is an inbuilt data structure in Java and it is an interface
 * It is implemented by 
 * HashMap: does not maintain any order
 * LinkedHashMap: maintain insertion order
 * TreeMap: maintain ascending order for numeric data and alphabetical order for character data
 * 
 */
public class MapDemo {
	
	public static void main(String[] args) {
		//create  aMap
		Map<String, Integer> courses = new HashMap<String, Integer>();
		
		// verify map is empty or not
		System.out.println(courses.isEmpty());
		
		//adding data to the map
		courses.put("c", 30);
		courses.put("cpp", 45);
		courses.put("Java", 40);
		courses.put("python", 45);
		courses.put("selenium", 60);
		
		// print the values on the console
		System.out.println(courses);
		
		// retrieve data from the map
		System.out.println(courses.get("Java"));
		
		// get all the keys of the map
		Set<String> keys = courses.keySet();
		
		// retrieve all data form the map using for each loop
		for(String key : keys) {
			System.out.println(key +" = "+courses.get(key));
		}
		
		// get all the values of the map
		Collection<Integer> values = courses.values();
		for(Integer value : values) {
			System.out.println(value);
		}
		
		// update the data
		courses.put("Java", 50);
		System.out.println(courses);
		
		// verify a key is avilable or not
		System.out.println(courses.containsKey("python"));
		
		// verify a value is availble or not
		System.out.println(courses.containsValue(40));
		
		// remove the data
		courses.remove("c");
		System.out.println(courses);
		
		courses.remove("Java", 45);
		System.out.println(courses);
		
		//remove all the data from the map
		courses.clear();
		System.out.println(courses);
		
	}

}
