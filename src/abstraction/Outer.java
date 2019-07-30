package abstraction;

public interface Outer {
	
	void methodOne();
	
	Inner method();
	
	interface Inner{
		void imethod();
	}

}
