package com.qa.garage;

public class Boat extends Vehicle implements DrivingBehavior{

	public Boat(String manufacturer, String model, int year) {
		super(manufacturer, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Boat is accelerating...");
	}

	@Override
	public void brakeing() {
		// TODO Auto-generated method stub
		System.out.println("Boat is slowing...");
	}
	
	@Override
	public String toString() {
		String s = "Boat Model: " + getModel() + "\n" 
				+ "Boat Manufacturer: " + getManufacturer() + "\n"
				+ "Boat Year: " + getYear();
		return s;
	}

}
