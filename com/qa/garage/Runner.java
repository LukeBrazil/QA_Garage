package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car1 = new Car("Honda", "Civic", 2013);
		Vehicle boat1 = new Boat("Forerunner", "BassCatcher", 1997);
		Vehicle motorcycle1 = new Motorcycle("Ducati", "Monster", 2011);
		
		Garage myGarage1 = new Garage("Garage1");
		
		myGarage1.addVehicle(car1);
		myGarage1.addVehicle(boat1);
		myGarage1.addVehicle(motorcycle1);
		myGarage1.deleteVehicle(motorcycle1);
		myGarage1.showGarage();
		
	}

}
