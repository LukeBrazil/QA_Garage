package com.qa.garage;

public abstract class Vehicle implements DrivingBehavior{
	private String manufacturer;
	private String model;
	private int year;
	private int condition;
	
	public Vehicle(String manufacturer, String model, int year, int condition) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.condition = condition;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public void startVehicle() {
		// TODO Auto-generated method stub
		
	}


	public int getCondition() {
		return condition;
	}


	public void setCondition(int condition) {
		this.condition = condition;
	}
}
