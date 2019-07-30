package abstraction;

public class OuterInnerImpl implements Outer, Outer.Inner{

	@Override
	public void imethod() {
		System.out.println("inner interface method");
	}

	@Override
	public void methodOne() {
		System.out.println("outer interface method");
	}

	@Override
	public Inner method() {
		return this;
	}
	
}
