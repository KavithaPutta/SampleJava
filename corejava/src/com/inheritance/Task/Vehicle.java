package com.inheritance.Task;

public class Vehicle {
	void fuelType() {
		System.out.println("Vehicle Uses Fuel");
	}
 }
class Car extends Vehicle{
	void brand() {
		System.out.println("Car brand is Toyota");
	}
}
class ElectricCar extends Car{
	void charge() {
		System.out.println("Electric car is charging");
	}
}


