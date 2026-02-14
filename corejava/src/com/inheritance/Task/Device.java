package com.inheritance.Task;

public class Device {
	String brand;
	double price;
	void setDetails(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
	void displayDetails() {
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
	}
	void powerOn() {
		System.out.println("Device is powering on");
	}

}
class Laptop extends Device{
	void coding() {
		System.out.println("Laptop is used for coding Development");
	}
}
class Mobile extends Device{
	void calling() {
		System.out.println("Mobile is used for calling and messaging");
	}
}
