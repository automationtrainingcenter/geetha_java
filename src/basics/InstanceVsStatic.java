package basics;

public class InstanceVsStatic {
	
	int i;
	static int j;
	
	public void display() {
		System.out.println("i = "+i+"\tj= "+j);
	}
	
	public static void main(String[] args) {
		InstanceVsStatic obj1 = new InstanceVsStatic();
		obj1.i = 10;
		InstanceVsStatic.j = 200;
		InstanceVsStatic obj2 = new InstanceVsStatic();
		obj2.i = 20;
		InstanceVsStatic obj3 = new InstanceVsStatic();
		obj3.i = 30;
		InstanceVsStatic obj4 = new InstanceVsStatic();
		obj4.i = 40;
		InstanceVsStatic.j = 4000;
		obj1.display();
		obj2.display();
		obj2.i = 206;
		obj2.display();
		InstanceVsStatic.j = 400;
		obj3.display();
		obj4.display();
		
				
	}

}
