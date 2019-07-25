package finalkeyword;

public class FinalMethodChild extends FinalMethodParent {

	@Override
	public void methodOne() {
		System.out.println("normal method of parent class overridden in child class");
	}
	
//	@Override
//	public final void methodTwo() {
//		
//	} // we can't override final methods of parent

}
