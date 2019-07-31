package abstraction;

public interface InterfaceDemo {
	
//	public abstract void methodOne();
	void methodOne();

	void methodTwo();
	
	void methodThree();
	
	//static method
	public static void staticMethod() {
		System.out.println("static method of the interface");
	}
	
	// default method
	public default void defaultMethod() {
		System.out.println("default method of the interface");
	}
}
