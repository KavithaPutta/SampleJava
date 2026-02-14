package com.inheritance.Task;

public class DeviceMain {

	public static void main(String[] args) {
		 Laptop lap = new Laptop();
	        lap.setDetails("Dell", 75000);
	        lap.displayDetails();
	        lap.powerOn();
	        lap.coding();

	        System.out.println("----------------------");

	        Mobile mob = new Mobile();
	        mob.setDetails("Samsung", 30000);
	        mob.displayDetails();
	        mob.powerOn();
	        mob.calling();

	}

}
