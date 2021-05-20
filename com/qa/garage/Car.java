package com.qa.garage;

public class Car extends Vehicle implements DrivingBehavior{

	public Car(String manufacturer, String model, int year) {
		super(manufacturer, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Car is accelerating...");
	}

	@Override
	public void brakeing() {
		// TODO Auto-generated method stub
		System.out.println("Car is brakeing...");
	}
	
	

}
