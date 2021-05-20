package com.qa.garage;

public class Car extends Vehicle implements DrivingBehavior{

	public Car(String manufacturer, String model, int year, int condition) {
		super(manufacturer, model, year, condition);
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

	@Override
	public String toString() {
		String s = "Car Model: " + getModel() + "\n" 
				+ "Car Manufacturer: " + getManufacturer() + "\n"
				+ "Car Year: " + getYear() + "\n"
				+ "Condition: " + getCondition();
		return s;
	}


	@Override
	public int calculateBill() {
		// TODO Auto-generated method stub
		return this.getCondition() * 8;
	}
	
	

}
