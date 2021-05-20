
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
		for(int i = 0; i < myGarage.size(); i++) {
			System.out.println(myGarage.get(i).toString());
			System.out.println(" ");
		}
	}
	
	public void showRepairBills() {
		for(int i = 0; i < myGarage.size(); i++) {
			Object myObj = myGarage.get(i);
			System.out.println(myObj);
		}
	}
	
	public void deleteVehicle(Object vehicle) {
		for(int i = 0; i < myGarage.size(); i++) {
			if (myGarage.get(i).equals(vehicle)) {
				myGarage.remove(i);
			}
		}
	}
	
	public void clearGarage() {
		myGarage.clear();
	}
	
	
	
	
}
