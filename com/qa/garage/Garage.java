
package com.qa.garage;

import java.util.*;

public class Garage {
	private String name;
	
	public Garage(String name) {
		this.name = name;
	}
	
	List<Object> myGarage = new ArrayList<Object>();
	
	public void addVehicle(Object vehicle) {
		myGarage.add(vehicle);
	}
	
	public void showGarage() {
		System.out.println("Garage Inventory: \n");
		for(int i = 0; i < myGarage.size(); i++) {
			System.out.println(myGarage.get(i).toString());
			System.out.println(" ");
		}
	}
	

	
	public void deleteVehicle(Object vehicle) {
		for(int i = 0; i < myGarage.size(); i++) {
			if (myGarage.get(i).equals(vehicle)) {
				myGarage.remove(i);
			}
		}
	}
	
	public void showRepairBills() {
		int totalBill = 0;
		for(int i = 0; i < myGarage.size(); i++) {
			Vehicle e = (Vehicle) myGarage.get(i);
			int bill = e.calculateBill();
			String response = "Vehicle: " + e.getManufacturer() + " " + e.getModel() + " repair bill is: " + e.calculateBill();
			totalBill += bill;
			System.out.println(response);
		}
		System.out.println("Total Bill for all vehicles: $" + totalBill);
	}
	
	public void clearGarage() {
		myGarage.clear();
	}
	
	
	
	
}
