package polymorphism;

public class CompileTimePolyDemo {

	public void add(int a, String b) {
		System.out.println(a + Integer.parseInt(b));
	}

	// change in type of arguments
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// change in number of arguments
	public void add(int a, String b, int c) {
		System.out.println(a + Integer.parseInt(b) + c);
	}

	// change in sequence of arguments
	public int add(String a, int b) {
		System.out.println(Integer.parseInt(a) + b);
		return b;
	}

	// we can't achieve method overloading by changing only return type
//	public int add(int a, String b) {
//		return a;
//	}
	
}
