package encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		EncapsulationDemo obj1 = new EncapsulationDemo("surya", "chandanagar", 25000, "9876543210");
		EncapsulationDemo obj2 = new EncapsulationDemo("teja", "miyapur", 50000, "9877443211");
		obj1.display();
		obj2.display();
//		obj1.balance = 200000;
//		obj1.name = "siva kumari";
		obj1.display();
		System.out.println(obj1.getBalance());
		obj1.setAddress("lingampalli");
		System.out.println(obj1.getAddress());
		obj1.setPin(9988);
		System.out.println(obj1.getBalance());
		
		obj1.setPin(7896);
		
	}
}
