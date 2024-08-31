package hu.ibello.training.inheritance;

import hu.ibello.training.datatypes.Car;

public class ElectronicCar extends Car {
	
	// A leszármazott osztály saját mezői:
	
	private final int batteryCapacity;

	public ElectronicCar(String brand, int year, double price, int batteryCapacity) {
		// Az ősosztály konstruktorának hívása, ami itt kötelező,
		// mivel annak nincs alapértelmezett konstruktora.
		super(brand, year, price);
		// A saját mezők értékadása:
		this.batteryCapacity = batteryCapacity;
	}
	
	// Új metódus:
	
	public void displayBattery() {
		System.out.println("Battery: " + batteryCapacity + " kWh");
	}
	
	// Felüldefiniált metódus:
	
	@Override
	public void displayInfo() {
		// Hivatkozás az ősosztály metódusára:
		super.displayInfo();
		displayBattery();
	}

}
