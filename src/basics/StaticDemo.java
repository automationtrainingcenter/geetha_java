package basics;

public class StaticDemo {
	int i = 0;
	static int j = 0;
	
	public void increment() {
		i++;
		j++;
		System.out.println("i = "+i+" j = "+j);
	}
	
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.increment();//  i = 1  j = 1
		StaticDemo obj2 = new StaticDemo();
		obj2.increment();// i = 1 j = 2
		StaticDemo obj3 = new StaticDemo();
		obj3.increment();// i = 1 j = 3
		obj1.increment();
		obj1.increment();
	}

}
