package com.qa.garage;

public class Boat extends Vehicle implements DrivingBehavior{

	public Boat(String manufacturer, String model, int year, int condition) {
		super(manufacturer, model, year, condition);
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
				+ "Boat Year: " + getYear() + "\n"
				+ "Condition: " + getCondition();
		return s;
	}

	
	public int calculateBill() {
		// TODO Auto-generated method stub
		return this.getCondition() * 15;
	}

}
