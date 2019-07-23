package inheritance;

public class ChildOne extends Parent{
	
	public ChildOne() {
		super(); // Parent class default constructor
		System.out.println("child class object created");
	}
	
	public void methodTwo() {
		System.out.println("child class method two");
	}

}
