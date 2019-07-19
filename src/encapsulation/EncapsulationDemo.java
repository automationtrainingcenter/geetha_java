package encapsulation;

import java.util.Scanner;

/*
 * Encapsulation means hiding data from the outside world
 * or binding data (properties) and actions we can perform on data together
 * to hide the properties of a class declare those properties using private
 * access modifiers
 * 
 *  private access modifiers allows properties with in the class only
 *  
 *  create getter and setter methods for respective properties
 *  
 *  getter methods are used to retrieve the data
 *  setter methods are used to set or modify the data 
 * 
 */

public class EncapsulationDemo {
	// Account
	private int accNum;
	private String name;
	private String address;
	private double balance;
	private String phone_num;
	private static int i = 0;
	private int pin;

	private EncapsulationDemo() {
		this.accNum = 12345980;
		this.accNum += i;
		i++;

	}

	public EncapsulationDemo(String name, String address, double balance, String phone_num) {
		this();
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.phone_num = phone_num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		Scanner sc = new Scanner(System.in);
		boolean status = false;
		if (this.pin == 0) {
			System.out.println("set the pin first");
		} else {
			System.out.println("enter your pin");
			int p = sc.nextInt();
			if (this.pin == p) {
				status = true;
			} else {
				System.out.println("invalid pin");
			}
		}
		if(status) {
			return this.balance;
		}else {
			return 0;
		}

	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public int getAccNum() {
		return accNum;
	}

	public String getName() {
		return name;
	}

	public void setPin(int pin) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your last 4 digits of account number");
		int acc4digits = sc.nextInt();
		if (this.accNum % 10000 == acc4digits) {
			if (this.pin != 0) {
				System.out.println("enter your phonenum");
				String pn = sc.next();
				if (pn.equals(this.phone_num)) {
					this.pin = pin;
					System.out.println("pin has been updated successfully");
				} else {
					System.out.println("invali phone ... please try after some time");
				}
			} else {
				this.pin = pin;
				System.out.println("pin has been set successfully");
			}
		} else {
			System.out.println("invalid account number....");
		}

	}

	public void display() {
		System.out.println("name = " + this.name + "\naddress = " + this.address + "\naccount num = " + this.accNum);
	}

}
