package com.qa.garage;

public class Motorcycle extends Vehicle implements DrivingBehavior{

	public Motorcycle(String manufacturer, String model, int year, int condition) {
		super(manufacturer, model, year, condition);
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
	
	@Override
	public String toString() {
		String s = "MotorCycle Model: " + getModel() + "\n" 
				+ "MotorCycle Manufacturer: " + getManufacturer() + "\n"
				+ "MotorCycle Year: " + getYear() + "\n"
				+ "Condition: " + getCondition();
		return s;
	}


	@Override
	public int calculateBill() {
		// TODO Auto-generated method stub
		return this.getCondition() * 5;
	}

}
