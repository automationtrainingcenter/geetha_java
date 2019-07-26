package abstraction;

public class MultiInterfaceImpl implements InterfaceOne, InterfaceTwo{

	@Override
	public void methodOne() {
		System.out.println("interface one method one implementation");
	}

	@Override
	public void methodTwo() {
		System.out.println("interface two method two implementation");
	}
	
	


}
