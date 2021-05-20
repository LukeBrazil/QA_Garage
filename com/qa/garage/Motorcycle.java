package com.qa.garage;

public class Motorcycle extends Vehicle implements DrivingBehavior{

	public Motorcycle(String manufacturer, String model, int year) {
		super(manufacturer, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Motorcycle is accelerating...");
	}

	@Override
	public void brakeing() {
		// TODO Auto-generated method stub
		System.out.println("Motorcycle is brakeing...");
	}

}
