package finalkeyword;

public class FinalMethodParent {
	public void methodOne() {
		System.out.println("this is normal method in parent class");
	}
	
	
	public final void methodTwo() {
		System.out.println("this is final method in parent class");
	}
}
