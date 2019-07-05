package basics;
/*
* In java we have mainly two types of data types
* 1. primitive
* 		boolean either true or false - Boolean
* 		char which will store single character - Character
*		byte store integer values - Byte
*		short store integer values - Short
*		int store integer values -Integer
*		long store integer values - Long
*		float store floating point number -Float
*		double store floating point number - Double
* 	
* 2. reference
* 		Arrays
* 		Strings
* 
*  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
* are known as Wrapper classes. These are used to perform different operations on data.
* 		1. Boolean
* 		2. Character
* 		3. Byte
* 		4. Short
* 		5. Integer
* 		6. Long
* 		7. Float
* 		8. Double
* 
* 	WCData_type obj_name = new WCData_type(value);
* 
* 	Type Casting: converting one type of primitive data to another type of primitive data
* 	up casting: lower memory type to higher memory type : widening : no data loss
* 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
* 
* Converting primitive data type to wrapper class: boxing
*  Converting wrapper to primitive : un-boxing
* 
* 
* syntax to create primitive data type
* data-type var-name  = value; //initialization
* data-type var-name; //declaration
* var-name = value; //assignment to the variable which is already declared
* 
* variable is nothing but name of memory location where we are storing data
*/
public class DatatypesDemo {
	
	public static void main(String[] args) {
		// boolean
		boolean b = true;
		System.out.println("boolean value is "+b);
		
		
		//char
		char ch = 'a';
		System.out.println("character value is "+ch);
		System.out.println("character size is "+Character.SIZE);
		System.out.println("character min value is "+Character.MIN_VALUE);
		System.out.println("character max value is "+Character.MAX_VALUE);
		
		
		//byte
		byte by = 123;
		System.out.println("byte value is "+by);
		System.out.println("byte size is "+Byte.SIZE);
		System.out.println("byte min value is "+Byte.MIN_VALUE);
		System.out.println("byte max value si "+Byte.MAX_VALUE);

		
		//short
		short sh = 12345;
		System.out.println("short value is "+sh);
		System.out.println("short size is "+Short.SIZE);
		System.out.println("short min value is "+Short.MIN_VALUE);
		System.out.println("short max value is "+Short.MAX_VALUE);
		
		
		//int
		int  i = 12345678;
		System.out.println("int value is "+i);
		System.out.println("int size is "+Integer.SIZE);
		System.out.println("int min value is "+Integer.MIN_VALUE);
		System.out.println("int max value is "+Integer.MAX_VALUE);
		
		
		//long
		long l = 9876543210998l;
		System.out.println("long value is "+l);
		System.out.println("long size is "+Long.SIZE);
		System.out.println("long min value is "+Long.MIN_VALUE);
		System.out.println("long max value is "+Long.MAX_VALUE);

		
		//float
		float f = 12.333f;
		System.out.println("float value is "+f);
		System.out.println("float size is "+Float.SIZE);
		System.out.println("float min value is "+Float.MIN_VALUE);
		System.out.println("float max value is "+Float.MAX_VALUE);
		
		//double
		double d = 1234.4453;
		System.out.println("double value is "+d);
		System.out.println("double size is "+Double.SIZE);
		System.out.println("double min value is "+Double.MIN_VALUE);
		System.out.println("double max value is " +Double.MAX_VALUE);
		
		//type casting
		//up casting : widening - lower data type to higher data type
		short shLow = 1234;
		int iHigh;
		iHigh = shLow;
		System.out.println("short to int and int value is "+iHigh);
		
		int iLow = 123456;
		float fHigh;
		fHigh = iLow;
		System.out.println("int to float and float value is "+fHigh);
		
		//down casting : narrowing - higher data type to lower data type
		//lower_data_type_var_name = (lower_data_type) higher_data_type_var_name
		short shHigh = 129;
		byte byLow;
		byLow = (byte) shHigh;
		System.out.println("short to byte and byte value is "+byLow);
		
		long lHigh = 1234567899l;
		int intLow;
		intLow = (int) lHigh;
		System.out.println("long to int and int value is "+intLow);
		
		float fltHigh = 1234.99f;
		int i2fLow;
		i2fLow = (int) fltHigh;
		System.out.println("int to float and int value is "+i2fLow);
		
		// primitive to wrapper 
		int ip = 20;
		Integer iw = Integer.valueOf(ip);
		System.out.println(iw);
		
		//wrapper to primitive
		Double dw = new Double(3.14);
		double dp = dw.doubleValue();
		System.out.println(dp);
		
		// primitive to reference
		//long to string
		long lp = 123456l;
		String l2s = Long.toString(lp);
		System.out.println(l2s+10);
		
		//int to string
		String i2s = Integer.toString(ip);
		System.out.println(i2s+10);
		
		//reference to primitive
		String s1 = "1234";
		int s2i = Integer.parseInt(s1);
		System.out.println(s2i);
		
		
		String s2 = "3.14";
		float s2f = Float.parseFloat(s2);
		System.out.println(s2f);
		
//		int i2 = Integer.parseInt(s2);
//		System.out.println(i2);
		
		
		
	}

}
