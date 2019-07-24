package polymorphism;

public class RunTimePolyChild extends RunTimePolyParent{

	@Override
	public void add(int a, String b) {
		int ib = Integer.parseInt(b);
		System.out.println(a+ib);
	}
	


}
