package com.qa.garage;

public abstract class Vehicle {
	private String manufacturer;
	private String model;
	private int year;
	
	public Vehicle(String manufacturer, String model, int year) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
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
}
